package com.kuang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/26-17:33
 */
@RestController
public class TestController {

    @GetMapping("/t1")
    public String test(){
        System.out.println("testController");

        return "test";
    }



}
