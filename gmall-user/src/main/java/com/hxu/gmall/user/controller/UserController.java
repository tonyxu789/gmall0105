package com.hxu.gmall.user.controller;

import com.hxu.gmall.user.bean.UmaMember;
import com.hxu.gmall.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("getAllUser")
    public List<UmaMember> getAllUser(){

        return userService.getAllUser();
    }


}
