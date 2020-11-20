package com.hxu.gmall.user.controller;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hxu.gmall.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }


}
