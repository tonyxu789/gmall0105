package com.hxu.gmall.user.service;

import com.hxu.gmall.user.bean.UmsMember;
import com.hxu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Integer memberId);
}
