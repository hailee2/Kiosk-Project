package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성을 통해 이름 설정
        List<MenuItem> mainList = new ArrayList<>();
        Menu mainItem = new Menu(mainList);
        List<MenuItem> burgerList = new ArrayList<>();
        Menu burgerItem = new Menu(burgerList);
        List<MenuItem> drinkList = new ArrayList<>();
        Menu drinkItem = new Menu(drinkList);
        List<MenuItem> desertList = new ArrayList<>();
        Menu desertItem = new Menu(desertList);

        //메인 메뉴 리스트 추가하기
        mainList.add(new MenuItem("1. Burgers"));
        mainList.add(new MenuItem("2. Drinks"));
        mainList.add(new MenuItem("3. Deserts"));
        mainList.add(new MenuItem("0. 종료"));

        //버거 메뉴 리스트 추가하기
        burgerList.add(new MenuItem("1. hackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("2. SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("3. CheeseBurger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("4. Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));
        burgerList.add(new MenuItem("0. 뒤로가기"));

        //음료 메뉴 리스트 추가하기
        drinkList.add(new MenuItem("1.콜라",2.3));
        drinkList.add(new MenuItem("2.사이다",2.2));
        drinkList.add(new MenuItem("3.환타",2.0));
        drinkList.add(new MenuItem("0.뒤로가기"));

        //후식 메뉴 리스트 추가하기
        desertList.add(new MenuItem("1.소프트콘",0.9));
        desertList.add(new MenuItem("2.감자튀김",2.5));
        desertList.add(new MenuItem("3.너겟",3.3));
        desertList.add(new MenuItem("0.뒤로가기"));


        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk();

        // Kiosk 내 시작하는 함수 호출
        kiosk.start();

    }
}
