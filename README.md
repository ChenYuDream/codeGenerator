#简单的代码生成器
##运行环境
```
    JDK1.8
    IDEA/eclipse/cmd运行jar
```
##使用方法：
```
    运行org.jypj.dev.main.GenerateCode中的main方法
    也可导出jar包运行
```
##生成的文件
```
    项目根目录下的generate文件中
    如果配置文件中配置为<basePackage>org.jypj.dev</basePackage>
    则生成的文件基目录为\generate\org\jypj\dev\*.*
```
##数据库连接以及表名实体类配置
####目前只能生成mysql 以及oracle（使用mysql时请注释掉oracle数据库连接,oracle同理）
```
<?xml version="1.0" encoding="UTF-8"?>
<root>
    <!--oracle数据库连接 不需要配置数据库名称-->
    <jdbc type="oracle" database="">
        <param name="driverClassName">oracle.jdbc.driver.OracleDriver</param>
        <param name="url">jdbc:oracle:thin:@172.16.30.100:1521:orcl</param>
        <param name="username">eims</param>
        <param name="password">eims</param>
    </jdbc>
    <!--mysql数据库连接 type 数据库类型  dataspace 所需要生成的数据库的名字-->
    <!--<jdbc type="mysql" database="anhua">
        <param name="driverClassName">com.mysql.jdbc.Driver</param>
        <param name="url">jdbc:mysql://39.108.57.126:3306/information_schema</param>
        <param name="username">root</param>
        <param name="password">1qaz@WSX3edc$RFV</param>
    </jdbc>-->
    <!--表名和实体类映射,如果mapping为空则表名生成全部,生成规则请在main方法中编写-->
    <table>
        <mapping tableName="zxxs_jbxx" modelName="Student"/>
        <mapping tableName="Class_Grade" modelName="ClassGrade"/>
    </table>
    <!--生成类的基包-->
    <!--生成的文件路径跟基类包有关-->
    <!--当前生成文件的路径为\generate\org\jypj\dev-->
    <basePackage>org.jypj.dev</basePackage>

    <!-- 模板配置 模板文件路 生成的包名以及文件名 * 代表className 如 Student-->
    <ftl path="\\ftl\\model1">
        <param name="model" basePackageName="entity">*.java</param>
        <param name="dao" basePackageName="dao">*Dao.java</param>
        <param name="mapper" basePackageName="mapper">*Mapper.ftl</param>
        <param name="service" basePackageName="service">*Service.java</param>
        <param name="serviceImpl" basePackageName="service.impl">*ServiceImpl.java</param>
        <param name="controller" basePackageName="controller">*Controller.java</param>
    </ftl>

```
##表名和实体类映射的规则（当表名数量太多时可以使用此方法生成）
```
    //这里可以自行实现如何有表名得到类名,表明全小写
    List<Entity> entitys = InitDb.getInstence(config, tableName -> {
        //类名
        String className = "";
        if (StringUtil.isNotEmpty(config.getTable().getMap().get(tableName))) {
            className = config.getTable().getMap().get(tableName);
        }
        return className;
    }).initTables();
```