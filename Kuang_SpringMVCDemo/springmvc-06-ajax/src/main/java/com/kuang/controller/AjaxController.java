package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/26-15:02
 */


@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if("kuangshen".equals(name)){
            response.getWriter().write("true");
        }else{
            response.getWriter().write("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> ajax2(){
        List<User> list = new ArrayList<User>();
        list.add(new User("秦疆1号",3,"男"));
        list.add(new User("秦疆2号",3,"男"));
        list.add(new User("秦疆3号",3,"男"));
        return list; //由于@RestController注解，将list转成json格式返回
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd){
        String msg = "";
        if(name!=null){
            //判断条件从数据库查询
            if("admin".equals(name)){
                msg = "OK";
            }else{
                msg = "Invalid Username";
            }
        }
        if(pwd!=null){
            //判断条件从数据库查询
            if("123456".equals(pwd)){
                msg = "OK";
            }else{
                msg = "Invalid password";
            }
        }
        return msg;

    }

}
