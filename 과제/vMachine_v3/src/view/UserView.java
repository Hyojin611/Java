package view;

import dto.CustomerDto;
import repository.CustomerRepository;
import service.CustomerService;

import java.util.Scanner;

public class UserView implements ViewUserInterface {
    Scanner sc = new Scanner(System.in);
    CustomerService customerService = new CustomerService();
    CustomerRepository customerRepository = new CustomerRepository();

    String id;


    @Override
    public void signupView() {
        CustomerDto dto = new CustomerDto();
        System.out.println("아이디 : ");
        String id = sc.next();
        dto.setCusId(id);
        System.out.println("이름 : ");
        String name = sc.next();
        dto.setName(name);
        System.out.println("비밀번호 : ");
        String password = sc.next();
        dto.setPassword(password);
        System.out.println("전화번호 : ");
        String phone = sc.next();
        dto.setPhoneNumber(phone);

        int result = customerService.insertuserdata(dto);
        if (result != 0) {
            System.out.println("저장 성공");
        } else {
            System.out.println("저장 실패");
        }
    }

    @Override
    public boolean loginView() {
        System.out.println("로그인 메뉴 화면");

        //사용자에게 아이디와 비밀번호 입력받기
        System.out.println("아이디: ");
        id = sc.nextLine();
        System.out.println("비밀번호: ");
        String password = sc.nextLine();

        boolean logincheck = customerService.logindata(id, password);  // boolean 값 반환

        //로그인 성공 여부 확인
        if (logincheck) {
            System.out.println("로그인 성공!");

        } else {
            System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
        }
        return logincheck;
    }

    public String loginInfo() {
        return id;
    }

    public void remainConfirm() {
        String id = loginInfo();

        int result = customerService.remainConfirm(id);

        if(result != 0){
            System.out.println(id + "님의 잔액은 " + result + "원 입니다.");
        }else{
            System.out.println("잔액 확인 실패");
        }


    }

//    @Override
//    public void productView() {
//
//    }
//
//    @Override
//    public void showProductView(ProductView productView) {
//        productView.showProductMenuView(productView);
//    }


    public void showProductMenuView(ProductView productView) {
        productView.showProductMenuView(productView);
    }

//    public void chargMoney() {
//        System.out.println("충전할 금액을 입력하세요. (1000원단위) :");
//        int chargAmount = sc.nextInt();
//
//        if (chargAmount <= 0) {
//            System.out.println("잘못된 금액입니다. 양수만 입력할 수 있습니다.");
//            return;
//        }
//
//        // 고객 ID를 입력 받거나 이미 로그인된 고객의 ID를 사용할 수 있습니다.
//        System.out.println("고객 ID를 입력하세요 :");
//        String customerId = sc.next();  // 고객 ID 입력받기
//
//        boolean result = customerService.chargMoney(customerId, chargAmount);  // customerId와 chargAmount 전달
//        if (result) {
//            System.out.println("금액이 충전되었습니다.");
//        } else {
//            System.out.println("충전 실패");
//        }
//    }
}