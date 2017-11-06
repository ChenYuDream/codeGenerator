package org.jypj.dev.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.jypj.dev.entity.Student;
import org.jypj.dev.dao.StudentDao;
import org.jypj.dev.service.StudentService;
import org.jypj.dev.util.StringUtil;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    /**
    * 保存
    * 所有字段全都保存
    * @param student
    * @return 保存后的对象包括ID
    */
    public int saveStudent(Student student){
        if(student.getId()==null||student.getId()==""){
            String uuid =UUID.randomUUID().toString().replace("-", "").trim();
            student.setId(uuid);
        }
        return studentDao.saveStudent(student);
    }

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    public int deleteStudentById(String id){

        return studentDao.deleteStudentById(id);
    }

    /**
    * 更新
    * 更新所有字段
    * @param student
    * @return 保存后的对象包括ID
    */
    public int updateStudent(Student student){

        return studentDao.updateStudent(student);
    }

    /**
    * 按ID查询
    * @parm id 主键ID
    * @return Student
    */
    public Student selectStudentById(String id){

        return studentDao.selectStudentById(id);
    }

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<Student>
    */
    public List<Student> selectAllByMap(Map<String,Object> map){
        return studentDao.selectAllByMap(map);
    }


    /**
    * 按条件查询全部的
    * @param student  查询条件
    * @return  List<Student>
    */
    public List<Student> selectAllByStudent(Student student){

        return studentDao.selectAllByStudent(student);
    }

}