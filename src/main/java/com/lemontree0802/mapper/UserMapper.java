package com.lemontree0802.mapper;

import com.lemontree0802.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    // 查询所有用户，返回由所有用户组成的列表
    List<User> selectAll();

    // 完全输入正确名称，才能查询得到
    User selectByName(String name);
}
