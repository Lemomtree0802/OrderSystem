package com.lemontree0802.mapper;

public interface OrderDetailMapper {
    void insertUserOrderDetail(int orderId, int dishId, int quantity, double price);
}
