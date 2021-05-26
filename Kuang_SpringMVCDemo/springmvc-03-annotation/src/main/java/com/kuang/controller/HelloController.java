package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/23-14:48
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg", "hello, SpringMVCAnnotation!");

        //会被视图解析器处理
        //web-inf/jsp/hello.jsp
        return "hello";
    }
}
