package com.lemontree0802.mapper;

import com.lemontree0802.pojo.Administrator;

import java.util.List;

public interface AdministratorMapper {

    List<Administrator> selectAll();

    void DeleteUser(int user_id);

    void DeleteMerchant(int merchant_id);
}
