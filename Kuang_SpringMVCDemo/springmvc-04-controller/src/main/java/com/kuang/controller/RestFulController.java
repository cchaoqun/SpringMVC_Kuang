package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/23-16:01
 */

@Controller
public class RestFulController {

    //原始传参风格:   http://localhost:8080/springmvc_04_controller_war_exploded/add?a=1&b=2

    //安全 
    //Restful风格:    http://localhost:8080/springmvc_04_controller_war_exploded/add/a/b

    // http://localhost:8080/add/1/2
    @RequestMapping(value="/add/{a}/{b}", method= RequestMethod.GET)
//    @GetMapping("/add/{a}/{b}")
//    @DeleteMapping("/add/{a}/{b}")
//    @PostMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable String b, Model model){
        String res = a+b;
        model.addAttribute("msg", "结果为1 : "+res);
        return "test";
    }


    // http://localhost:8080/add/1/2
    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable String b, Model model){
        String res = a+b;
        model.addAttribute("msg", "结果为2 : "+res);
        return "test";
    }
}
