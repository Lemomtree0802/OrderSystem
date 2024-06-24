package com.lemontree0802.mapper;

import com.lemontree0802.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    User selectByName(String name);
}
