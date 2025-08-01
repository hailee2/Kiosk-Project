package org.example.lv2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //리스트 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        //add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(new MenuItem("1. hackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("2. SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("3. CheeseBurger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("4. Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        //Scanner 생성
        Scanner sc = new Scanner(System.in);

        //반복문을 활용해 List안에 있는 MenuItem을 하나씩 출력
        for(int i = 0; i< menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        } //참조값 출력됨 -> MenuItem 클래스에 toString()생성

        while(true){
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
