简单的代码生成器（实体类带注释，依据表的注释）
===============
运行环境
-------
```
    JDK1.8
    IDEA/eclipse/cmd运行jar
```
使用方法：
-------
```
    运行org.jypj.dev.main.GenerateCode中的main方法
    也可导出jar包运行
```
生成的文件
-------
```
    项目根目录下的generate文件中
    如果配置文件中配置为<basePackage>org.jypj.dev</basePackage>
    则生成的文件基目录为\generate\org\jypj\dev\*.*
```
数据库连接以及表名实体类配置
-------
目前只能生成mysql 以及oracle（使用mysql时请注释掉oracle数据库连接,oracle同理）
-------
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
最终生成的代码样例
--
entity
--
```
/**
* 校园主题活动
* @author yu_chen
* @create 2017-11-07 10:24
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
    
    ...省略set get方法
    }
```
dao
---
```
package org.jypj.dev.dao;

import org.jypj.dev.entity.StudentXyzthd;

import java.util.List;
import java.util.Map;

/**
* @author yu_chen
* @create 2017-11-07 10:24
**/
public interface StudentXyzthdDao {

    /**
    * 保存
    * 所有字段全都保存
    * @param studentXyzthd
    * @return 保存的数量
    */
    int saveStudentXyzthd(StudentXyzthd studentXyzthd);

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    int deleteStudentXyzthdById(String id);

    /**
    * 更新所有字段
    * @param studentXyzthd
    * @return
    */
    int updateStudentXyzthd(StudentXyzthd studentXyzthd);

    /**
    * 按ID查询
    * @param id 主键ID
    * @return StudentXyzthd
    */
    StudentXyzthd selectStudentXyzthdById(String id);

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<StudentXyzthd>
    */
    List<StudentXyzthd> selectAllByMap(Map<String,Object> map);

}

```
mapper
--
```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="org.jypj.dev.dao.StudentXyzthdDao">

    <resultMap id="BaseResultMap" type="org.jypj.dev.entity.StudentXyzthd">
        <id column="ID" property="id" jdbcType="VARCHAR"/>
        <result column="XSID" property="xsid" jdbcType="VARCHAR"/>
        <result column="XSXM" property="xsxm" jdbcType="VARCHAR"/>
        <result column="XJH" property="xjh" jdbcType="VARCHAR"/>
        <result column="XXID" property="xxid" jdbcType="VARCHAR"/>
        <result column="XXMC" property="xxmc" jdbcType="VARCHAR"/>
        <result column="HDZT" property="hdzt" jdbcType="VARCHAR"/>
        <result column="HDKSSJ" property="hdkssj" jdbcType="DATE"/>
        <result column="HDJSSJ" property="hdjssj" jdbcType="DATE"/>
        <result column="ZDJSID" property="zdjsid" jdbcType="VARCHAR"/>
    </resultMap>

    <sql id="Base_Column_List">
        ID,XSID,XSXM,XJH,XXID,XXMC,HDZT,HDKSSJ,HDJSSJ,ZDJSID
    </sql>

    <insert id="saveStudentXyzthd" parameterType="org.jypj.dev.entity.StudentXyzthd">
        insert into zxxs_xyzthd (
            ID,
            XSID,
            XSXM,
            XJH,
            XXID,
            XXMC,
            HDZT,
            HDKSSJ,
            HDJSSJ,
            ZDJSID
        )
        values (
            #{id,jdbcType=VARCHAR},
            #{xsid,jdbcType=VARCHAR},
            #{xsxm,jdbcType=VARCHAR},
            #{xjh,jdbcType=VARCHAR},
            #{xxid,jdbcType=VARCHAR},
            #{xxmc,jdbcType=VARCHAR},
            #{hdzt,jdbcType=VARCHAR},
            #{hdkssj,jdbcType=DATE},
            #{hdjssj,jdbcType=DATE},
            #{zdjsid,jdbcType=VARCHAR}
        )
    </insert>

    <delete id="deleteStudentXyzthdById" parameterType="java.lang.String">
        delete from zxxs_xyzthd
        where ID = #{id,jdbcType=VARCHAR}
    </delete>

    <update id="updateStudentXyzthd" parameterType="org.jypj.dev.entity.StudentXyzthd">
        update zxxs_xyzthd
        <set>
            ID=#{id,jdbcType=VARCHAR},
            XSID=#{xsid,jdbcType=VARCHAR},
            XSXM=#{xsxm,jdbcType=VARCHAR},
            XJH=#{xjh,jdbcType=VARCHAR},
            XXID=#{xxid,jdbcType=VARCHAR},
            XXMC=#{xxmc,jdbcType=VARCHAR},
            HDZT=#{hdzt,jdbcType=VARCHAR},
            HDKSSJ=#{hdkssj,jdbcType=DATE},
            HDJSSJ=#{hdjssj,jdbcType=DATE},
            ZDJSID=#{zdjsid,jdbcType=VARCHAR}
        </set>
        where ID = #{id,jdbcType=VARCHAR}
    </update>

    <select id="selectStudentXyzthdById" resultMap="BaseResultMap" parameterType="java.lang.String">
        select
        <include refid="Base_Column_List"/>
        from zxxs_xyzthd
        where ID = #{id,jdbcType=VARCHAR}
    </select>

    <select id="selectAllByMap" resultMap="BaseResultMap" parameterType="java.util.Map">
        select
        <include refid="Base_Column_List"/>
        from zxxs_xyzthd
        where 1=1
    </select>
</mapper>
```
service
--
```
package org.jypj.dev.service;

import org.jypj.dev.entity.StudentXyzthd;
import java.util.List;
import java.util.Map;

/**
* @author yu_chen
* @create 2017-11-07 10:24
**/
public interface StudentXyzthdService {

	/**
	* 保存
	* 所有字段全都保存
	* @param studentXyzthd
	* @return
	*/
	int saveStudentXyzthd(StudentXyzthd studentXyzthd);

	/**
	* 根据ID删除
	* @param id 主键ID
	* @return 删除记录数
	*/
	int deleteStudentXyzthdById(String id);

	/**
	* 更新
	* 更新所有字段
	* @param studentXyzthd
	* @return
	*/
	int updateStudentXyzthd(StudentXyzthd studentXyzthd);

	/**
	* 按ID查询
	* @parm id 主键ID
	* @return StudentXyzthd
	*/
	StudentXyzthd selectStudentXyzthdById(String id);


	/**
	* 按条件查询全部的
	* @param map  查询条件
	* @return  List<StudentXyzthd>
	*/
	List<StudentXyzthd> selectAllByMap(Map<String,Object> map);

}
```
serviceImpl
----
```
package org.jypj.dev.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.jypj.dev.entity.StudentXyzthd;
import org.jypj.dev.dao.StudentXyzthdDao;
import org.jypj.dev.service.StudentXyzthdService;
import org.jypj.dev.util.StringUtil;

@Service
public class StudentXyzthdServiceImpl implements StudentXyzthdService {

    @Resource
    private StudentXyzthdDao studentXyzthdDao;

    /**
    * 保存
    * 所有字段全都保存
    * @param studentXyzthd
    * @return 保存后的对象包括ID
    */
    public int saveStudentXyzthd(StudentXyzthd studentXyzthd){
        if(studentXyzthd.getId()==null||studentXyzthd.getId()==""){
            String uuid =UUID.randomUUID().toString().replace("-", "").trim();
            studentXyzthd.setId(uuid);
        }
        return studentXyzthdDao.saveStudentXyzthd(studentXyzthd);
    }

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    public int deleteStudentXyzthdById(String id){

        return studentXyzthdDao.deleteStudentXyzthdById(id);
    }

    /**
    * 更新
    * 更新所有字段
    * @param studentXyzthd
    * @return 更新记录数
    */
    public int updateStudentXyzthd(StudentXyzthd studentXyzthd){

        return studentXyzthdDao.updateStudentXyzthd(studentXyzthd);
    }

    /**
    * 按ID查询
    * @parm id 主键ID
    * @return StudentXyzthd
    */
    public StudentXyzthd selectStudentXyzthdById(String id){

        return studentXyzthdDao.selectStudentXyzthdById(id);
    }

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<StudentXyzthd>
    */
    public List<StudentXyzthd> selectAllByMap(Map<String,Object> map){
        return studentXyzthdDao.selectAllByMap(map);
    }


    /**
    * 按条件查询全部的
    * @param studentXyzthd  查询条件
    * @return  List<StudentXyzthd>
    */
    public List<StudentXyzthd> selectAllByStudentXyzthd(StudentXyzthd studentXyzthd){

        return studentXyzthdDao.selectAllByStudentXyzthd(studentXyzthd);
    }

}
```
controller
--
```
package org.jypj.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author yu_chen
* @create 2017-11-07 10:24
**/
@Controller
@RequestMapping("studentXyzthd")
public class StudentXyzthdController {


}
```