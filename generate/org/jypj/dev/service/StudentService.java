package org.jypj.dev.service;

import org.jypj.dev.entity.Student;
import java.util.List;
import java.util.Map;

/**
* @author yu_chen
* @create 2017-11-06 14:53
**/
public interface StudentService {

	/**
	* 保存
	* 所有字段全都保存
	* @param student
	* @return
	*/
	int saveStudent(Student student);

	/**
	* 根据ID删除
	* @param id 主键ID
	* @return 删除记录数
	*/
	int deleteStudentById(String id);

	/**
	* 更新
	* 更新所有字段
	* @param student
	* @return
	*/
	int updateStudent(Student student);

	/**
	* 按ID查询
	* @parm id 主键ID
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
