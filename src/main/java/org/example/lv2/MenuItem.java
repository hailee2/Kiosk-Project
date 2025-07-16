package org.example.lv2;

public class MenuItem {
    //속성
    String name;
    int price;
    String description;


    //생성자
    public MenuItem (String name, int price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }


    //기능
    public void printMenu(){
        System.out.println("선택한 메뉴: " + name + ", " + price + "원" + ", " + description);
    }
}
