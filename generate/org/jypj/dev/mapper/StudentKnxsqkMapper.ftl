<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="org.jypj.dev.dao.StudentKnxsqkDao" >

    <resultMap id="BaseResultMap" type="org.jypj.dev.entity.StudentKnxsqk" >
        <id column="ID" property="id" jdbcType="VARCHAR" />
        <result column="XSID" property="xsid" jdbcType="VARCHAR" />
        <result column="XSXM" property="xsxm" jdbcType="VARCHAR" />
        <result column="XJH" property="xjh" jdbcType="VARCHAR" />
        <result column="JTRK" property="jtrk" jdbcType="DECIMAL" />
        <result column="SYRK" property="syrk" jdbcType="DECIMAL" />
        <result column="LDLRK" property="ldlrk" jdbcType="DECIMAL" />
        <result column="JTZYSRLY" property="jtzysrly" jdbcType="VARCHAR" />
        <result column="JTRJYSR" property="jtrjysr" jdbcType="DECIMAL" />
        <result column="KNYYM" property="knyym" jdbcType="VARCHAR" />
        <result column="KNCDM" property="kncdm" jdbcType="VARCHAR" />
        <result column="JTLBM" property="jtlbm" jdbcType="VARCHAR" />
        <result column="RXQHKLB" property="rxqhklb" jdbcType="VARCHAR" />
        <result column="JXDDBX" property="jxddbx" jdbcType="DECIMAL" />
        <result column="SFDB" property="sfdb" jdbcType="VARCHAR" />
        <result column="ZMWJ" property="zmwj" jdbcType="VARCHAR" />
        <result column="SRR" property="srr" jdbcType="VARCHAR" />
        <result column="SRSJ" property="srsj" jdbcType="DATE" />
    </resultMap>
  
    <sql id="Base_Column_List" >
        ID,XSID,XSXM,XJH,JTRK,SYRK,LDLRK,JTZYSRLY,JTRJYSR,KNYYM,KNCDM,JTLBM,RXQHKLB,JXDDBX,SFDB,ZMWJ,SRR,SRSJ
    </sql>
  
    <insert id="saveStudentKnxsqk" parameterType="org.jypj.dev.entity.StudentKnxsqk" >
        insert into zxxs_knxsqk (
        ID,
        XSID,
        XSXM,
        XJH,
        JTRK,
        SYRK,
        LDLRK,
        JTZYSRLY,
        JTRJYSR,
        KNYYM,
        KNCDM,
        JTLBM,
        RXQHKLB,
        JXDDBX,
        SFDB,
        ZMWJ,
        SRR,
         SRSJ
        )
        values (
        #{id,jdbcType=VARCHAR},
        #{xsid,jdbcType=VARCHAR},
        #{xsxm,jdbcType=VARCHAR},
        #{xjh,jdbcType=VARCHAR},
        #{jtrk,jdbcType=DECIMAL},
        #{syrk,jdbcType=DECIMAL},
        #{ldlrk,jdbcType=DECIMAL},
        #{jtzysrly,jdbcType=VARCHAR},
        #{jtrjysr,jdbcType=DECIMAL},
        #{knyym,jdbcType=VARCHAR},
        #{kncdm,jdbcType=VARCHAR},
        #{jtlbm,jdbcType=VARCHAR},
        #{rxqhklb,jdbcType=VARCHAR},
        #{jxddbx,jdbcType=DECIMAL},
        #{sfdb,jdbcType=VARCHAR},
        #{zmwj,jdbcType=VARCHAR},
        #{srr,jdbcType=VARCHAR},
        #{srsj,jdbcType=DATE}
        )
    </insert>
  
    <delete id="deleteStudentKnxsqkById" parameterType="java.lang.String" >
        delete from zxxs_knxsqk
        where ID = #{id,jdbcType=VARCHAR}
    </delete>

    <update id="updateStudentKnxsqk" parameterType="org.jypj.dev.entity.StudentKnxsqk" >
        update zxxs_knxsqk
        <set >
        ID=#{id,jdbcType=VARCHAR},
        XSID=#{xsid,jdbcType=VARCHAR},
        XSXM=#{xsxm,jdbcType=VARCHAR},
        XJH=#{xjh,jdbcType=VARCHAR},
        JTRK=#{jtrk,jdbcType=DECIMAL},
        SYRK=#{syrk,jdbcType=DECIMAL},
        LDLRK=#{ldlrk,jdbcType=DECIMAL},
        JTZYSRLY=#{jtzysrly,jdbcType=VARCHAR},
        JTRJYSR=#{jtrjysr,jdbcType=DECIMAL},
        KNYYM=#{knyym,jdbcType=VARCHAR},
        KNCDM=#{kncdm,jdbcType=VARCHAR},
        JTLBM=#{jtlbm,jdbcType=VARCHAR},
        RXQHKLB=#{rxqhklb,jdbcType=VARCHAR},
        JXDDBX=#{jxddbx,jdbcType=DECIMAL},
        SFDB=#{sfdb,jdbcType=VARCHAR},
        ZMWJ=#{zmwj,jdbcType=VARCHAR},
        SRR=#{srr,jdbcType=VARCHAR},
        SRSJ=#{srsj,jdbcType=DATE}
        </set>
        where ID = #{id,jdbcType=VARCHAR}
    </update>
  
    <select id="selectStudentKnxsqkById" resultMap="BaseResultMap" parameterType="java.lang.String" >
        select
        <include refid="Base_Column_List" />
        from zxxs_knxsqk
        where ID = #{id,jdbcType=VARCHAR}
    </select>

    <select id="selectAllByMap" resultMap="BaseResultMap" parameterType="java.util.Map" >
        select
        <include refid="Base_Column_List" />
        from zxxs_knxsqk
        where 1=1
    </select>


</mapper>