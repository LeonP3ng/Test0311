package com.bluemsun.demo.service.serviceImple;


import com.bluemsun.demo.dao.UserdaoInterface;
import com.bluemsun.demo.entity.Student;
import com.bluemsun.demo.service.UserServiceInterfece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImple implements UserServiceInterfece {

    /**
     *
     */
    @Resource
    UserdaoInterface userdaoInterface;

    @Override
    public Student checkStudentLogin(int studentId, String password) {
        System.out.println("service come in");
        System.out.println("id :" + studentId + "password :" + password);
        return userdaoInterface.checkStudentLogin(studentId, password);
    }

    @Override
    public void updateStudent(Student student) {
        userdaoInterface.updateStudent(student);
    }

    @Override
    public Student getStudentInfo(int studentId) {
        return userdaoInterface.getStudentInfo(studentId);
    }
}
