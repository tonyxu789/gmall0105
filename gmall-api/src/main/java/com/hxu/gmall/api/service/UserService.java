package com.hxu.gmall.api.service;

import com.hxu.gmall.api.bean.UmsMember;
import com.hxu.gmall.api.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
