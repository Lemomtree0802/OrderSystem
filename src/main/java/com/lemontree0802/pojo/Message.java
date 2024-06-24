package com.lemontree0802.pojo;

import java.sql.Timestamp;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class Message {
    private int id;
    private int userId;
    private String messageText;
    private Timestamp createdAt;
}
