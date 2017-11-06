/**
 * 25 Aug 2016
 */
package org.jypj.dev.util;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.DocumentException;
import org.jypj.dev.generate.Attr;
import org.jypj.dev.generate.Config;
import org.jypj.dev.generate.DbVo;
import org.jypj.dev.generate.Entity;

/**
 * @author ChenYu 初始化数据库类
 */
public class InitDb {

    /**
     * 配置文件对象
     */
    private Config config;

    /**
     * 基路径
     */
    private String basePath;

    /**
     * 基类包
     */
    private String basePackage;

    private ClassNameListener classNameListener;

    /**
     * 测试类
     *
     * @param args
     * @throws DocumentException
     */
    public static void main(String[] args) throws DocumentException {
        String path = System.getProperty("user.dir") + "\\GenerateConfig.xml";
        final Config config = ConfigUtil.getConfig(path);
        List<Entity> entitys = InitDb.getInstence(ConfigUtil.getConfig(path), tableName -> {
            // 类名
            String className = "";
            if (StringUtil.isNotEmpty(config.getTable().getMap().get(tableName))) {
                className = config.getTable().getMap().get(tableName);
            }
            return className;
        }).initTables();

        System.out.println(entitys);
    }

    /**
     * 构造方法
     *
     * @param config
     */
    private InitDb(Config config, ClassNameListener classNameListener) {
        super();
        System.out.println("初始化方法");
        this.config = config;
        basePath = config.getBasePath();
        basePackage = config.getBasePackage();
        this.classNameListener = classNameListener;
    }

    /**
     * 得到Init数据库实例
     *
     * @return
     */
    public static InitDb getInstence(Config config, ClassNameListener cnl) {
        return new InitDb(config, cnl);
    }

