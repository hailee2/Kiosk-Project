package org.example.lv4;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Kiosk {
    //속성
    List<Menu> menus;


    //생성자
    public Kiosk(List<Menu> menus){
        this.menus=menus;
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
            int selectMain = Integer.parseInt(sc.nextLine());
                switch (selectMain){
                    case 1:
                        List<MenuItem> items = Objects.requireNonNull(getMenuById(selectMain)).getMenuItems();
                        for (MenuItem item : items) {
                            System.out.println(item);
                        }
                            System.out.print("입력: ");
                            int selectBurger = Integer.parseInt(sc.nextLine());
                                switch(selectBurger){
                                    case 1:
                                        System.out.println("선택한 메뉴: " + items.get(0));
                                        break;
                                    case 2:
                                        System.out.println("선택한 메뉴: " + items.get(1));
                                        break;
                                    case 3:
                                        System.out.println("선택한 메뉴: " + items.get(2));
                                        break;
                                    case 4:
                                        System.out.println("선택한 메뉴: " + items.get(3));
                                        break;
                                    case 0:
                                        break;
                                }
                        break;
                    case 2:
                        List<MenuItem> items2 = Objects.requireNonNull(getMenuById(selectMain)).getMenuItems();
                        for (MenuItem item : items2) {
                            System.out.println(item);
                        }
                        System.out.print("입력: ");
                        int selectDrink = Integer.parseInt(sc.nextLine());
                        switch(selectDrink){
                            case 1:
                                System.out.println(items2.get(0));
                                break;
                            case 2:
                                System.out.println(items2.get(1));
                                break;
                            case 3:
                                System.out.println(items2.get(2));
                                break;
                            case 0:
                                break;
                        }
                        break;
                    case 3: 
                    List<MenuItem> items3 = Objects.requireNonNull(getMenuById(selectMain)).getMenuItems();
                        for (MenuItem item : items3) {
                            System.out.println(item);
                        }
                        System.out.print("입력: ");
                        int selectDesert = Integer.parseInt(sc.nextLine());
                        switch(selectDesert){
                            case 1:
                                System.out.println(items3.get(0));
                                break;
                            case 2:
                                System.out.println(items3.get(1));
                                break;
                            case 3:
                                System.out.println(items3.get(2));
                                break;
                            case 0:
                                break;
                        }
                        break;
                    case 0:
                    return;
                }

            // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
            // List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?



        }
    }
    private Menu getMenuById(int id){
        for(Menu menu : menus){
            if(id==menu.getId()){
                return menu;
            }
        }
        return null;
    }
}
