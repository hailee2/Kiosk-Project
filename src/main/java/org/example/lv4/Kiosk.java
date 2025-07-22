package org.example.lv4;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Kiosk {
    //속성
    private final List<Menu> menus;


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
                // 메뉴 선택
                System.out.print("입력: ");
                int selectMain = Integer.parseInt(sc.nextLine()); //nextInt로 받으면 개행버퍼제거 줄을 또 만들어야해서 문자열로 받고 int로 변환\
                //입력한 메뉴에 따른 결과 출력
                if (selectMain > 0 && selectMain < menus.size()) {
                    ShowSelectedMenuItem(selectMain); //메뉴아이템 출력과 선택 + 선택한 메뉴아이템 출력
                }else if(selectMain == 0){
                    return;
                }else{
                    System.out.println("입력값이 올바르지 않습니다. 메뉴를 선택해주세요.");
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

    //int id값이 menu 리스트 id값과 같으면 해당 id값 가진 메인 메뉴 출력
    private Menu getMenuById(int id){
        for(Menu menu : menus){
            if(id==menu.getId()){
                return menu;
            }
        }
        return null;
    }

    private void ShowSelectedMenuItem(int selectMain){
        List<MenuItem> items = Objects.requireNonNull(getMenuById(selectMain)).getMenuItems(); //선택한 메뉴리스트의 메뉴아이템 불러오기
        for (MenuItem item : items) {
            System.out.println(item);
        } //메뉴아이템 출력
        System.out.print("입력: ");
        int selectedMenuItem = Integer.parseInt(sc.nextLine());
        if(selectedMenuItem == 0 ){
            return;
        }else if(selectedMenuItem < items.size()){
            System.out.println("선택한 메뉴: "+items.get(selectedMenuItem-1));
        }else{
            System.out.println("입력값이 올바르지 않습니다. 메뉴 번호를 입력해주세요.");
        }
    }

}

