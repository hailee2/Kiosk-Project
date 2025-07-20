package org.example.lv4;

import java.util.List;

public class Menu {

    // MenuItem 클래스를 List로 관리
    //속성
    int id;
    String name;
    List<MenuItem> menuItems;

    //생성자
    public Menu(int id, String name, List<MenuItem> menuItems){
        this.id=id;
        this.name=name;
        this.menuItems=menuItems;
    }
    public Menu(int id, String name){
        this.id = id;
        this.name=name;
    }
    public Menu(){}


    // List를 리턴하는 함수
    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public int getId(){
        return id ;
    }

    public String getName(){
        return name;
    }


    //toString() 오버라이딩
    public String toString() {
        if (!(name == null) && id == 0.0 && menuItems == null) {
            return id + " " + name;
        } else if (!(name == null) && !(id == 0.0) && menuItems == null) {
            return id + " " + name;
        } else {
            return id + " " + name + " = " + menuItems;
        }
    }
    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
}
