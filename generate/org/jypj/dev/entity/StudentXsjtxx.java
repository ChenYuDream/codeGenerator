package org.jypj.dev.entity;

import java.util.Date;
import com.google.gson.Gson;

/**
* 学生家庭信息表
* @author yu_chen
* @create 2017-11-06 14:53
**/
public class StudentXsjtxx implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

    /***/
    private String id;
    /**家长ID*/
    private String jzid;
    /**学生ID*/
    private String xsid;
    /**学生姓名*/
    private String xsxm;
    /**学籍号*/
    private String xjh;
    /**关系（父子或者母子）*/
    private String gx;
    /**成员姓名*/
    private String cyxm;
    /**出生年月*/
    private Date csny;
    /**民族*/
    private String mz;
    /**国籍*/
    private String gj;
    /**健康状况*/
    private String jkzk;
    /**成员工作单位*/
    private String cygzdw;
    /**从业*/
    private String cy;
    /**专业技术职务*/
    private String zyjszw;
    /**职务级别*/
    private String zwjb;
    /**联系电话*/
    private String lxdh;
    /**电子信箱*/
    private String dzxx;
    /**是否监护人*/
    private String sfjhr;
    /***/
    private String xb;
    /**学历*/
    private String xl;
    /**联系地址*/
    private String lxdz;
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
    public String getJzid(){
        return this.jzid;
    }

    public void setJzid(String jzid){
        this.jzid = jzid;
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
    public String getGx(){
        return this.gx;
    }

    public void setGx(String gx){
        this.gx = gx;
    }
    public String getCyxm(){
        return this.cyxm;
    }

    public void setCyxm(String cyxm){
        this.cyxm = cyxm;
    }
    public Date getCsny(){
        return this.csny;
    }

    public void setCsny(Date csny){
        this.csny = csny;
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
    public String getJkzk(){
        return this.jkzk;
    }

    public void setJkzk(String jkzk){
        this.jkzk = jkzk;
    }
    public String getCygzdw(){
        return this.cygzdw;
    }

    public void setCygzdw(String cygzdw){
        this.cygzdw = cygzdw;
    }
    public String getCy(){
        return this.cy;
    }

    public void setCy(String cy){
        this.cy = cy;
    }
    public String getZyjszw(){
        return this.zyjszw;
    }

    public void setZyjszw(String zyjszw){
        this.zyjszw = zyjszw;
    }
    public String getZwjb(){
        return this.zwjb;
    }

    public void setZwjb(String zwjb){
        this.zwjb = zwjb;
    }
    public String getLxdh(){
        return this.lxdh;
    }

    public void setLxdh(String lxdh){
        this.lxdh = lxdh;
    }
    public String getDzxx(){
        return this.dzxx;
    }

    public void setDzxx(String dzxx){
        this.dzxx = dzxx;
    }
    public String getSfjhr(){
        return this.sfjhr;
    }

    public void setSfjhr(String sfjhr){
        this.sfjhr = sfjhr;
    }
    public String getXb(){
        return this.xb;
    }

    public void setXb(String xb){
        this.xb = xb;
    }
    public String getXl(){
        return this.xl;
    }

    public void setXl(String xl){
        this.xl = xl;
    }
    public String getLxdz(){
        return this.lxdz;
    }

    public void setLxdz(String lxdz){
        this.lxdz = lxdz;
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