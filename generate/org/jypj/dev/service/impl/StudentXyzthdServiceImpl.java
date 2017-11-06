package org.jypj.dev.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.jypj.dev.entity.StudentXyzthd;
import org.jypj.dev.dao.StudentXyzthdDao;
import org.jypj.dev.service.StudentXyzthdService;
import org.jypj.dev.util.StringUtil;

@Service
public class StudentXyzthdServiceImpl implements StudentXyzthdService {

    @Resource
    private StudentXyzthdDao studentXyzthdDao;

    /**
    * 保存
    * 所有字段全都保存
    * @param studentXyzthd
    * @return 保存后的对象包括ID
    */
    public int saveStudentXyzthd(StudentXyzthd studentXyzthd){
        if(studentXyzthd.getId()==null||studentXyzthd.getId()==""){
            String uuid =UUID.randomUUID().toString().replace("-", "").trim();
            studentXyzthd.setId(uuid);
        }
        return studentXyzthdDao.saveStudentXyzthd(studentXyzthd);
    }

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    public int deleteStudentXyzthdById(String id){

        return studentXyzthdDao.deleteStudentXyzthdById(id);
    }

    /**
    * 更新
    * 更新所有字段
    * @param studentXyzthd
    * @return 保存后的对象包括ID
    */
    public int updateStudentXyzthd(StudentXyzthd studentXyzthd){

        return studentXyzthdDao.updateStudentXyzthd(studentXyzthd);
    }

    /**
    * 按ID查询
    * @parm id 主键ID
    * @return StudentXyzthd
    */
    public StudentXyzthd selectStudentXyzthdById(String id){

        return studentXyzthdDao.selectStudentXyzthdById(id);
    }

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<StudentXyzthd>
    */
    public List<StudentXyzthd> selectAllByMap(Map<String,Object> map){
        return studentXyzthdDao.selectAllByMap(map);
    }


    /**
    * 按条件查询全部的
    * @param studentXyzthd  查询条件
    * @return  List<StudentXyzthd>
    */
    public List<StudentXyzthd> selectAllByStudentXyzthd(StudentXyzthd studentXyzthd){

        return studentXyzthdDao.selectAllByStudentXyzthd(studentXyzthd);
    }

}