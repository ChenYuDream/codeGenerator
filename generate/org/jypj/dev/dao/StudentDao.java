package org.jypj.dev.dao;

import org.jypj.dev.entity.Student;

import java.util.List;
import java.util.Map;

/**
* @author yu_chen
* @create 2017-11-06 14:53
**/
public interface StudentDao {

    /**
    * 保存
    * 所有字段全都保存
    * @param student
    * @return 保存的数量
    */
    int saveStudent(Student student);

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    int deleteStudentById(String id);

    /**
    * 更新所有字段
    * @param student
    * @return 保存后的对象包括ID
    */
    int updateStudent(Student student);

    /**
    * 按ID查询
    * @param id 主键ID
    * @return Student
    */
    Student selectStudentById(String id);

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<Student>
    */
    List<Student> selectAllByMap(Map<String,Object> map);

}
