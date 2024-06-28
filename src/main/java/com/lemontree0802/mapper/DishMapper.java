package com.lemontree0802.mapper;

import com.lemontree0802.pojo.Dish;

import java.util.List;

public interface DishMapper {

    // 通过merchantId在dishes表中找到属于该商家的菜品，返回菜品列表
    List<Dish> selectBelongsToMerchant(int merchantId);

    // 根据id找到对应菜品
    Dish selectById(int id);
}
