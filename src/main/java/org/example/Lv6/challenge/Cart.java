package org.example.Lv6.challenge;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Cart {

    //속성
    private List<MenuItem> menuItems;
    private List<Menu> menus;
    private int id;
    private String optionAndDesc;

    //생성자

    //기능
    public void cart(){
        //선택한 메뉴 가져오기
//        String menuItem = Objects.requireNonNull(getMenuById(selectMain)).getMenuItems(selectedMenuItem); //선택한 메뉴아이템 어케 불러와 흑

        //장바구니에 담을지 말지 입력값 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?\n1.확인     2.취소" );
        try{int addCart = Integer.parseInt(sc.nextLine());
            if(addCart==1){
                System.out.println("선택한 메뉴아이템 name 불러오기"+"이 장바구니에 추가되었습니다.");
            }else if(addCart==2){
                return;
            }
        }catch(NumberFormatException e){
            System.out.println("입력값이 올바르지 않습니다.");
        }

    }
}

// 카트 리스트도 있어야 할 것같음 >> 메인에서 메뉴,메뉴아이템 리스트 추가했던 것처럼 List<Cart> 객체생성해서 Cart클래스 안에 생성자를 내가 선택한 메뉴아이템을 추가할 수 있게 장바구니 리스트 만들어야할듯
// 카트 리스트 >> id(4번,5번)+ 옵션과 안내(주문내역/취소) +  + 선택한 메뉴(4번 주문내역 옆에만.. 넣을수있겠지..?)
// 장바구니 리스트가 있다면 ? isEmpty()메서드를 이용해서 있을 경우에만 장바구니 리스트 출력! >> 이건 메인에서 ?!!
