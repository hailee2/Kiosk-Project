package org.example.Lv6.challenge;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Kiosk {

    //속성
    private final List<Menu> menus;
    private final List<Cart> cart;


    //생성자
    public Kiosk(List<Menu> menus, List<Cart> cart){
        this.menus=menus;
        this.cart=cart;
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
                //메뉴 아이템 출력 + 메뉴 아이템 선택 + 선택한 메뉴아이템 출력
                if (selectMain > 0 && selectMain < menus.size()) {
                    ShowSelectedMenuItem(selectMain); //메뉴아이템 출력+ 선택 + 선택한 메뉴아이템 출력 메서드
                }else if(selectMain == 0){
                    return;
                }else{
                    System.out.println("입력값이 올바르지 않습니다. 메뉴를 선택해주세요.");
                    return;
                }

                //선택한 메뉴 가져오기
//                String menuItem = items.get(selectedMenuItem - 1); // 어떻게 가져오지....
//
                //장바구니에 담을지 말지 입력값 받기
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?\n1.확인     2.취소" );
                int addCart = Integer.parseInt(sc.nextLine());
                    if(addCart==1){
                        System.out.println("선택한 메뉴아이템 name 불러오기"+"이 장바구니에 추가되었습니다."); //내가 선택한 메뉴 어케 불러오지..
                    }else if(addCart==2) {
                        return;
                    }

                //실제로 장바구니에 추가 하기
                //??????!?!??!?!!????

//                //장바구니 옵션 보여주기
//                if(장바구니리스트.isEmpty()){
//                    break;
//                    }else if(!(장바구니리스트.isEmpty())){
//                    showMenu();
//                      System.out.println("\n[ ORDER MENU ]");
//                    for (Cart Carts : cart) {
//                        System.out.println(cart.getOptionId()+" "+cart.getOptionAndDesc());
//                    }
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



    private void ShowSelectedMenuItem(int selectMain){ //하위 카테고리 메뉴아이템 출력 / 선택 / 선택한 메뉴 출력
        while(true){ // 0번 뒤로가기 누르거나 올바른 입력값 입력할때까지 루프
            try {
                List<MenuItem> items = Objects.requireNonNull(getMenuById(selectMain)).getMenuItems(); //선택한 메뉴리스트의 메뉴아이템 불러오기
                for (MenuItem item : items) {
                    System.out.println(item);//메뉴아이템 출력
                }
                //메뉴아이템 선택하기
                System.out.print("입력: ");
                int selectedMenuItem = Integer.parseInt(sc.nextLine());
                //선택한 메뉴아이템 번호에 따른 출력
                if (selectedMenuItem == 0) {
                    return;
                } else if (selectedMenuItem < items.size()) {
                    System.out.println("선택한 메뉴: " + items.get(selectedMenuItem - 1));
                    return;
                } else {
                    System.out.println("입력값이 올바르지 않습니다. 메뉴 번호를 입력해주세요.");
                }
            }catch (NumberFormatException e) {  //숫자를 입력하지 않은 경우
                System.out.println("입력값이 올바르지 않습니다. 메뉴의 번호를 입력해주세요.");
            }
        }

    }
}
