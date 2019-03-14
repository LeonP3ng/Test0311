package com.bluemsun.demo.dao;

import com.bluemsun.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface UserdaoInterface {

    //学生登录验证
    Student checkStudentLogin(@Param("studentId") int studentId, @Param("password") String password);

    //学生信息更改
    void updateStudent(Student student);

    //查询 导出信息
    Student getStudentInfo(@Param("studentId") int studentId);
}
