package com.lemontree0802.pojo;

import java.sql.Timestamp;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class Favorite {
    private int id;
    private int userId;
    private int merchantId;
    private int dishId;
    private Timestamp createdAt;
}