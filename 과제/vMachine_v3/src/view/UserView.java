package view;

import dto.CustomerDto;
import service.CustomerService;

import java.util.Scanner;

public class UserView implements ViewUserInterface {
    Scanner sc = new Scanner(System.in);
    CustomerService customerService = new CustomerService();

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
    public void loginView() {
        System.out.println(" 로그인 메뉴 화면 ");

        CustomerDto dto = new CustomerDto();
        System.out.println(" 아이디 : ");
        String id = sc.next();
        if (id.equals(dto.getCusId())) {
            System.out.println(" 비밀번호 : ");
            String password = sc.next();
            if (password.equals(dto.getPassword())) {
                System.out.println(" 로그인 성공 ");
            } else {
                System.out.println(" 비밀번호가 일치 하지 않습니다.");
            }


        }
    }
}
