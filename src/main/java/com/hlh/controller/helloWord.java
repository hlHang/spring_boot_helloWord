package com.hlh.controller;

import com.hlh.entity.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class helloWord {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {

        return "helloWord";
    }

    @ResponseBody
    @RequestMapping("/introduce")
    public String introduce() {
        user user = new user();
        user.setUserId(1);
        user.setUserName("超儿");
        user.setSex("女");
        user.setAddress("南充");
        user.setNPrice(18.9);
        return user.toString();
    }
}
