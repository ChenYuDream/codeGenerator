package org.jypj.dev.entity;

import java.util.Date;
import java.math.BigDecimal;
import com.google.gson.Gson;

/**
* 经济困难学生情况
* @author yu_chen
* @create 2017-11-06 14:53
**/
public class StudentKnxsqk implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

    /***/
    private String id;
    /**学生ID*/
    private String xsid;
    /**学生姓名*/
    private String xsxm;
    /**学籍号*/
    private String xjh;
    /**家庭人口*/
    private BigDecimal jtrk;
    /**赡养人口*/
    private BigDecimal syrk;
    /**劳动力人口*/
    private BigDecimal ldlrk;
    /**家庭主要收入来源*/
    private String jtzysrly;
    /**家庭人均月收入*/
    private BigDecimal jtrjysr;
    /**困难原因码*/
    private String knyym;
    /**困难程度码*/
    private String kncdm;
    /**家庭类别*/
    private String jtlbm;
    /**入学前户口类别*/
    private String rxqhklb;
    /**就学地低保线*/
    private BigDecimal jxddbx;
    /**是否低保*/
    private String sfdb;
    /**证明文件*/
    private String zmwj;
    /**输入人*/
    private String srr;
    /**输入时间*/
    private Date srsj;

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
    public BigDecimal getJtrk(){
        return this.jtrk;
    }

    public void setJtrk(BigDecimal jtrk){
        this.jtrk = jtrk;
    }
    public BigDecimal getSyrk(){
        return this.syrk;
    }

    public void setSyrk(BigDecimal syrk){
        this.syrk = syrk;
    }
    public BigDecimal getLdlrk(){
        return this.ldlrk;
    }

    public void setLdlrk(BigDecimal ldlrk){
        this.ldlrk = ldlrk;
    }
    public String getJtzysrly(){
        return this.jtzysrly;
    }

    public void setJtzysrly(String jtzysrly){
        this.jtzysrly = jtzysrly;
    }
    public BigDecimal getJtrjysr(){
        return this.jtrjysr;
    }

    public void setJtrjysr(BigDecimal jtrjysr){
        this.jtrjysr = jtrjysr;
    }
    public String getKnyym(){
        return this.knyym;
    }

    public void setKnyym(String knyym){
        this.knyym = knyym;
    }
    public String getKncdm(){
        return this.kncdm;
    }

    public void setKncdm(String kncdm){
        this.kncdm = kncdm;
    }
    public String getJtlbm(){
        return this.jtlbm;
    }

    public void setJtlbm(String jtlbm){
        this.jtlbm = jtlbm;
    }
    public String getRxqhklb(){
        return this.rxqhklb;
    }

    public void setRxqhklb(String rxqhklb){
        this.rxqhklb = rxqhklb;
    }
    public BigDecimal getJxddbx(){
        return this.jxddbx;
    }

    public void setJxddbx(BigDecimal jxddbx){
        this.jxddbx = jxddbx;
    }
    public String getSfdb(){
        return this.sfdb;
    }

    public void setSfdb(String sfdb){
        this.sfdb = sfdb;
    }
    public String getZmwj(){
        return this.zmwj;
    }

    public void setZmwj(String zmwj){
        this.zmwj = zmwj;
    }
    public String getSrr(){
        return this.srr;
    }

    public void setSrr(String srr){
        this.srr = srr;
    }
    public Date getSrsj(){
        return this.srsj;
    }

    public void setSrsj(Date srsj){
        this.srsj = srsj;
    }

    @Override
	public String toString() {

		return new Gson().toJson(this);
	}

}