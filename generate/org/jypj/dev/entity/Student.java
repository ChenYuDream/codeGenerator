package org.jypj.dev.entity;

import java.util.Date;
import com.google.gson.Gson;

/**
* 学生基本信息
* @author yu_chen
* @create 2017-11-06 14:53
**/
public class Student implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

    /***/
    private String id;
    /**姓名*/
    private String xm;
    /**学籍号*/
    private String xjh;
    /**国家学籍号*/
    private String gjxjh;
    /**教育ID*/
    private String jyid;
    /**所在学校*/
    private String xxid;
    /**所在学校校区*/
    private String xqid;
    /**所在级部*/
    private String jbid;
    /**所在班级*/
    private String bjid;
    /**证件类型*/
    private String sfzlx;
    /**身份证号*/
    private String sfzjh;
    /**英文姓名*/
    private String ywxm;
    /**姓名拼音*/
    private String pyxm;
    /**曾用名*/
    private String cym;
    /**性别*/
    private String xb;
    /**出生日期*/
    private Date csrq;
    /**出生地*/
    private String csd;
    /**籍贯*/
    private String jg;
    /**民族*/
    private String mz;
    /**国籍/地区*/
    private String gj;
    /**婚姻状况*/
    private String hyzk;
    /**政治面貌*/
    private String zzmm;
    /**港澳台侨外*/
    private String gatqw;
    /**健康状况*/
    private String jkzk;
    /**信仰宗教*/
    private String xyzj;
    /**照片路径*/
    private String zplj;
    /**电子邮件*/
    private String dzyj;
    /**入学年月*/
    private String rxny;
    /**学生类别*/
    private String xslbm;
    /**户口性质*/
    private String hkxzm;
    /**户口所在地*/
    private String hkszd;
    /**是否流动人口*/
    private String sfldrk;
    /**独生子女标志*/
    private String dsznbz;
    /**现住址*/
    private String xzz;
    /**联系电话*/
    private String lxdh;
    /**血型*/
    private String xxm;
    /**学籍所在地*/
    private String xjszd;
    /**学生来源*/
    private String xsly;
    /**在校状态*/
    private String zxzt;
    /**审核标记*/
    private String flag;
    /**是否有效*/
    private String valid;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createTime;
    /**修改人*/
    private String modifyUser;
    /**修改时间*/
    private Date modifyTime;

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getXm(){
        return this.xm;
    }

    public void setXm(String xm){
        this.xm = xm;
    }
    public String getXjh(){
        return this.xjh;
    }

    public void setXjh(String xjh){
        this.xjh = xjh;
    }
    public String getGjxjh(){
        return this.gjxjh;
    }

    public void setGjxjh(String gjxjh){
        this.gjxjh = gjxjh;
    }
    public String getJyid(){
        return this.jyid;
    }

    public void setJyid(String jyid){
        this.jyid = jyid;
    }
    public String getXxid(){
        return this.xxid;
    }

    public void setXxid(String xxid){
        this.xxid = xxid;
    }
    public String getXqid(){
        return this.xqid;
    }

    public void setXqid(String xqid){
        this.xqid = xqid;
    }
    public String getJbid(){
        return this.jbid;
    }

    public void setJbid(String jbid){
        this.jbid = jbid;
    }
    public String getBjid(){
        return this.bjid;
    }

    public void setBjid(String bjid){
        this.bjid = bjid;
    }
    public String getSfzlx(){
        return this.sfzlx;
    }

    public void setSfzlx(String sfzlx){
        this.sfzlx = sfzlx;
    }
    public String getSfzjh(){
        return this.sfzjh;
    }

    public void setSfzjh(String sfzjh){
        this.sfzjh = sfzjh;
    }
    public String getYwxm(){
        return this.ywxm;
    }

    public void setYwxm(String ywxm){
        this.ywxm = ywxm;
    }
    public String getPyxm(){
        return this.pyxm;
    }

    public void setPyxm(String pyxm){
        this.pyxm = pyxm;
    }
    public String getCym(){
        return this.cym;
    }

    public void setCym(String cym){
        this.cym = cym;
    }
    public String getXb(){
        return this.xb;
    }

    public void setXb(String xb){
        this.xb = xb;
    }
    public Date getCsrq(){
        return this.csrq;
    }

    public void setCsrq(Date csrq){
        this.csrq = csrq;
    }
    public String getCsd(){
        return this.csd;
    }

    public void setCsd(String csd){
        this.csd = csd;
    }
    public String getJg(){
        return this.jg;
    }

    public void setJg(String jg){
        this.jg = jg;
    }
    public String getMz(){
        return this.mz;
    }

    public void setMz(String mz){
        this.mz = mz;
    }
    public String getGj(){
        return this.gj;
    }

    public void setGj(String gj){
        this.gj = gj;
    }
    public String getHyzk(){
        return this.hyzk;
    }

    public void setHyzk(String hyzk){
        this.hyzk = hyzk;
    }
    public String getZzmm(){
        return this.zzmm;
    }

    public void setZzmm(String zzmm){
        this.zzmm = zzmm;
    }
    public String getGatqw(){
        return this.gatqw;
    }

    public void setGatqw(String gatqw){
        this.gatqw = gatqw;
    }
    public String getJkzk(){
        return this.jkzk;
    }

    public void setJkzk(String jkzk){
        this.jkzk = jkzk;
    }
    public String getXyzj(){
        return this.xyzj;
    }

    public void setXyzj(String xyzj){
        this.xyzj = xyzj;
    }
    public String getZplj(){
        return this.zplj;
    }

    public void setZplj(String zplj){
        this.zplj = zplj;
    }
    public String getDzyj(){
        return this.dzyj;
    }

    public void setDzyj(String dzyj){
        this.dzyj = dzyj;
    }
    public String getRxny(){
        return this.rxny;
    }

    public void setRxny(String rxny){
        this.rxny = rxny;
    }
    public String getXslbm(){
        return this.xslbm;
    }

    public void setXslbm(String xslbm){
        this.xslbm = xslbm;
    }
    public String getHkxzm(){
        return this.hkxzm;
    }

    public void setHkxzm(String hkxzm){
        this.hkxzm = hkxzm;
    }
    public String getHkszd(){
        return this.hkszd;
    }

    public void setHkszd(String hkszd){
        this.hkszd = hkszd;
    }
    public String getSfldrk(){
        return this.sfldrk;
    }

    public void setSfldrk(String sfldrk){
        this.sfldrk = sfldrk;
    }
    public String getDsznbz(){
        return this.dsznbz;
    }

    public void setDsznbz(String dsznbz){
        this.dsznbz = dsznbz;
    }
    public String getXzz(){
        return this.xzz;
    }

    public void setXzz(String xzz){
        this.xzz = xzz;
    }
    public String getLxdh(){
        return this.lxdh;
    }

    public void setLxdh(String lxdh){
        this.lxdh = lxdh;
    }
    public String getXxm(){
        return this.xxm;
    }

    public void setXxm(String xxm){
        this.xxm = xxm;
    }
    public String getXjszd(){
        return this.xjszd;
    }

    public void setXjszd(String xjszd){
        this.xjszd = xjszd;
    }
    public String getXsly(){
        return this.xsly;
    }

    public void setXsly(String xsly){
        this.xsly = xsly;
    }
    public String getZxzt(){
        return this.zxzt;
    }

    public void setZxzt(String zxzt){
        this.zxzt = zxzt;
    }
    public String getFlag(){
        return this.flag;
    }

    public void setFlag(String flag){
        this.flag = flag;
    }
    public String getValid(){
        return this.valid;
    }

    public void setValid(String valid){
        this.valid = valid;
    }
    public String getCreateUser(){
        return this.createUser;
    }

    public void setCreateUser(String createUser){
        this.createUser = createUser;
    }
    public Date getCreateTime(){
        return this.createTime;
    }

    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }
    public String getModifyUser(){
        return this.modifyUser;
    }

    public void setModifyUser(String modifyUser){
        this.modifyUser = modifyUser;
    }
    public Date getModifyTime(){
        return this.modifyTime;
    }

    public void setModifyTime(Date modifyTime){
        this.modifyTime = modifyTime;
    }

    @Override
	public String toString() {

		return new Gson().toJson(this);
	}

}