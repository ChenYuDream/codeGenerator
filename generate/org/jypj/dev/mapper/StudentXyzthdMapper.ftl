<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="org.jypj.dev.dao.StudentXyzthdDao" >

    <resultMap id="BaseResultMap" type="org.jypj.dev.entity.StudentXyzthd" >
        <id column="ID" property="id" jdbcType="VARCHAR" />
        <result column="XSID" property="xsid" jdbcType="VARCHAR" />
        <result column="XSXM" property="xsxm" jdbcType="VARCHAR" />
        <result column="XJH" property="xjh" jdbcType="VARCHAR" />
        <result column="XXID" property="xxid" jdbcType="VARCHAR" />
        <result column="XXMC" property="xxmc" jdbcType="VARCHAR" />
        <result column="HDZT" property="hdzt" jdbcType="VARCHAR" />
        <result column="HDKSSJ" property="hdkssj" jdbcType="DATE" />
        <result column="HDJSSJ" property="hdjssj" jdbcType="DATE" />
        <result column="ZDJSID" property="zdjsid" jdbcType="VARCHAR" />
    </resultMap>
  
    <sql id="Base_Column_List" >
        ID,XSID,XSXM,XJH,XXID,XXMC,HDZT,HDKSSJ,HDJSSJ,ZDJSID
    </sql>
  
    <insert id="saveStudentXyzthd" parameterType="org.jypj.dev.entity.StudentXyzthd" >
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
  
    <delete id="deleteStudentXyzthdById" parameterType="java.lang.String" >
        delete from zxxs_xyzthd
        where ID = #{id,jdbcType=VARCHAR}
    </delete>

    <update id="updateStudentXyzthd" parameterType="org.jypj.dev.entity.StudentXyzthd" >
        update zxxs_xyzthd
        <set >
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
  
    <select id="selectStudentXyzthdById" resultMap="BaseResultMap" parameterType="java.lang.String" >
        select
        <include refid="Base_Column_List" />
        from zxxs_xyzthd
        where ID = #{id,jdbcType=VARCHAR}
    </select>

    <select id="selectAllByMap" resultMap="BaseResultMap" parameterType="java.util.Map" >
        select
        <include refid="Base_Column_List" />
        from zxxs_xyzthd
        where 1=1
    </select>


</mapper>