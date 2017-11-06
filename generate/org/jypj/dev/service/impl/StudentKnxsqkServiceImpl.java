package org.jypj.dev.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.jypj.dev.entity.StudentKnxsqk;
import org.jypj.dev.dao.StudentKnxsqkDao;
import org.jypj.dev.service.StudentKnxsqkService;
import org.jypj.dev.util.StringUtil;

@Service
public class StudentKnxsqkServiceImpl implements StudentKnxsqkService {

    @Resource
    private StudentKnxsqkDao studentKnxsqkDao;

    /**
    * 保存
    * 所有字段全都保存
    * @param studentKnxsqk
    * @return 保存后的对象包括ID
    */
    public int saveStudentKnxsqk(StudentKnxsqk studentKnxsqk){
        if(studentKnxsqk.getId()==null||studentKnxsqk.getId()==""){
            String uuid =UUID.randomUUID().toString().replace("-", "").trim();
            studentKnxsqk.setId(uuid);
        }
        return studentKnxsqkDao.saveStudentKnxsqk(studentKnxsqk);
    }

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    public int deleteStudentKnxsqkById(String id){

        return studentKnxsqkDao.deleteStudentKnxsqkById(id);
    }

    /**
    * 更新
    * 更新所有字段
    * @param studentKnxsqk
    * @return 保存后的对象包括ID
    */
    public int updateStudentKnxsqk(StudentKnxsqk studentKnxsqk){

        return studentKnxsqkDao.updateStudentKnxsqk(studentKnxsqk);
    }

    /**
    * 按ID查询
    * @parm id 主键ID
    * @return StudentKnxsqk
    */
    public StudentKnxsqk selectStudentKnxsqkById(String id){

        return studentKnxsqkDao.selectStudentKnxsqkById(id);
    }

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<StudentKnxsqk>
    */
    public List<StudentKnxsqk> selectAllByMap(Map<String,Object> map){
        return studentKnxsqkDao.selectAllByMap(map);
    }


    /**
    * 按条件查询全部的
    * @param studentKnxsqk  查询条件
    * @return  List<StudentKnxsqk>
    */
    public List<StudentKnxsqk> selectAllByStudentKnxsqk(StudentKnxsqk studentKnxsqk){

        return studentKnxsqkDao.selectAllByStudentKnxsqk(studentKnxsqk);
    }

}