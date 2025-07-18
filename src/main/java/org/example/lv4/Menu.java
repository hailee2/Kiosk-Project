package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // MenuItem 클래스를 List로 관리
    //속성
    private List<MenuItem> menuItems;
    List<MenuItem> mainList;
    List<MenuItem> burgerList;
    List<MenuItem> drinkList;
    List<MenuItem> desertList;

    //생성자
    public Menu(List<MenuItem> menu){
        new ArrayList<>();
    }

    public Menu() {}


    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public void printList(List<MenuItem> menuItems){
        for(int i = 0; i< menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
    }

    // List를 리턴하는 함수
    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
}
