package org.example.lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    List<Menu> menus;
    List<MenuItem> items1;
    List<MenuItem> items2;
    List<MenuItem> items3;

    //생성자
    public Kiosk(List<Menu> menus, List<MenuItem> items1, List<MenuItem> items2, List<MenuItem> items3){
        this.menus=menus;
        this.items1=items1;
        this.items2=items2;
        this.items3=items3;
    }

    //기능
    public void start(){
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);
        // 반복문 시작
        while(true){
            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            System.out.println(menus);
            // 숫자 입력 받기
            System.out.print("입력: ");
            String selectMain = sc.nextLine();
                switch (selectMain){
                    case "1":
                        for (MenuItem item : items1) {
                            System.out.println(item);
                        }
                            System.out.print("입력: ");
                            String selectBurger = sc.nextLine();
                                switch(selectBurger){
                                    case "1":
                                        System.out.println(items1.get(0));
                                        break;
                                    case "2":
                                        System.out.println(items1.get(1));
                                        break;
                                    case "3":
                                        System.out.println(items3.get(2));
                                        break;
                                    case "4":
                                        System.out.println(items3.get(3));
                                        break;
                                    case "0":
                                        break;
                                }// 근데 여기서어떻게 딱! 햄버거아이템리스트를 가져올 수가 있나요...
                        break;
                    case "2":
                        for (MenuItem item : items2) {
                            System.out.println(item);
                        }
                        System.out.print("입력: ");
                        String selectDrink = sc.nextLine();
                        switch(selectDrink){
                            case "1":
                                System.out.println(items2.get(0));
                                break;
                            case "2":
                                System.out.println(items2.get(1));
                                break;
                            case "3":
                                System.out.println(items2.get(2));
                                break;
                            case "0":
                                break;
                        }
                        break;
                    case "3":
                        for (MenuItem item : items3) {
                            System.out.println(item);
                        }
                        System.out.print("입력: ");
                        String selectDesert = sc.nextLine();
                        switch(selectDesert){
                            case "1":
                                System.out.println(items3.get(0));
                                break;
                            case "2":
                                System.out.println(items3.get(1));
                                break;
                            case "3":
                                System.out.println(items3.get(2));
                                break;
                            case "0":
                                break;
                        }
                        break;
                    case "0":
                    return;
                }

            // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
            // List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?

        }
    }
}
