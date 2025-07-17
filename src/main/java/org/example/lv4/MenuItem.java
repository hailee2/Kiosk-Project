package org.example.lv4;

public class MenuItem {
    //속성
    String name;
    double price;
    String description;


    //생성자
    public MenuItem(String name){
        this.name= name;
    }

    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //기능
    //toString() 오버라이딩
    public String toString() {
        if(!(name==null) && price==0.0 && description==null){
            return name;
        }else if(!(name==null) && !(price==0.0) && description==null){
            return name +" | "+ price +" | ";
        }else{
            return name +" | "+ price +" | "+ description;
        }
    }
}
