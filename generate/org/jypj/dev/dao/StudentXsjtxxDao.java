package org.jypj.dev.dao;

import org.jypj.dev.entity.StudentXsjtxx;

import java.util.List;
import java.util.Map;

/**
* @author yu_chen
* @create 2017-11-06 14:53
**/
public interface StudentXsjtxxDao {

    /**
    * 保存
    * 所有字段全都保存
    * @param studentXsjtxx
    * @return 保存的数量
    */
    int saveStudentXsjtxx(StudentXsjtxx studentXsjtxx);

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    int deleteStudentXsjtxxById(String id);

    /**
    * 更新所有字段
    * @param studentXsjtxx
    * @return 保存后的对象包括ID
    */
    int updateStudentXsjtxx(StudentXsjtxx studentXsjtxx);

    /**
    * 按ID查询
    * @param id 主键ID
    * @return StudentXsjtxx
    */
    StudentXsjtxx selectStudentXsjtxxById(String id);

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<StudentXsjtxx>
    */
    List<StudentXsjtxx> selectAllByMap(Map<String,Object> map);

}
