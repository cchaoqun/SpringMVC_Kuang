package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/23-16:52
 */

@Controller
public class ModelTest1 {


    @RequestMapping("/m1/t1")
    public String test(Model model){
        model.addAttribute("msg", "modeltest11");

        //转发 浏览器地址不会变化
//        return "forward:/WEB-INF/jsp/test.jsp";
        //重定向 浏览器会变地址
        //文.件[/WEB-INF/jsp/redirect1:/index.jsp.jsp] 未找到
//        return "redirect1:/index.jsp";
        return "redirect:/index.jsp";
    }
}
