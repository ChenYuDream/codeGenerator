package org.jypj.dev.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.jypj.dev.entity.StudentXsjtxx;
import org.jypj.dev.dao.StudentXsjtxxDao;
import org.jypj.dev.service.StudentXsjtxxService;
import org.jypj.dev.util.StringUtil;

@Service
public class StudentXsjtxxServiceImpl implements StudentXsjtxxService {

    @Resource
    private StudentXsjtxxDao studentXsjtxxDao;

    /**
    * 保存
    * 所有字段全都保存
    * @param studentXsjtxx
    * @return 保存后的对象包括ID
    */
    public int saveStudentXsjtxx(StudentXsjtxx studentXsjtxx){
        if(studentXsjtxx.getId()==null||studentXsjtxx.getId()==""){
            String uuid =UUID.randomUUID().toString().replace("-", "").trim();
            studentXsjtxx.setId(uuid);
        }
        return studentXsjtxxDao.saveStudentXsjtxx(studentXsjtxx);
    }

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    public int deleteStudentXsjtxxById(String id){

        return studentXsjtxxDao.deleteStudentXsjtxxById(id);
    }

    /**
    * 更新
    * 更新所有字段
    * @param studentXsjtxx
    * @return 保存后的对象包括ID
    */
    public int updateStudentXsjtxx(StudentXsjtxx studentXsjtxx){

        return studentXsjtxxDao.updateStudentXsjtxx(studentXsjtxx);
    }

    /**
    * 按ID查询
    * @parm id 主键ID
    * @return StudentXsjtxx
    */
    public StudentXsjtxx selectStudentXsjtxxById(String id){

        return studentXsjtxxDao.selectStudentXsjtxxById(id);
    }

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<StudentXsjtxx>
    */
    public List<StudentXsjtxx> selectAllByMap(Map<String,Object> map){
        return studentXsjtxxDao.selectAllByMap(map);
    }


    /**
    * 按条件查询全部的
    * @param studentXsjtxx  查询条件
    * @return  List<StudentXsjtxx>
    */
    public List<StudentXsjtxx> selectAllByStudentXsjtxx(StudentXsjtxx studentXsjtxx){

        return studentXsjtxxDao.selectAllByStudentXsjtxx(studentXsjtxx);
    }

}