    /**
     * 从数据库查询出所需要生成的表并存放在集合中
     *
     * @return
     */
    public List<Entity> initTables() {
        StringBuffer sql = new StringBuffer();
        if ("oracle".equals(config.getJdbcType())) {
            sql.append("select tb.table_name, tc.comments from user_tables tb ,user_tab_comments tc where tb.TABLE_NAME=tc.table_name");
            if (StringUtil.isNotEmpty(config.getTable().getTableNames())) {
                sql.append(" and tb.TABLE_NAME in (" + config.getTable().getTableNames().toUpperCase() + ")");
            }
        } else if ("mysql".equals(config.getJdbcType())) {
            sql.append("SELECT table_name,table_comment FROM TABLES WHERE 1=1");
            sql.append(" and table_schema = '" + config.getDataBaseName() + "'");
            sql.append(" and table_name IN(" + config.getTable().getTableNames().toUpperCase() + ")");
        } else {
            throw new RuntimeException("数据库类型错误");

        }
        System.out.println("查询所有表信息sql：" + sql);
        JdbcUtil dbc = null;
        PreparedStatement ps = null;
        List<Entity> entitys = new ArrayList<>();
        try {
            dbc = new JdbcUtil(config);
            ps = dbc.getConnection().prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            List<DbVo> dbVos = initDbVo();
            while (rs.next()) {
                Entity entity = initEntity(rs.getString(1));
                List<Attr> attrs = getColumnsByTableName(rs.getString(1), dbVos);
                entity.setAttrs(attrs);
                entity.setClazzComments(rs.getString(2));
                entitys.add(entity);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            dbc.close();
        }

        return entitys;
    }

    private List<DbVo> initDbVo() {
        StringBuffer sb = new StringBuffer();
        if ("oracle".equals(config.getJdbcType())) {
            sb.append("select tb.table_name,tb.column_name,tb.data_type,cc.comments,(case when cu.column_name = tb.COLUMN_NAME then 'PRI' ELSE '' END) as column_key");
            sb.append(" from user_tab_columns tb");
            sb.append(" left join user_col_comments cc on tb.TABLE_NAME = cc.table_name and tb.column_name = cc.column_name");
            sb.append(" left join user_cons_columns cu on cu.table_name = tb.TABLE_NAME");
            sb.append(" left join user_constraints  au on au.constraint_name=cu.constraint_name");
            sb.append(" where 1=1 and au.constraint_type = 'P'");
            if (StringUtil.isNotEmpty(config.getTable().getTableNames())) {
                sb.append(" and tb.TABLE_NAME in (" + config.getTable().getTableNames().toUpperCase() + ")");
            }
            sb.append(" order by tb.COLUMN_ID");
        } else if ("mysql".equals(config.getJdbcType())) {
            sb.append("SELECT table_name,column_name,data_type,column_comment,column_key FROM COLUMNS WHERE 1=1");
            if (StringUtil.isNotEmpty(config.getTable().getTableNames())) {
                sb.append(" and table_schema = '" + config.getDataBaseName() + "'");
                sb.append(" and table_name in (" + config.getTable().getTableNames().toUpperCase() + ")");
            }
            sb.append(" ORDER BY ordinal_position");
        }
        System.out.println("查询所有列信息sql：" + sb.toString());
        JdbcUtil dbc = null;
        PreparedStatement ps = null;
        List<DbVo> dbs = new ArrayList<>();
        try {
            dbc = new JdbcUtil(config);
            ps = dbc.getConnection().prepareStatement(sb.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DbVo db = new DbVo();
                db.setTableName(rs.getString(1));
                db.setColumnName(rs.getString(2));
                db.setDataType(rs.getString(3));
                db.setComments(rs.getString(4));
                db.setIsPrimaryKey("PRI".equalsIgnoreCase(rs.getString(5)) ? "1" : "0");
                dbs.add(db);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            dbc.close();
        }

        return dbs;
    }

    /**
     * 根据表名初始化Entity对象
     *
     * @param tableName
     * @return
     */
    private Entity initEntity(String tableName) {
        String className = "";
        tableName = tableName.toLowerCase();
        className = classNameListener.getClassNameByTableName(tableName);
        String ftlPath = config.getFtlPath();
        Entity entity = new Entity();
        entity.setBasePackage(basePackage);
        entity.setClassName(className);
        entity.setTableName(tableName);
        entity.setFtlPath(ftlPath);
        entity.setModel(config.getModel().clone());
        entity.setDao(config.getDao().clone());
        entity.setService(config.getService().clone());
        entity.setServiceImpl(config.getServiceImpl().clone());
        entity.setMapper(config.getMapper().clone());
        entity.setController(config.getController().clone());
        return entity;
    }

    /**
     * 根据数据库集合以及表名得到该表的属性集合
     *
     * @param tableName 表名
     * @param dbs       列属性集合
     * @return
     */
    private List<Attr> getColumnsByTableName(String tableName, List<DbVo> dbs) {
        List<Attr> attrs = new ArrayList<>();
        for (DbVo db : dbs) {
            if (tableName.equals(db.getTableName())) {
                Attr attr = new Attr();
                String type = "";
                //根据数据库类型得到java类型
                switch (db.getDataType().toUpperCase()) {
                    /**
                     * ------------ORACLE 对应的
                     */
                    case "TIMESTAMP(6)":
                        type = "Date";
                        break;
                    case "NUMBER":
                        type = "BigDecimal";
                        break;
                    /**
                     * ------------mysql 对应的
                     */
                    case "TIME":
                        type = "Time";
                        break;
                    case "TIMESTAMP":
                        type = "Date";
                        break;
                    case "DATETIME":
                        type = "Date";
                        break;
                    /**
                     * ------------通用的
                     */
                    case "DATE":
                        type = "Date";
                        break;
                    case "INTEGER":
                        type = "INTEGER";
                        break;
                    case "INT":
                        type = "INTEGER";
                        break;
                    default:
                        type = "String";
                        break;
                }
                String field = "";
                String[] split = db.getColumnName().toLowerCase().split("_");
                for (int i = 0; i < split.length; i++) {
                    if (i == 0) {
                        field += split[i];
                    } else {
                        field += split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
                    }

                }
                attr.setType(type);
                attr.setField(field);
                attr.setIsPrimaryKey(db.getIsPrimaryKey());
                attr.setComment(db.getComments());
                attr.setJdbcField(db.getColumnName());
                String jdbcType = "";
                switch (type) {
                    case "INTEGER":
                        jdbcType = "INTEGER";
                        break;
                    case "Time":
                        jdbcType = "TIME";
                        break;
                    case "Timestamp":
                        jdbcType = "TIMESTAMP";
                        break;
                    case "String":
                        jdbcType = "VARCHAR";
                        break;
                    case "BigDecimal":
                        jdbcType = "DECIMAL";
                        break;
                    case "Date":
                        jdbcType = "DATE";
                        break;
                    default:
                        jdbcType = "String";
                }
                attr.setJdbcType(jdbcType);
                attrs.add(attr);
            }
        }
        return attrs;
    }

    public interface ClassNameListener {
        /**
         * 根据表明生成类名的接口 接口回调
         *
         * @param tableName 全部已经转为小写的表名 如 eims_user
         * @return className 需要生成的实体类的类名 如 User
         */
        String getClassNameByTableName(String tableName);

    }

}
