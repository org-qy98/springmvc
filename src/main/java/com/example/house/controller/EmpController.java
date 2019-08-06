package com.example.house.controller;

import com.example.house.entity.Emp;
import com.example.house.service.EmpService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yrh
 * @Date: 2019-07-29 20:31
 * @version:
 * @Wish: 愿人间永无bug！
 */
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 注册
     * @param record
     * @return
     */
    @RequestMapping("/insert")
    public int insert(Emp record){
        int result=empService.insert(record);
        return result;
    }

    /**
     * 获取session
     * @param session
     * @return
     */
    @RequestMapping("/session")
    public Object getSession(HttpSession session){
        return session.getAttribute("username");
    }
    /**
     * 登录
     * @param
     * @return
     */
    @RequestMapping("/login")
    public Object login(Emp emp,HttpServletRequest request){
        //获取表单中的用户名，和密码参数
//        String ename=map.get("eusername")+"";
//        String epassword =map.get("epassword")+"";
        System.out.println(emp.getEusername()+".............");
        System.out.println(emp.getEpassword()+"............123........");
        List<Emp> emps =  empService.queryName(emp);
        //将错误信息保存到mop中在前台获取
        Map mapTmp =new HashMap();
        String msg="";
        if(emps!=null&&emps.size()>0){
            HttpSession session=request.getSession();
            session.setAttribute("username",emps.get(0));
            msg="suc";
        }else{
            msg="用户名或者密码错误！";
        }
        mapTmp.put("msg",msg);
        //返回json的错误信息
        return mapTmp;
    }



//    @RequestMapping("/queryName")
//    public Object queryName(Integer id){
//        return empService.queryAll(id);
//    }


    @RequestMapping("/queryName")
    public Object queryname(@RequestBody  String eusername){
        System.out.println(eusername);
        return empService.queryname(eusername);
    }
}
