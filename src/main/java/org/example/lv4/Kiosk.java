package org.example.lv4;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Kiosk {
    //속성
    private List<Menu> menus;


    //생성자
    public Kiosk(List<Menu> menus){
        this.menus=menus;
    }

    // 스캐너 선언
    Scanner sc = new Scanner(System.in);
    //기능
    public void start(){

        // 반복문 시작
        while(true){
            try{
                //상위 카테고리 메뉴 출력 메서드
                ShowMenu();
                // 숫자 입력 받기
                System.out.print("입력: ");
                int selectMain = Integer.parseInt(sc.nextLine());
                switch (selectMain){
                    case 1: //1. Burgers를 입력한 경우
                        System.out.println("\n[ BURGERS MENU ]");
                        SelectedMenuItem(selectMain);
                        break;

                    case 2: //2. Drinks를 입력한 경우
                        System.out.println("\n[ DRINKS MENU ]");
                        SelectedMenuItem(selectMain);
                        break;

                    case 3: //3. Deserts 입력한 경우
                        System.out.println("\n[ DESERTS MENU ]");
                        SelectedMenuItem(selectMain);
                        break;

                    case 0: //종료 선택
                        return;
                }
            }catch(NullPointerException e){
                System.out.println("입력되지 않았습니다. 메뉴 번호를 입력하세요."); //입력값이 null일 때
            }catch (NumberFormatException e) {
            System.out.println("입력값이 올바르지 않습니다. 메뉴의 번호를 입력해주세요."); //숫자를 입력하지 않은 경우
            }
        }
    }

    // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
    private void ShowMenu(){
        System.out.println("\n[ MAIN MENU ]");
        for (Menu menu : menus) {
            System.out.println(menu.getId()+" "+menu.getName());
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

    private void SelectedMenuItem(int selectMain){
        List<MenuItem> items = Objects.requireNonNull(getMenuById(selectMain)).getMenuItems();
        for (MenuItem item : items) {
            System.out.println(item);
        }
        System.out.print("입력: ");
        int selectedMenuItem = Integer.parseInt(sc.nextLine());
        if(selectedMenuItem == 0 ){
            return;
        }else{
            System.out.println("선택한 메뉴: "+items.get(selectedMenuItem-1));
        }
    }

}

