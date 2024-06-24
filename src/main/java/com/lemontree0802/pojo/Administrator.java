package com.lemontree0802.pojo;

import java.sql.Timestamp;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class Administrator {
    private int id;
    private String name;
    private String username;
    private String password;
    private Timestamp createdAt;
}
