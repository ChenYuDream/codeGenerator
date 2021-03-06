package org.jypj.dev.main;

import java.io.File;
import java.io.IOException;
import java.util.List;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.dom4j.DocumentException;
import org.jypj.dev.generate.Config;
import org.jypj.dev.generate.Entity;
import org.jypj.dev.util.*;
import org.jypj.dev.util.InitDb.ClassNameListener;

import freemarker.template.TemplateException;

/**
 * 自动生成代码的类
 *
 * @author ChenYu
 */
public class GenerateCode {

    public static void main(String[] args) throws Exception {

        String path = System.getProperty("user.dir") + "/GenerateConfig.xml";
        final Config config = ConfigUtil.getConfig(path);

        //这里可以自行实现如何有表名得到类名,表明全小写
        List<Entity> entitys = InitDb.getInstence(config, tableName -> {
            //类名
            String className = "";

            if (StringUtil.isNotEmpty(config.getTable().getMap().get(tableName))) {
                className = config.getTable().getMap().get(tableName);
            }
            return className;
        }).initTables();

        GenerateUtil.generateDoc(entitys);


//        for (Entity entity : entitys) {
//            for (int i = 1; i <= 6; i++) {
//                GenerateUtil.AllGenerate(entity, i + "");
//            }
//        }
        System.out.println("------------生成完毕!-------------");
    }

}
