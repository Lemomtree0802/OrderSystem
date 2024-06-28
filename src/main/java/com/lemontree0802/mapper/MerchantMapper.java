package com.lemontree0802.mapper;

import com.lemontree0802.pojo.Merchant;

import java.util.List;

public interface MerchantMapper {
    List<Merchant> selectAll();

    // 完全输入正确名称，才能查询得到
    Merchant selectByName(String name);

    // 模糊查询，比如查询商家名字里带“Mer”的，就会返回所有名字里带“Mer”的商家类的列表
    List<Merchant> fuzzySearch(String name);
}
