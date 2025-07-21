package org.example.lv4;

public class MenuItem {
    //속성
    private int id;
    private String name;
    private double price;
    private String description;


    //생성자
    public MenuItem(int id, String name){
        this.id = id;
        this.name= name;
    }

    public MenuItem(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public MenuItem(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //기능
    //toString() 오버라이딩
    public String toString() {
        if(!(name==null) && price==0.0 && description==null){
            return id + " " + name;
        }else if(!(name==null) && !(price==0.0) && description==null){
            return id + " " + name +" | "+ price ;
        }else{
            return id + " " + name +" | "+ price +" | "+ description;
        }
    }
}
