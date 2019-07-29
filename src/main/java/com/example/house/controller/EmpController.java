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

import java.util.HashMap;
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

    @RequestMapping("/insert")
    public int insert(Emp record){
        int result=empService.insert(record);
        return result;
    }

    @RequestMapping("/login")
    public Object login(@RequestBody Map map){
        //获取表单中的用户名，和密码参数

        String ename=map.get("ename")+"";
        String epassword =map.get("epassword")+"";
        System.out.println(ename);
        System.out.println(epassword);

        Subject subject= SecurityUtils.getSubject();
        //声明错误信息变量
        String msg="";
        if(ename!=null&&!"".equals(ename)) {
            //密码加密
            UsernamePasswordToken token = new UsernamePasswordToken(ename, epassword);
            try {
                subject.login(token);
                msg="suc";
            } catch (AuthenticationException exception) {
                //清除session
                token.clear();
                //自定义信息
                if (UnknownAccountException.class.getName().equals(exception+"")) {
                    msg = "您输入的账号不存在~";
                } else if (IncorrectCredentialsException.class.getName().equals(exception.getClass().getName())) {
                    msg = "您输入的密码不正确~";
                } else if (LockedAccountException.class.getName().equals(exception.getClass().getName()) ){
                    msg = " 您的账号已经被锁定 无法登入系统~";
                } else {
                    msg = "账号或者密码错误~";
                }

            }
        }
        //将错误信息保存到mop中在前台获取
        Map mapTmp =new HashMap();
        mapTmp.put("msg",msg);

        //返回json的错误信息
        return mapTmp;
    }


}
