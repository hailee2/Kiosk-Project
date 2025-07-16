package org.example.lv2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //리스트 선언
        List<MenuItem> menuItems = new ArrayList<>();

        //객체 생성
        MenuItem menu1 = new MenuItem("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menu2 = new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menu3 = new MenuItem("CheeseBurger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menu4 = new MenuItem("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거");

        //리스트에 메뉴 추가
        menuItems.add(menu1);
        menuItems.add(menu2);
        menuItems.add(menu3);
        menuItems.add(menu4);

        //리스트 출력 (확인용)
        for(int i = 0; i< menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        } //참조값 출력됨.


    }
}
