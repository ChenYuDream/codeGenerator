package org.jypj.dev.generate;

/**
 * 实体类属性对象
 *
 * @author ChenYu
 */
public class Attr {

    private String field;  //生成model的字段名
    private String type; //字段类型
    private String comment; //注释
    private String jdbcField;//数据库中的字段
    private String jdbcType;//jdbc类型
    private String isPrimaryKey;//是否是主键 1是主键  0是非主键
    private String dbFieldType;//数据库中的类型
    private String dbFieldLength;//数据长度
    private String isNull;//是否可空

    public Attr() {
    }


    public Attr(String field, String type, String comment, String jdbcField, String jdbcType, String isPrimaryKey) {
        super();
        this.field = field;
        this.type = type;
        this.comment = comment;
        this.jdbcField = jdbcField;
        this.jdbcType = jdbcType;
        this.isPrimaryKey = isPrimaryKey;
    }


    public String getDbFieldType() {
        return dbFieldType;
    }

    public void setDbFieldType(String dbFieldType) {
        this.dbFieldType = dbFieldType;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType;
    }


    public String getIsPrimaryKey() {
        return isPrimaryKey;
    }


    public void setIsPrimaryKey(String isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }


    public String getJdbcField() {
        return jdbcField;
    }


    public void setJdbcField(String jdbcField) {
        this.jdbcField = jdbcField;
    }

    public String getDbFieldLength() {
        return dbFieldLength;
    }

    public void setDbFieldLength(String dbFieldLength) {
        this.dbFieldLength = dbFieldLength;
    }

    public String getIsNull() {
        return isNull;
    }

    public void setIsNull(String isNull) {
        this.isNull = isNull;
    }

    @Override
    public String toString() {
        return "Attr{" +
                "field='" + field + '\'' +
                ", type='" + type + '\'' +
                ", comment='" + comment + '\'' +
                ", jdbcField='" + jdbcField + '\'' +
                ", jdbcType='" + jdbcType + '\'' +
                ", isPrimaryKey='" + isPrimaryKey + '\'' +
                ", dbFieldType='" + dbFieldType + '\'' +
                ", dbFieldLength='" + dbFieldLength + '\'' +
                ", isNull='" + isNull + '\'' +
                '}';
    }
}
