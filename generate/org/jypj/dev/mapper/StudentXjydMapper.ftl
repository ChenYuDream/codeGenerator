<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="org.jypj.dev.dao.StudentXjydDao" >

    <resultMap id="BaseResultMap" type="org.jypj.dev.entity.StudentXjyd" >
        <id column="ID" property="id" jdbcType="VARCHAR" />
        <result column="XSID" property="xsid" jdbcType="VARCHAR" />
        <result column="XSXM" property="xsxm" jdbcType="VARCHAR" />
        <result column="XJH" property="xjh" jdbcType="VARCHAR" />
        <result column="YNJ" property="ynj" jdbcType="VARCHAR" />
        <result column="YBH" property="ybh" jdbcType="VARCHAR" />
        <result column="YXQID" property="yxqid" jdbcType="VARCHAR" />
        <result column="SPWH" property="spwh" jdbcType="VARCHAR" />
        <result column="SPRQ" property="sprq" jdbcType="DATE" />
        <result column="YDYY" property="ydyy" jdbcType="VARCHAR" />
        <result column="YDQXXXID" property="ydqxxxid" jdbcType="VARCHAR" />
        <result column="YDRQ" property="ydrq" jdbcType="DATE" />
        <result column="YDLYXXID" property="ydlyxxid" jdbcType="VARCHAR" />
        <result column="YDLB" property="ydlb" jdbcType="VARCHAR" />
        <result column="YDSM" property="ydsm" jdbcType="VARCHAR" />
        <result column="QXXQID" property="qxxqid" jdbcType="VARCHAR" />
        <result column="XNJ" property="xnj" jdbcType="VARCHAR" />
        <result column="XBH" property="xbh" jdbcType="VARCHAR" />
    </resultMap>
  
    <sql id="Base_Column_List" >
        ID,XSID,XSXM,XJH,YNJ,YBH,YXQID,SPWH,SPRQ,YDYY,YDQXXXID,YDRQ,YDLYXXID,YDLB,YDSM,QXXQID,XNJ,XBH
    </sql>
  
    <insert id="saveStudentXjyd" parameterType="org.jypj.dev.entity.StudentXjyd" >
        insert into zxxs_xjyd (
        ID,
        XSID,
        XSXM,
        XJH,
        YNJ,
        YBH,
        YXQID,
        SPWH,
        SPRQ,
        YDYY,
        YDQXXXID,
        YDRQ,
        YDLYXXID,
        YDLB,
        YDSM,
        QXXQID,
        XNJ,
         XBH
        )
        values (
        #{id,jdbcType=VARCHAR},
        #{xsid,jdbcType=VARCHAR},
        #{xsxm,jdbcType=VARCHAR},
        #{xjh,jdbcType=VARCHAR},
        #{ynj,jdbcType=VARCHAR},
        #{ybh,jdbcType=VARCHAR},
        #{yxqid,jdbcType=VARCHAR},
        #{spwh,jdbcType=VARCHAR},
        #{sprq,jdbcType=DATE},
        #{ydyy,jdbcType=VARCHAR},
        #{ydqxxxid,jdbcType=VARCHAR},
        #{ydrq,jdbcType=DATE},
        #{ydlyxxid,jdbcType=VARCHAR},
        #{ydlb,jdbcType=VARCHAR},
        #{ydsm,jdbcType=VARCHAR},
        #{qxxqid,jdbcType=VARCHAR},
        #{xnj,jdbcType=VARCHAR},
        #{xbh,jdbcType=VARCHAR}
        )
    </insert>
  
    <delete id="deleteStudentXjydById" parameterType="java.lang.String" >
        delete from zxxs_xjyd
        where ID = #{id,jdbcType=VARCHAR}
    </delete>

    <update id="updateStudentXjyd" parameterType="org.jypj.dev.entity.StudentXjyd" >
        update zxxs_xjyd
        <set >
        ID=#{id,jdbcType=VARCHAR},
        XSID=#{xsid,jdbcType=VARCHAR},
        XSXM=#{xsxm,jdbcType=VARCHAR},
        XJH=#{xjh,jdbcType=VARCHAR},
        YNJ=#{ynj,jdbcType=VARCHAR},
        YBH=#{ybh,jdbcType=VARCHAR},
        YXQID=#{yxqid,jdbcType=VARCHAR},
        SPWH=#{spwh,jdbcType=VARCHAR},
        SPRQ=#{sprq,jdbcType=DATE},
        YDYY=#{ydyy,jdbcType=VARCHAR},
        YDQXXXID=#{ydqxxxid,jdbcType=VARCHAR},
        YDRQ=#{ydrq,jdbcType=DATE},
        YDLYXXID=#{ydlyxxid,jdbcType=VARCHAR},
        YDLB=#{ydlb,jdbcType=VARCHAR},
        YDSM=#{ydsm,jdbcType=VARCHAR},
        QXXQID=#{qxxqid,jdbcType=VARCHAR},
        XNJ=#{xnj,jdbcType=VARCHAR},
        XBH=#{xbh,jdbcType=VARCHAR}
        </set>
        where ID = #{id,jdbcType=VARCHAR}
    </update>
  
    <select id="selectStudentXjydById" resultMap="BaseResultMap" parameterType="java.lang.String" >
        select
        <include refid="Base_Column_List" />
        from zxxs_xjyd
        where ID = #{id,jdbcType=VARCHAR}
    </select>

    <select id="selectAllByMap" resultMap="BaseResultMap" parameterType="java.util.Map" >
        select
        <include refid="Base_Column_List" />
        from zxxs_xjyd
        where 1=1
    </select>


</mapper>