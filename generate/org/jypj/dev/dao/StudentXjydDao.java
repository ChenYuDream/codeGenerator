package org.jypj.dev.dao;

import org.jypj.dev.entity.StudentXjyd;

import java.util.List;
import java.util.Map;

/**
* @author yu_chen
* @create 2017-11-06 14:53
**/
public interface StudentXjydDao {

    /**
    * 保存
    * 所有字段全都保存
    * @param studentXjyd
    * @return 保存的数量
    */
    int saveStudentXjyd(StudentXjyd studentXjyd);

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    int deleteStudentXjydById(String id);

    /**
    * 更新所有字段
    * @param studentXjyd
    * @return 保存后的对象包括ID
    */
    int updateStudentXjyd(StudentXjyd studentXjyd);

    /**
    * 按ID查询
    * @param id 主键ID
    * @return StudentXjyd
    */
    StudentXjyd selectStudentXjydById(String id);

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<StudentXjyd>
    */
    List<StudentXjyd> selectAllByMap(Map<String,Object> map);

}
