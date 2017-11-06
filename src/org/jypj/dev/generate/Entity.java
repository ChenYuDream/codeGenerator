/**
 * 24 Aug 2016
 */
package org.jypj.dev.generate;

import java.util.List;

import com.google.gson.Gson;
import org.jypj.dev.vo.BasePackage;

/**
 * @author ChenYu 一个数据库表所具有的属性
 */
public class Entity {
    /**
     * 实体类的类名
     */
    private String className;
    /**
     * 实体类对应的数据库表名
     */
    private String tableName;
    /**
     * 基类包
     */
    private String basePackage;
    /**
     * 模板的路径
     */
    private String ftlPath;
    /**
     * 表注释
     */
    private String clazzComments;

    /**
     * model属性集合
     */
    private BasePackage model;
    /**
     * dao属性集合
     */
    private BasePackage dao;
    /**
     * service属性集合
     */
    private BasePackage service;
    /**
     * serviceImpl属性集合
     */
    private BasePackage serviceImpl;
    /**
     * controller属性集合
     */
    private BasePackage controller;
    /**
     * mapper属性集合
     */
    private BasePackage mapper;

    /**
     * 实体类的属性集合
     */
    private List<Attr> attrs;

    public Entity() {
        //model属性集合
        this.model = new BasePackage();
        //dao属性集合
        this.dao = new BasePackage();
        //service属性集合
        this.service = new BasePackage();
        //serviceImpl属性集合
        this.serviceImpl = new BasePackage();
        //controller属性集合
        this.controller = new BasePackage();
        //mapper属性集合
        this.mapper = new BasePackage();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getClazzComments() {
        return clazzComments;
    }

    public void setClazzComments(String clazzComments) {
        this.clazzComments = clazzComments;
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

    public List<Attr> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<Attr> attrs) {
        this.attrs = attrs;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
