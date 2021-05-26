package com.kuang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kuang.pojo.User;
import com.kuang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/23-20:45
 */
//@Controller 走视图解析器
@RestController //类中所有方法直接返回字符串
public class UserController {


    //produces:指定响应体返回类型和编码
    @RequestMapping(value = "/j1")
//    @ResponseBody//不会走视图解析器, 会直接返回一个字符串, 配合Controller使用
    public String json1() throws JsonProcessingException {

        //jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("ccq",1,"male");

        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        //jackson ObjectMapper
//        ObjectMapper mapper = new ObjectMapper();
        List<User> userList = new ArrayList<User>();
        User user1 = new User("ccq",1,"male");
        User user2 = new User("ccq",1,"male");
        User user3 = new User("ccq",1,"male");
        User user4 = new User("ccq",1,"male");
        User user5 = new User("ccq",1,"male");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

//        String str = mapper.writeValueAsString(userList);

        return JsonUtils.getJson(userList);//return new ObjectMapper().writeValueAsString(userList)
    }

    @RequestMapping(value = "/j3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }

    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {

        //创建一个对象
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 3, "男");
        User user3 = new User("秦疆3号", 3, "男");
        User user4 = new User("秦疆4号", 3, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        System.out.println("*******Java对象 转 JSON字符串*******");
        String str1 = JSON.toJSONString(list);
        System.out.println("JSON.toJSONString(list)==>"+str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>"+str2);

        System.out.println("\n****** JSON字符串 转 Java对象*******");
        User jp_user1=JSON.parseObject(str2,User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+jp_user1);

        System.out.println("\n****** Java对象 转 JSON对象 ******");
        JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject1.getString("name"));

        System.out.println("\n****** JSON对象 转 Java对象 ******");
        User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);
        return "hello";
    }




}
