package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/23-15:48
 */

@Controller
@RequestMapping("/c3")
public class ControllerTest3 {

    @RequestMapping("/t1")
    public String test1(Model model){

        
        model.addAttribute("msg", "ControllerTest3 c3/t1");

        return "test";
    }
}
