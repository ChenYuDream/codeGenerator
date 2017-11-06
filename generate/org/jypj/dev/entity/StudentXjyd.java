package org.jypj.dev.entity;

import java.util.Date;
import com.google.gson.Gson;

/**
* 学生学籍异动信息
* @author yu_chen
* @create 2017-11-06 14:53
**/
public class StudentXjyd implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

    /***/
    private String id;
    /**学生ID*/
    private String xsid;
    /**学生姓名*/
    private String xsxm;
    /**学籍号*/
    private String xjh;
    /**原年级*/
    private String ynj;
    /**原班号*/
    private String ybh;
    /**原校区ID*/
    private String yxqid;
    /**审批文号*/
    private String spwh;
    /**审批日期*/
    private Date sprq;
    /**异动原因*/
    private String ydyy;
    /**异动去向学校ID*/
    private String ydqxxxid;
    /**异动日期*/
    private Date ydrq;
    /**异动来源学校ID*/
    private String ydlyxxid;
    /***/
    private String ydlb;
    /**异动说明*/
    private String ydsm;
    /**去向校区ID*/
    private String qxxqid;
    /**现年级*/
    private String xnj;
    /**现班号*/
    private String xbh;

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
    public String getYnj(){
        return this.ynj;
    }

    public void setYnj(String ynj){
        this.ynj = ynj;
    }
    public String getYbh(){
        return this.ybh;
    }

    public void setYbh(String ybh){
        this.ybh = ybh;
    }
    public String getYxqid(){
        return this.yxqid;
    }

    public void setYxqid(String yxqid){
        this.yxqid = yxqid;
    }
    public String getSpwh(){
        return this.spwh;
    }

    public void setSpwh(String spwh){
        this.spwh = spwh;
    }
    public Date getSprq(){
        return this.sprq;
    }

    public void setSprq(Date sprq){
        this.sprq = sprq;
    }
    public String getYdyy(){
        return this.ydyy;
    }

    public void setYdyy(String ydyy){
        this.ydyy = ydyy;
    }
    public String getYdqxxxid(){
        return this.ydqxxxid;
    }

    public void setYdqxxxid(String ydqxxxid){
        this.ydqxxxid = ydqxxxid;
    }
    public Date getYdrq(){
        return this.ydrq;
    }

    public void setYdrq(Date ydrq){
        this.ydrq = ydrq;
    }
    public String getYdlyxxid(){
        return this.ydlyxxid;
    }

    public void setYdlyxxid(String ydlyxxid){
        this.ydlyxxid = ydlyxxid;
    }
    public String getYdlb(){
        return this.ydlb;
    }

    public void setYdlb(String ydlb){
        this.ydlb = ydlb;
    }
    public String getYdsm(){
        return this.ydsm;
    }

    public void setYdsm(String ydsm){
        this.ydsm = ydsm;
    }
    public String getQxxqid(){
        return this.qxxqid;
    }

    public void setQxxqid(String qxxqid){
        this.qxxqid = qxxqid;
    }
    public String getXnj(){
        return this.xnj;
    }

    public void setXnj(String xnj){
        this.xnj = xnj;
    }
    public String getXbh(){
        return this.xbh;
    }

    public void setXbh(String xbh){
        this.xbh = xbh;
    }

    @Override
	public String toString() {

		return new Gson().toJson(this);
	}

}