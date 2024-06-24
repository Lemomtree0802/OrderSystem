package com.lemontree0802.pojo;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class Merchant {
    private int id;
    private String name;
    private String address;
    private String mainDish;

    public void printMyInfo() {
        System.out.print("id:" + id + ", ");
        System.out.print("name:" + name + ", ");
        System.out.print("name:" + address + ", ");
        System.out.println("name:" + mainDish + ".");
    }
}
