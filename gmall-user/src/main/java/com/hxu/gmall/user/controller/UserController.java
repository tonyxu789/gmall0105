package com.hxu.gmall.user.controller;

import com.hxu.gmall.api.bean.UmsMember;
import com.hxu.gmall.api.bean.UmsMemberReceiveAddress;
import com.hxu.gmall.api.service.UserService;
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
    @ResponseBody
    public List<UmsMember> getAllUser(){

        return userService.getAllUser();
    }

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){

        return userService.getReceiveAddressByMemberId(memberId);
    }


}
