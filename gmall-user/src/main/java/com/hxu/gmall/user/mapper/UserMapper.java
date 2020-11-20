package com.hxu.gmall.user.mapper;

import com.hxu.gmall.user.bean.UmaMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UmaMember> selectAllUser();

}
