package org.jypj.dev.dao;

import org.jypj.dev.entity.StudentXyzthd;

import java.util.List;
import java.util.Map;

/**
* @author yu_chen
* @create 2017-11-06 14:53
**/
public interface StudentXyzthdDao {

    /**
    * 保存
    * 所有字段全都保存
    * @param studentXyzthd
    * @return 保存的数量
    */
    int saveStudentXyzthd(StudentXyzthd studentXyzthd);

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    int deleteStudentXyzthdById(String id);

    /**
    * 更新所有字段
    * @param studentXyzthd
    * @return 保存后的对象包括ID
    */
    int updateStudentXyzthd(StudentXyzthd studentXyzthd);

    /**
    * 按ID查询
    * @param id 主键ID
    * @return StudentXyzthd
    */
    StudentXyzthd selectStudentXyzthdById(String id);

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<StudentXyzthd>
    */
    List<StudentXyzthd> selectAllByMap(Map<String,Object> map);

}
