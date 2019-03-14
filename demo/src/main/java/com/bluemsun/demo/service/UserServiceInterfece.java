package com.bluemsun.demo.service;


import com.bluemsun.demo.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface UserServiceInterfece {
    //学生登录验证
    Student checkStudentLogin(int studentId,String password);

    //学生信息更改
    void updateStudent(Student student);

    //查询 导出信息
    Student getStudentInfo(int studentId);

}
