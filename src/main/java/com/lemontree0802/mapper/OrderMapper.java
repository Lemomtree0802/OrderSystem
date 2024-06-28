package com.lemontree0802.mapper;

import com.lemontree0802.pojo.Order;

import java.util.List;

public interface OrderMapper {
    // 往表中插入订单信息
    void userOrder(int userId, int merchantId, String status);

    // 查询最新的一条order，得到order实体
    Order selectTheLatestOrder();

    // 根据userId查询他所有的order
    List<Order> selectByUserId(int userId);
}
