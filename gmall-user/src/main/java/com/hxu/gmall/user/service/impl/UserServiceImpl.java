package com.hxu.gmall.user.service.impl;

import com.hxu.gmall.user.bean.UmaMember;
import com.hxu.gmall.user.mapper.UserMapper;
import com.hxu.gmall.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Resource
    UserMapper userMapper;

    @Override
    public List<UmaMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}
