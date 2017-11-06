package org.jypj.dev.entity;

import java.util.Date;
import com.google.gson.Gson;

/**
* 校园主题活动
* @author yu_chen
* @create 2017-11-06 14:53
**/
public class StudentXyzthd implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

    /***/
    private String id;
    /**学生ID*/
    private String xsid;
    /**学生姓名*/
    private String xsxm;
    /**学籍号*/
    private String xjh;
    /**学校ID*/
    private String xxid;
    /**学校名称*/
    private String xxmc;
    /**活动主题*/
    private String hdzt;
    /**活动开始时间*/
    private Date hdkssj;
    /**活动结束时间*/
    private Date hdjssj;
    /**指导教师ID*/
    private String zdjsid;

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getXsid(){
        return this.xsid;
    }

    public void setXsid(String xsid){
        this.xsid = xsid;
    }
    public String getXsxm(){
        return this.xsxm;
    }

    public void setXsxm(String xsxm){
        this.xsxm = xsxm;
    }
    public String getXjh(){
        return this.xjh;
    }

    public void setXjh(String xjh){
        this.xjh = xjh;
    }
    public String getXxid(){
        return this.xxid;
    }

    public void setXxid(String xxid){
        this.xxid = xxid;
    }
    public String getXxmc(){
        return this.xxmc;
    }

    public void setXxmc(String xxmc){
        this.xxmc = xxmc;
    }
    public String getHdzt(){
        return this.hdzt;
    }

    public void setHdzt(String hdzt){
        this.hdzt = hdzt;
    }
    public Date getHdkssj(){
        return this.hdkssj;
    }

    public void setHdkssj(Date hdkssj){
        this.hdkssj = hdkssj;
    }
    public Date getHdjssj(){
        return this.hdjssj;
    }

    public void setHdjssj(Date hdjssj){
        this.hdjssj = hdjssj;
    }
    public String getZdjsid(){
        return this.zdjsid;
    }

    public void setZdjsid(String zdjsid){
        this.zdjsid = zdjsid;
    }

    @Override
	public String toString() {

		return new Gson().toJson(this);
	}

}