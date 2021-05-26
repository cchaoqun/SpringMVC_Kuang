package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/23-15:29
 */

//代表这个类是一个控制器, 并且会被spring接管
//这个注解类中所有方法 如果返回值是String, 并且有页面可以跳转, 就会被视图解析器解析
@Controller
public class ControllerTest2 {
    //映射访问路径
    @RequestMapping("/t1")
    public String test1(Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "ControllerTest2-Annotation");
        //返回视图位置
        return "test";// /WEB-INF/jsp/hello.jsp
    }

    @RequestMapping("/t3")
    public String test3(Model model){

        model.addAttribute("msg", "test3");

        return "test";
    }



}