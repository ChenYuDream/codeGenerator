/**
 * 25 Aug 2016
 */
package org.jypj.dev.generate;

import com.google.gson.Gson;
import org.jypj.dev.vo.BasePackage;

/**
 * @author ChenYu
 */
public class Config {

    private String basePath;// 生成文件的路径
    private String basePackage;// 基类包
    private String jdbcType;//判断是什么数据库
    private String driverClassName;// 数据库连接驱动
    private String jdbcUrl;// 数据库连接URL
    private String username; // 数据库连接用户名
    private String password;// 数据库连接密码
    private String ftlPath;// 模板的路径
    private String dataBaseName;//数据库名
    private Table table;// 要生成的表

    //model属性集合
    private BasePackage model;
    //dao属性集合
    private BasePackage dao;
    //service属性集合
    private BasePackage service;
    //serviceImpl属性集合
    private BasePackage serviceImpl;
    //controller属性集合
    private BasePackage controller;
    //mapper属性集合
    private BasePackage mapper;

    public Config() {
        this.model = new BasePackage();//model属性集合
        this.dao = new BasePackage();//dao属性集合
        this.service = new BasePackage();//service属性集合
        this.serviceImpl = new BasePackage();//serviceImpl属性集合
        this.controller = new BasePackage();//controller属性集合
        this.mapper = new BasePackage();//mapper属性集合
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFtlPath() {
        return ftlPath;
    }

    public void setFtlPath(String ftlPath) {
        this.ftlPath = ftlPath;
    }

    public BasePackage getModel() {
        return model;
    }

    public void setModel(BasePackage model) {
        this.model = model;
    }

    public BasePackage getDao() {
        return dao;
    }

    public void setDao(BasePackage dao) {
        this.dao = dao;
    }

    public BasePackage getService() {
        return service;
    }

    public void setService(BasePackage service) {
        this.service = service;
    }

    public BasePackage getServiceImpl() {
        return serviceImpl;
    }

    public void setServiceImpl(BasePackage serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    public BasePackage getController() {
        return controller;
    }

    public void setController(BasePackage controller) {
        this.controller = controller;
    }

    public BasePackage getMapper() {
        return mapper;
    }

    public void setMapper(BasePackage mapper) {
        this.mapper = mapper;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
