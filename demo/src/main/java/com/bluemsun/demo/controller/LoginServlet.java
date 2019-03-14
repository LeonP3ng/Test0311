package com.bluemsun.demo.controller;


import com.bluemsun.demo.annotation.Anno;
import com.bluemsun.demo.entity.Student;
import com.bluemsun.demo.service.UserServiceInterfece;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginServlet {

    @Autowired
    UserServiceInterfece userServiceInterfece;


//    //判断登录类型 1 学生 2 公司 3 教师/学校/竞赛承办机构 4 教育部
//    @RequestMapping("/login")
//    public void judgeType(HttpServletRequest request,@RequestParam("rating") int flag){
//        if ( flag == 1) {
//            stuLogin(request,);
//        }
//
//    }



    @RequestMapping(value = "/student",method = RequestMethod.POST)
    @ResponseBody
    @Anno(operationName = "学生登录", operationType = "select操作")
    public Map<String,Integer> stuLogin(HttpServletRequest request, @RequestParam("studentId") int studentId, @RequestParam("password")String password) throws IOException {


        System.out.println("hello login!");
        Student student = userServiceInterfece.checkStudentLogin(studentId, password);
        Map<String,Integer> result = new HashMap<String, Integer>();

        if (student != null){
            request.getSession().setAttribute("student",student);
            result.put("stateCode",1);
        }
        else {
            result.put("stateCode",0);
        }


        System.out.println("hello login12312!");
        return result;



    }
}
