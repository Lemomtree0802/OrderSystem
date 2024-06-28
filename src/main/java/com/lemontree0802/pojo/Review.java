package com.lemontree0802.pojo;

import java.sql.Timestamp;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class Review {
    private int id;
    private int userId;
    private int merchantId;
    private int dishId;
    private int rating;
    private String reviewText;
    private Timestamp createdAt;
}
