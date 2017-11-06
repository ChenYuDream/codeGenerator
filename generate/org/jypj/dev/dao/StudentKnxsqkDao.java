package org.jypj.dev.dao;

import org.jypj.dev.entity.StudentKnxsqk;

import java.util.List;
import java.util.Map;

/**
* @author yu_chen
* @create 2017-11-06 14:53
**/
public interface StudentKnxsqkDao {

    /**
    * 保存
    * 所有字段全都保存
    * @param studentKnxsqk
    * @return 保存的数量
    */
    int saveStudentKnxsqk(StudentKnxsqk studentKnxsqk);

    /**
    * 根据ID删除
    * @param id 主键ID
    * @return 删除记录数
    */
    int deleteStudentKnxsqkById(String id);

    /**
    * 更新所有字段
    * @param studentKnxsqk
    * @return 保存后的对象包括ID
    */
    int updateStudentKnxsqk(StudentKnxsqk studentKnxsqk);

    /**
    * 按ID查询
    * @param id 主键ID
    * @return StudentKnxsqk
    */
    StudentKnxsqk selectStudentKnxsqkById(String id);

    /**
    * 按条件查询全部的
    * @param map  查询条件
    * @return  List<StudentKnxsqk>
    */
    List<StudentKnxsqk> selectAllByMap(Map<String,Object> map);

}
