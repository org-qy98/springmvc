package com.example.house.util;

import com.example.house.entity.Emp;
import com.example.house.service.EmpService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yrh
 * @Date: 2019-07-29 20:45
 * @version:
 * @Wish: 愿人间永无bug！
 */
public class MyShiroRealm extends AuthorizingRealm implements Serializable {

    @Autowired
    private EmpService empService;

    /**
     * 登录认证
     * 1、authenticationInfo：获取认证消息，如果数据库中没有，返回null，如果得到正确的用户名和密码
     * 2、AuthenticationInfo  可用simpleAuthenticationInfo实现类，封装获取到的正确的账号和密码
     * 返回正确类型的对象
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取username
        String eusername = (String)token.getPrincipal();
        Session session = SecurityUtils.getSubject().getSession();
        Map map = new HashMap();
        map.put("eusername",eusername);
//        map.put("start",0);
//        map.put("pageSize",100);
        //通过username查询密码
        List<Map> emps = empService.queryByEname(map);
        System.out.println(emps);
        Map emp =null;
        //如果密码不为空时，取第一条
        if(emps!=null&&emps.size()>0){
            emp = emps.get(0);
        }
        //如果密码为空时，抛出异常
        if(emp==null) {
            throw  new UnknownAccountException(); //账号不存在异常
        }
		/*if (0==user.getEnable()) {
			throw new LockedAccountException(); // 帐号锁定
		}*/
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                emp,//用户名
                emp.get("epassword"),//密码
                "MyRealm"//realm name
        );
        //设置盐
        //authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(user.getSalt()));
        //当验证信息都通过后，把用户信息放在session里

        session.setAttribute("emp",emp);

        //session.setAttribute("userSessionId",user.getId());
        return authenticationInfo;
    }

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //全局通过SecurityUtils.getSubject().getPrincipal()获取用户信息
        Emp userInfo = (Emp) SecurityUtils.getSubject().getPrincipal();
        //通过用户名查出来角色
        //List<String> strings = userInfoService.selectRole(userInfo.getUserName());
        // 权限信息对象info,用来存放查出的用户的所有的角色（role）
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		/*for(String role:strings){
			//角色名称
			System.out.println(role);
			info.addStringPermission(role);
		}*/
        //返回角色名称
        return info;
    }
}
