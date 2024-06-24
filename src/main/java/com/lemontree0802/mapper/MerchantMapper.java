package com.lemontree0802.mapper;

import com.lemontree0802.pojo.Merchant;

import java.util.List;

public interface MerchantMapper {
    List<Merchant> selectAll();

    Merchant selectByName(String name);
}
