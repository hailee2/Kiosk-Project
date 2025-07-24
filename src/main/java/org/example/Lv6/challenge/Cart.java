package org.example.Lv6.challenge;

import java.util.List;


public class Cart {

    //속성

    private int optionId;
    private String optionAndDesc;


    //생성자
    public Cart(int id, String opitonAndDesc, List<Menu> menus){
        this.optionId = id;
        this.optionAndDesc = opitonAndDesc;
    }

    //기능


    //게터메서드
    public int getId(){
        return optionId ;
    }

    public String getOptionAndDesc(){
        return optionAndDesc;
    }


    //toString() 오버라이딩
    public String toString() {
        return optionId + optionAndDesc;

    }
}


