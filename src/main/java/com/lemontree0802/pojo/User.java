package com.lemontree0802.pojo;

@lombok.Getter
@lombok.Setter
public class User {
    // Getters and Setters
    private int id;
    private String name;
    private String gender;
    private String studentOrEmployeeNumber;

    // Constructors
    public User() {}

    public User(int id, String name, String gender, String studentOrEmployeeNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.studentOrEmployeeNumber = studentOrEmployeeNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", studentOrEmployeeNumber='" + studentOrEmployeeNumber + '\'' +
                '}';
    }
}

