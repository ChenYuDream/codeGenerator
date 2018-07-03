/**
 * 25 Aug 2016
 */
package org.jypj.dev.util;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.jypj.dev.generate.Config;
import org.jypj.dev.generate.Table;
import org.jypj.dev.vo.BasePackage;

/**
 * @author ChenYu
 */
public class ConfigUtil {

    public static void main(String[] args) throws DocumentException {
        String path = System.getProperty("user.dir") + "\\GenerateConfig.xml";
        getConfig(path);
    }

    /**
     * 得到配置对象
     *
     * @param path
     * @return
     * @throws DocumentException
     */
    public static Config getConfig(String path) throws DocumentException {
        ConfigUtil cfu = new ConfigUtil();
        Document document = cfu.getDocument(path);
        Config parseXml = cfu.parseXml(document);
        System.out.println(parseXml.toString());
        return parseXml;
    }

    /**
     * 得到配置文件对象
     *
     * @return
     * @throws DocumentException
     */
    public Document getDocument(String path) throws DocumentException {
        SAXReader reader = new SAXReader();
        System.out.println(path);
        Document document = reader.read(new File(path));
        return document;
    }

    /**
     * 解析配置文件
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public Config parseXml(Document document) {
        Config cf = new Config();
        Element root = document.getRootElement();
        Element jdbc = root.element("jdbc");
        String text = jdbc.attribute("type").getText();
        String database = jdbc.attribute("database").getText();
        cf.setJdbcType(text);
        cf.setDataBaseName(database);
        List<Element> params = jdbc.elements("param");
        for (Element param : params) {
            switch (param.attribute("name").getText().trim()) {
                case "driverClassName":
                    cf.setDriverClassName(param.getTextTrim());
                    break;
                case "url":
                    cf.setJdbcUrl(param.getTextTrim());
                    break;
                case "username":
                    cf.setUsername(param.getTextTrim());
                    break;
                case "password":
                    cf.setPassword(param.getTextTrim());
                    break;
                default:
                    break;
            }
        }
        //获取基类包
        Element basePackages = root.element("basePackage");
        String basePackage = basePackages.node(0).getText().trim();
        cf.setBasePackage(basePackage);

        String basePath = "//generate//" + basePackage.replace(".", "//") + "//";
        cf.setBasePath(basePath);

        Element ftl = root.element("ftl");
        String ftlPath = ftl.attribute("path").getText();
        cf.setFtlPath(ftlPath);
        List<Element> ftlParams = ftl.elements("param");
        for (Element param : ftlParams) {
            //初始化各个包的名字文件名包名等信息
            switch (param.attribute("name").getText().trim()) {
                case "model":
                    initBasePackage(cf.getModel(), param, basePath, basePackage);
                    break;
                case "dao":
                    initBasePackage(cf.getDao(), param, basePath, basePackage);
                    break;
                case "service":
                    initBasePackage(cf.getService(), param, basePath, basePackage);
                    break;
                case "serviceImpl":
                    initBasePackage(cf.getServiceImpl(), param, basePath, basePackage);
                    break;
                case "mapper":
                    initBasePackage(cf.getMapper(), param, basePath, basePackage);
                    break;
                case "controller":
                    initBasePackage(cf.getController(), param, basePath, basePackage);
                    break;
                default:
                    break;
            }
        }
        //设置要生成的表格对象
        Table tb = new Table();
        Element table = root.element("table");
        String prefix = table.attribute("prefix") == null ? "" : table.attribute("prefix").getText();
        String suffix = table.attribute("suffix") == null ? "" : table.attribute("suffix").getText();
        List<Element> els = table.elements();
        Map<String, String> map = new HashMap<>();
        String tableNames = "";
        if (els != null && els.size() > 0) {
            for (Element element : els) {
                String tableName = element.attribute("tableName") == null ? ""
                        : element.attribute("tableName").getText();
                String modelName = element.attribute("modelName") == null ? ""
                        : element.attribute("modelName").getText();
                map.put(tableName.toLowerCase(), modelName);
                tableNames += "'" + tableName + "',";
            }
        }
        tb.setPrefix(prefix);
        tb.setSuffix(suffix);
        tb.setMap(map);
        tb.setTableNames(StringUtil.isEmpty(tableNames) ? "" : tableNames.substring(0, tableNames.length() - 1));
        cf.setTable(tb);

        return cf;
    }

    /**
     * 设置BasePackage的个别属性
     *
     * @param basePackage
     * @param param       xml节点元素
     */
    public void initBasePackage(BasePackage model, Element param, String basePath, String basePackage) {
        String basePackageName = param.attribute("basePackageName").getText().trim();
        String modelName = param.attribute("name").getText().trim();
        String fileName = param.getText().trim();
        model.setFtlName(modelName + ".ftl");
        model.setBasePackageName(basePackageName);
        model.setFileName(fileName);
        model.setFilePath(basePath + basePackageName.replace(".", "//"));
        model.setPackageName(basePackage + "." + basePackageName);
    }
}
