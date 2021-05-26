package com.kuang.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/23-14:16
 */

public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //业务代码
        String res = "helloSpringMVC";

        mv.addObject("msg", res);

        //视图跳转
        mv.setViewName("test");

        return mv;
    }
}
