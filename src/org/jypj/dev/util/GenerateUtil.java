/**
 * 24 Aug 2016
 */
package org.jypj.dev.util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jypj.dev.generate.Entity;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.jypj.dev.vo.BasePackage;

/**
 * @author ChenYu
 * 自动生成的工具类
 */
public class GenerateUtil {


    /**
     * 生成数据库文档
     */
    public static void generateDoc(List<Entity> entitys) throws Exception {
        Map<String, List<Entity>> entityMap = new HashMap<>();
        Configuration cfg = new Configuration();
        //创建配置对象
        cfg.setDirectoryForTemplateLoading(new File(System.getProperty("user.dir") + File.separator + "ftl" + File.separator + "model3"));
        //得到模板对象
        Template template = cfg.getTemplate("database_doc.ftl", "utf-8");
        String newPath = System.getProperty("user.dir") + File.separator + "generate";
        //判断生成路径是否存在  不存在就创建
        PathUtil.Path_Judge_Exist(newPath);
        entityMap.put("entitys", entitys);
        PathUtil.printFileByObject(entityMap, template, newPath, "database" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss")) + ".doc");

    }

    /**
     * 根据Entity自动生成model
     *
     * @param entity 数据库对象
     * @param type   生成什么文件  1 model 2 dao 3 daoImpl 4 service 5 serviceImpl 6 controller
     * @throws IOException
     * @throws TemplateException
     */
    public static void AllGenerate(Entity entity, String type) throws IOException, TemplateException {
        Configuration cfg = new Configuration();
        //模板的的路径
        String ftlPath = entity.getFtlPath();
        //类名
        BasePackage basePackage = null;
        String className = entity.getClassName();
        //模板在类路径下的地址
        String path = System.getProperty("user.dir") + ftlPath;
        switch (type) {
            case "1":
                basePackage = makeBasePackage(entity.getModel(), className);
                break;
            case "2":
                basePackage = makeBasePackage(entity.getDao(), className);
                break;
            case "3":
                basePackage = makeBasePackage(entity.getMapper(), className);
                break;
            case "4":
                basePackage = makeBasePackage(entity.getService(), className);
                break;
            case "5":
                basePackage = makeBasePackage(entity.getServiceImpl(), className);
                break;
            case "6":
                basePackage = makeBasePackage(entity.getController(), className);
                break;
            default:
        }
        String newPath = System.getProperty("user.dir") + basePackage.getFilePath();
        //判断生成路径是否存在  不存在就创建
        PathUtil.Path_Judge_Exist(newPath);
        //创建配置对象
        cfg.setDirectoryForTemplateLoading(new File(path));
        //得到模板对象
        Template template = cfg.getTemplate(basePackage.getFtlName(), "utf-8");
        PathUtil.printFileByObject(entity, template, newPath, basePackage.getFileName());
    }

    /**
     * 根据类名初始化basePackage
     *
     * @param basePackage
     * @param className
     * @return
     */
    public static BasePackage makeBasePackage(BasePackage basePackage, String className) {
        String fileName = basePackage.getFileName().replace("*", className);
        String substring = fileName.substring(0, fileName.indexOf('.'));
        basePackage.setFileName(fileName);
        basePackage.setClazzName(substring);
        return basePackage;
    }

    public static void main(String[] args) {
        String clazzName = "StudentRjkl.java";
        String substring = clazzName.substring(0, clazzName.indexOf("."));
        System.out.println(substring);
    }
}
