<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="org.jypj.dev.dao.StudentXsjtxxDao" >

    <resultMap id="BaseResultMap" type="org.jypj.dev.entity.StudentXsjtxx" >
        <id column="ID" property="id" jdbcType="VARCHAR" />
        <result column="JZID" property="jzid" jdbcType="VARCHAR" />
        <result column="XSID" property="xsid" jdbcType="VARCHAR" />
        <result column="XSXM" property="xsxm" jdbcType="VARCHAR" />
        <result column="XJH" property="xjh" jdbcType="VARCHAR" />
        <result column="GX" property="gx" jdbcType="VARCHAR" />
        <result column="CYXM" property="cyxm" jdbcType="VARCHAR" />
        <result column="CSNY" property="csny" jdbcType="DATE" />
        <result column="MZ" property="mz" jdbcType="VARCHAR" />
        <result column="GJ" property="gj" jdbcType="VARCHAR" />
        <result column="JKZK" property="jkzk" jdbcType="VARCHAR" />
        <result column="CYGZDW" property="cygzdw" jdbcType="VARCHAR" />
        <result column="CY" property="cy" jdbcType="VARCHAR" />
        <result column="ZYJSZW" property="zyjszw" jdbcType="VARCHAR" />
        <result column="ZWJB" property="zwjb" jdbcType="VARCHAR" />
        <result column="LXDH" property="lxdh" jdbcType="VARCHAR" />
        <result column="DZXX" property="dzxx" jdbcType="VARCHAR" />
        <result column="SFJHR" property="sfjhr" jdbcType="VARCHAR" />
        <result column="XB" property="xb" jdbcType="VARCHAR" />
        <result column="XL" property="xl" jdbcType="VARCHAR" />
        <result column="LXDZ" property="lxdz" jdbcType="VARCHAR" />
        <result column="FLAG" property="flag" jdbcType="VARCHAR" />
        <result column="VALID" property="valid" jdbcType="VARCHAR" />
        <result column="CREATE_USER" property="createUser" jdbcType="VARCHAR" />
        <result column="CREATE_TIME" property="createTime" jdbcType="DATE" />
        <result column="MODIFY_USER" property="modifyUser" jdbcType="VARCHAR" />
        <result column="MODIFY_TIME" property="modifyTime" jdbcType="DATE" />
    </resultMap>
  
    <sql id="Base_Column_List" >
        ID,JZID,XSID,XSXM,XJH,GX,CYXM,CSNY,MZ,GJ,JKZK,CYGZDW,CY,ZYJSZW,ZWJB,LXDH,DZXX,SFJHR,XB,XL,LXDZ,FLAG,VALID,CREATE_USER,CREATE_TIME,MODIFY_USER,MODIFY_TIME
    </sql>
  
    <insert id="saveStudentXsjtxx" parameterType="org.jypj.dev.entity.StudentXsjtxx" >
        insert into zxxs_xsjtxx (
        ID,
        JZID,
        XSID,
        XSXM,
        XJH,
        GX,
        CYXM,
        CSNY,
        MZ,
        GJ,
        JKZK,
        CYGZDW,
        CY,
        ZYJSZW,
        ZWJB,
        LXDH,
        DZXX,
        SFJHR,
        XB,
        XL,
        LXDZ,
        FLAG,
        VALID,
        CREATE_USER,
        CREATE_TIME,
        MODIFY_USER,
         MODIFY_TIME
        )
        values (
        #{id,jdbcType=VARCHAR},
        #{jzid,jdbcType=VARCHAR},
        #{xsid,jdbcType=VARCHAR},
        #{xsxm,jdbcType=VARCHAR},
        #{xjh,jdbcType=VARCHAR},
        #{gx,jdbcType=VARCHAR},
        #{cyxm,jdbcType=VARCHAR},
        #{csny,jdbcType=DATE},
        #{mz,jdbcType=VARCHAR},
        #{gj,jdbcType=VARCHAR},
        #{jkzk,jdbcType=VARCHAR},
        #{cygzdw,jdbcType=VARCHAR},
        #{cy,jdbcType=VARCHAR},
        #{zyjszw,jdbcType=VARCHAR},
        #{zwjb,jdbcType=VARCHAR},
        #{lxdh,jdbcType=VARCHAR},
        #{dzxx,jdbcType=VARCHAR},
        #{sfjhr,jdbcType=VARCHAR},
        #{xb,jdbcType=VARCHAR},
        #{xl,jdbcType=VARCHAR},
        #{lxdz,jdbcType=VARCHAR},
        #{flag,jdbcType=VARCHAR},
        #{valid,jdbcType=VARCHAR},
        #{createUser,jdbcType=VARCHAR},
        #{createTime,jdbcType=DATE},
        #{modifyUser,jdbcType=VARCHAR},
        #{modifyTime,jdbcType=DATE}
        )
    </insert>
  
    <delete id="deleteStudentXsjtxxById" parameterType="java.lang.String" >
        delete from zxxs_xsjtxx
        where ID = #{id,jdbcType=VARCHAR}
    </delete>

    <update id="updateStudentXsjtxx" parameterType="org.jypj.dev.entity.StudentXsjtxx" >
        update zxxs_xsjtxx
        <set >
        ID=#{id,jdbcType=VARCHAR},
        JZID=#{jzid,jdbcType=VARCHAR},
        XSID=#{xsid,jdbcType=VARCHAR},
        XSXM=#{xsxm,jdbcType=VARCHAR},
        XJH=#{xjh,jdbcType=VARCHAR},
        GX=#{gx,jdbcType=VARCHAR},
        CYXM=#{cyxm,jdbcType=VARCHAR},
        CSNY=#{csny,jdbcType=DATE},
        MZ=#{mz,jdbcType=VARCHAR},
        GJ=#{gj,jdbcType=VARCHAR},
        JKZK=#{jkzk,jdbcType=VARCHAR},
        CYGZDW=#{cygzdw,jdbcType=VARCHAR},
        CY=#{cy,jdbcType=VARCHAR},
        ZYJSZW=#{zyjszw,jdbcType=VARCHAR},
        ZWJB=#{zwjb,jdbcType=VARCHAR},
        LXDH=#{lxdh,jdbcType=VARCHAR},
        DZXX=#{dzxx,jdbcType=VARCHAR},
        SFJHR=#{sfjhr,jdbcType=VARCHAR},
        XB=#{xb,jdbcType=VARCHAR},
        XL=#{xl,jdbcType=VARCHAR},
        LXDZ=#{lxdz,jdbcType=VARCHAR},
        FLAG=#{flag,jdbcType=VARCHAR},
        VALID=#{valid,jdbcType=VARCHAR},
        CREATE_USER=#{createUser,jdbcType=VARCHAR},
        CREATE_TIME=#{createTime,jdbcType=DATE},
        MODIFY_USER=#{modifyUser,jdbcType=VARCHAR},
        MODIFY_TIME=#{modifyTime,jdbcType=DATE}
        </set>
        where ID = #{id,jdbcType=VARCHAR}
    </update>
  
    <select id="selectStudentXsjtxxById" resultMap="BaseResultMap" parameterType="java.lang.String" >
        select
        <include refid="Base_Column_List" />
        from zxxs_xsjtxx
        where ID = #{id,jdbcType=VARCHAR}
    </select>

    <select id="selectAllByMap" resultMap="BaseResultMap" parameterType="java.util.Map" >
        select
        <include refid="Base_Column_List" />
        from zxxs_xsjtxx
        where 1=1
    </select>


</mapper>