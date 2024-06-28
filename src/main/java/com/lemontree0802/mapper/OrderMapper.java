package com.lemontree0802.mapper;

import com.lemontree0802.pojo.Order;

public interface OrderMapper {
    boolean userOrder(int userId, int merchantId, String status);

    // 查询最新的一条order，得到order实体
    Order selectTheLatestOrder();
}
