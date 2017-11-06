<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="org.jypj.dev.dao.StudentDao" >

    <resultMap id="BaseResultMap" type="org.jypj.dev.entity.Student" >
        <id column="ID" property="id" jdbcType="VARCHAR" />
        <result column="XM" property="xm" jdbcType="VARCHAR" />
        <result column="XJH" property="xjh" jdbcType="VARCHAR" />
        <result column="GJXJH" property="gjxjh" jdbcType="VARCHAR" />
        <result column="JYID" property="jyid" jdbcType="VARCHAR" />
        <result column="XXID" property="xxid" jdbcType="VARCHAR" />
        <result column="XQID" property="xqid" jdbcType="VARCHAR" />
        <result column="JBID" property="jbid" jdbcType="VARCHAR" />
        <result column="BJID" property="bjid" jdbcType="VARCHAR" />
        <result column="SFZLX" property="sfzlx" jdbcType="VARCHAR" />
        <result column="SFZJH" property="sfzjh" jdbcType="VARCHAR" />
        <result column="YWXM" property="ywxm" jdbcType="VARCHAR" />
        <result column="PYXM" property="pyxm" jdbcType="VARCHAR" />
        <result column="CYM" property="cym" jdbcType="VARCHAR" />
        <result column="XB" property="xb" jdbcType="VARCHAR" />
        <result column="CSRQ" property="csrq" jdbcType="DATE" />
        <result column="CSD" property="csd" jdbcType="VARCHAR" />
        <result column="JG" property="jg" jdbcType="VARCHAR" />
        <result column="MZ" property="mz" jdbcType="VARCHAR" />
        <result column="GJ" property="gj" jdbcType="VARCHAR" />
        <result column="HYZK" property="hyzk" jdbcType="VARCHAR" />
        <result column="ZZMM" property="zzmm" jdbcType="VARCHAR" />
        <result column="GATQW" property="gatqw" jdbcType="VARCHAR" />
        <result column="JKZK" property="jkzk" jdbcType="VARCHAR" />
        <result column="XYZJ" property="xyzj" jdbcType="VARCHAR" />
        <result column="ZPLJ" property="zplj" jdbcType="VARCHAR" />
        <result column="DZYJ" property="dzyj" jdbcType="VARCHAR" />
        <result column="RXNY" property="rxny" jdbcType="VARCHAR" />
        <result column="XSLBM" property="xslbm" jdbcType="VARCHAR" />
        <result column="HKXZM" property="hkxzm" jdbcType="VARCHAR" />
        <result column="HKSZD" property="hkszd" jdbcType="VARCHAR" />
        <result column="SFLDRK" property="sfldrk" jdbcType="VARCHAR" />
        <result column="DSZNBZ" property="dsznbz" jdbcType="VARCHAR" />
        <result column="XZZ" property="xzz" jdbcType="VARCHAR" />
        <result column="LXDH" property="lxdh" jdbcType="VARCHAR" />
        <result column="XXM" property="xxm" jdbcType="VARCHAR" />
        <result column="XJSZD" property="xjszd" jdbcType="VARCHAR" />
        <result column="XSLY" property="xsly" jdbcType="VARCHAR" />
        <result column="ZXZT" property="zxzt" jdbcType="VARCHAR" />
        <result column="FLAG" property="flag" jdbcType="VARCHAR" />
        <result column="VALID" property="valid" jdbcType="VARCHAR" />
        <result column="CREATE_USER" property="createUser" jdbcType="VARCHAR" />
        <result column="CREATE_TIME" property="createTime" jdbcType="DATE" />
        <result column="MODIFY_USER" property="modifyUser" jdbcType="VARCHAR" />
        <result column="MODIFY_TIME" property="modifyTime" jdbcType="DATE" />
    </resultMap>
  
    <sql id="Base_Column_List" >
        ID,XM,XJH,GJXJH,JYID,XXID,XQID,JBID,BJID,SFZLX,SFZJH,YWXM,PYXM,CYM,XB,CSRQ,CSD,JG,MZ,GJ,HYZK,ZZMM,GATQW,JKZK,XYZJ,ZPLJ,DZYJ,RXNY,XSLBM,HKXZM,HKSZD,SFLDRK,DSZNBZ,XZZ,LXDH,XXM,XJSZD,XSLY,ZXZT,FLAG,VALID,CREATE_USER,CREATE_TIME,MODIFY_USER,MODIFY_TIME
    </sql>
  
    <insert id="saveStudent" parameterType="org.jypj.dev.entity.Student" >
        insert into zxxs_jbxx (
        ID,
        XM,
        XJH,
        GJXJH,
        JYID,
        XXID,
        XQID,
        JBID,
        BJID,
        SFZLX,
        SFZJH,
        YWXM,
        PYXM,
        CYM,
        XB,
        CSRQ,
        CSD,
        JG,
        MZ,
        GJ,
        HYZK,
        ZZMM,
        GATQW,
        JKZK,
        XYZJ,
        ZPLJ,
        DZYJ,
        RXNY,
        XSLBM,
        HKXZM,
        HKSZD,
        SFLDRK,
        DSZNBZ,
        XZZ,
        LXDH,
        XXM,
        XJSZD,
        XSLY,
        ZXZT,
        FLAG,
        VALID,
        CREATE_USER,
        CREATE_TIME,
        MODIFY_USER,
         MODIFY_TIME
        )
        values (
        #{id,jdbcType=VARCHAR},
        #{xm,jdbcType=VARCHAR},
        #{xjh,jdbcType=VARCHAR},
        #{gjxjh,jdbcType=VARCHAR},
        #{jyid,jdbcType=VARCHAR},
        #{xxid,jdbcType=VARCHAR},
        #{xqid,jdbcType=VARCHAR},
        #{jbid,jdbcType=VARCHAR},
        #{bjid,jdbcType=VARCHAR},
        #{sfzlx,jdbcType=VARCHAR},
        #{sfzjh,jdbcType=VARCHAR},
        #{ywxm,jdbcType=VARCHAR},
        #{pyxm,jdbcType=VARCHAR},
        #{cym,jdbcType=VARCHAR},
        #{xb,jdbcType=VARCHAR},
        #{csrq,jdbcType=DATE},
        #{csd,jdbcType=VARCHAR},
        #{jg,jdbcType=VARCHAR},
        #{mz,jdbcType=VARCHAR},
        #{gj,jdbcType=VARCHAR},
        #{hyzk,jdbcType=VARCHAR},
        #{zzmm,jdbcType=VARCHAR},
        #{gatqw,jdbcType=VARCHAR},
        #{jkzk,jdbcType=VARCHAR},
        #{xyzj,jdbcType=VARCHAR},
        #{zplj,jdbcType=VARCHAR},
        #{dzyj,jdbcType=VARCHAR},
        #{rxny,jdbcType=VARCHAR},
        #{xslbm,jdbcType=VARCHAR},
        #{hkxzm,jdbcType=VARCHAR},
        #{hkszd,jdbcType=VARCHAR},
        #{sfldrk,jdbcType=VARCHAR},
        #{dsznbz,jdbcType=VARCHAR},
        #{xzz,jdbcType=VARCHAR},
        #{lxdh,jdbcType=VARCHAR},
        #{xxm,jdbcType=VARCHAR},
        #{xjszd,jdbcType=VARCHAR},
        #{xsly,jdbcType=VARCHAR},
        #{zxzt,jdbcType=VARCHAR},
        #{flag,jdbcType=VARCHAR},
        #{valid,jdbcType=VARCHAR},
        #{createUser,jdbcType=VARCHAR},
        #{createTime,jdbcType=DATE},
        #{modifyUser,jdbcType=VARCHAR},
        #{modifyTime,jdbcType=DATE}
        )
    </insert>
  
    <delete id="deleteStudentById" parameterType="java.lang.String" >
        delete from zxxs_jbxx
        where ID = #{id,jdbcType=VARCHAR}
    </delete>

    <update id="updateStudent" parameterType="org.jypj.dev.entity.Student" >
        update zxxs_jbxx
        <set >
        ID=#{id,jdbcType=VARCHAR},
        XM=#{xm,jdbcType=VARCHAR},
        XJH=#{xjh,jdbcType=VARCHAR},
        GJXJH=#{gjxjh,jdbcType=VARCHAR},
        JYID=#{jyid,jdbcType=VARCHAR},
        XXID=#{xxid,jdbcType=VARCHAR},
        XQID=#{xqid,jdbcType=VARCHAR},
        JBID=#{jbid,jdbcType=VARCHAR},
        BJID=#{bjid,jdbcType=VARCHAR},
        SFZLX=#{sfzlx,jdbcType=VARCHAR},
        SFZJH=#{sfzjh,jdbcType=VARCHAR},
        YWXM=#{ywxm,jdbcType=VARCHAR},
        PYXM=#{pyxm,jdbcType=VARCHAR},
        CYM=#{cym,jdbcType=VARCHAR},
        XB=#{xb,jdbcType=VARCHAR},
        CSRQ=#{csrq,jdbcType=DATE},
        CSD=#{csd,jdbcType=VARCHAR},
        JG=#{jg,jdbcType=VARCHAR},
        MZ=#{mz,jdbcType=VARCHAR},
        GJ=#{gj,jdbcType=VARCHAR},
        HYZK=#{hyzk,jdbcType=VARCHAR},
        ZZMM=#{zzmm,jdbcType=VARCHAR},
        GATQW=#{gatqw,jdbcType=VARCHAR},
        JKZK=#{jkzk,jdbcType=VARCHAR},
        XYZJ=#{xyzj,jdbcType=VARCHAR},
        ZPLJ=#{zplj,jdbcType=VARCHAR},
        DZYJ=#{dzyj,jdbcType=VARCHAR},
        RXNY=#{rxny,jdbcType=VARCHAR},
        XSLBM=#{xslbm,jdbcType=VARCHAR},
        HKXZM=#{hkxzm,jdbcType=VARCHAR},
        HKSZD=#{hkszd,jdbcType=VARCHAR},
        SFLDRK=#{sfldrk,jdbcType=VARCHAR},
        DSZNBZ=#{dsznbz,jdbcType=VARCHAR},
        XZZ=#{xzz,jdbcType=VARCHAR},
        LXDH=#{lxdh,jdbcType=VARCHAR},
        XXM=#{xxm,jdbcType=VARCHAR},
        XJSZD=#{xjszd,jdbcType=VARCHAR},
        XSLY=#{xsly,jdbcType=VARCHAR},
        ZXZT=#{zxzt,jdbcType=VARCHAR},
        FLAG=#{flag,jdbcType=VARCHAR},
        VALID=#{valid,jdbcType=VARCHAR},
        CREATE_USER=#{createUser,jdbcType=VARCHAR},
        CREATE_TIME=#{createTime,jdbcType=DATE},
        MODIFY_USER=#{modifyUser,jdbcType=VARCHAR},
        MODIFY_TIME=#{modifyTime,jdbcType=DATE}
        </set>
        where ID = #{id,jdbcType=VARCHAR}
    </update>
  
    <select id="selectStudentById" resultMap="BaseResultMap" parameterType="java.lang.String" >
        select
        <include refid="Base_Column_List" />
        from zxxs_jbxx
        where ID = #{id,jdbcType=VARCHAR}
    </select>

    <select id="selectAllByMap" resultMap="BaseResultMap" parameterType="java.util.Map" >
        select
        <include refid="Base_Column_List" />
        from zxxs_jbxx
        where 1=1
    </select>


</mapper>