package com.lemontree0802.pojo;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class Dish {
    private int id;
    private int merchantId;
    private String name;
    private double price;
    private String category;
    private String description;
    private String imageUrl;
    private String ingredients;
    private String nutritionInfo;
    private String allergens;
}
