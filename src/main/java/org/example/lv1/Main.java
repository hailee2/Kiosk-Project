package org.example.lv1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //메뉴판
        System.out.print("[ SHAKESHACK MENU ]\n" +
                "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                "0. 종료           | 종료\n");

        //주문 입력(반복문)
        while (true) {
            System.out.print("주문하실 메뉴의 번호를 입력하세요: ");
            String selectMenu = sc.nextLine();
            switch (selectMenu) {
                case "1":
                    System.out.println("----------\n선택하신 메뉴: ShackBurger\n가격: W 6.9\n----------");
                    break;
                case "2":
                    System.out.println("----------\n선택하신 메뉴: SmokeShack\n가격: W 8.9\n----------");
                    break;
                case "3":
                    System.out.println("----------\n선택하신 메뉴: Cheeseburger\n가격: W 6.9\n----------");
                    break;
                case "4":
                    System.out.println("----------\n선택하신 메뉴: Hamburger\n가격: W 5.4\n----------");
                    break;
                default:
                    if ("0".equals(selectMenu)) {
                        System.out.println("주문을 종료합니다");
                        return;
                    }
                    System.out.println("입력값이 올바르지 않습니다.");
            }
        }
    }
}
