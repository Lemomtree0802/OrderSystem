package com.lemontree0802.mapper;

public interface OrderDetailMapper {
    void userOrderDetail(int orderId, int dishId, int quantity, double price);
}
