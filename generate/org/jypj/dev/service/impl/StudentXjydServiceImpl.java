package org.jypj.dev.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.jypj.dev.entity.StudentXjyd;
import org.jypj.dev.dao.StudentXjydDao;
import org.jypj.dev.service.StudentXjydService;
import org.jypj.dev.util.StringUtil;

@Service
public class StudentXjydServiceImpl implements StudentXjydService {

    @Resource
    private StudentXjydDao studentXjydDao;

    /**
    * 保存
    * 所有字段全都保存
    * @param studentXjyd
    * @return 保存后的对象包括ID
    */
    public int saveStudentXjyd(StudentXjyd studentXjyd){
        if(studentXjyd.getId()==null||studentXjyd.getId()==""){
            String uuid =UUID.randomUUID().toString().replace("-", "").trim();
            studentXjyd.setId(uuid);
        }
        return studentXjydDao.saveStudentXjyd(studentXjyd);
    }

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    public int deleteStudentXjydById(String id){

        return studentXjydDao.deleteStudentXjydById(id);
    }

    /**
    * 更新
    * 更新所有字段
    * @param studentXjyd
    * @return 保存后的对象包括ID
    */
    public int updateStudentXjyd(StudentXjyd studentXjyd){

        return studentXjydDao.updateStudentXjyd(studentXjyd);
    }

    /**
    * 按ID查询
    * @parm id 主键ID
    * @return StudentXjyd
    */
    public StudentXjyd selectStudentXjydById(String id){

        return studentXjydDao.selectStudentXjydById(id);
    }

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<StudentXjyd>
    */
    public List<StudentXjyd> selectAllByMap(Map<String,Object> map){
        return studentXjydDao.selectAllByMap(map);
    }


    /**
    * 按条件查询全部的
    * @param studentXjyd  查询条件
    * @return  List<StudentXjyd>
    */
    public List<StudentXjyd> selectAllByStudentXjyd(StudentXjyd studentXjyd){

        return studentXjydDao.selectAllByStudentXjyd(studentXjyd);
    }

}