package com.lemontree0802.pojo;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class User {
    // Getters and Setters
    private int id;
    private String name;
    private String gender;
    private String studentOrEmployeeNumber;
    private double balance = 100.00;

}

