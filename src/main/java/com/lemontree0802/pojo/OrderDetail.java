package com.lemontree0802.pojo;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class OrderDetail {
    private int id;
    private int orderId;
    private int dishId;
    private int quantity;
    private double price;
}
