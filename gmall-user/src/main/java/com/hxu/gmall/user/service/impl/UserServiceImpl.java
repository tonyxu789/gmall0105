package com.hxu.gmall.user.service.impl;

import com.hxu.gmall.api.bean.UmsMember;
import com.hxu.gmall.api.bean.UmsMemberReceiveAddress;
import com.hxu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.hxu.gmall.user.mapper.UserMapper;
import com.hxu.gmall.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Resource
    UserMapper userMapper;

    @Resource
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

//        Example e = new Example(UmsMemberReceiveAddress.class);
//        e.createCriteria().andEqualTo("memberId", memberId);
//
//        return umsMemberReceiveAddressMapper.selectByExample(e);

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }

}
