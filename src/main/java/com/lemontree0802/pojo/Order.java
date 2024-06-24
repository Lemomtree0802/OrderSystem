package com.lemontree0802.pojo;

import java.sql.Timestamp;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class Order {
    private int id;
    private int userId;
    private int merchantId;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}