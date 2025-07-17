package org.example.lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    List<MenuItem> menuItems;

    //생성자
    public Kiosk(List<MenuItem> menuItems){
        this.menuItems = new ArrayList<>();
    }

    //리스트 출력기능
    public void printList(List<MenuItem> menuItems){
        //반복문을 활용해 List안에 있는 MenuItem을 하나씩 출력
        for(int i = 0; i< menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
    }

    //입력 반복문 기능
    public void start(List<MenuItem> menuItems){
        //Scanner 생성
        Scanner sc = new Scanner(System.in);
        while(true) {
            // 숫자를 입력 받기
            System.out.print("\n주문하실 메뉴의 번호를 입력하세요. (주문 종료를 원하시면 '0'번을 입력하세요) : ");
            String selectMenu = sc.nextLine();
            // 입력된 숫자에 따른 처리
            switch (selectMenu) {
                case "1":
                    System.out.println("선택한 메뉴: " + menuItems.get(0));
                    break;
                case "2":
                    System.out.println("선택한 메뉴: " + menuItems.get(1));
                    break;
                case "3":
                    System.out.println("선택한 메뉴: " + menuItems.get(2));
                    break;
                case "4":
                    System.out.println("선택한 메뉴: " + menuItems.get(3));
                    break;
                case "0":
                    System.out.println("주문을 종료합니다");
                    return;
                default:
                    System.out.println("입력값이 올바르지 않습니다.");

            }
        }
    }
}
