import dto.CustomerDto;
import dto.ProductDto;
import service.CustomerService;
import service.ProductService;
import service.SaleService;
import view.MainView;
import view.ProductView;
import view.UserView;
import view.AdminView; // 관리자 메뉴를 위한 클래스

import java.util.Scanner;

public class VdMachineMain {
    public static ProductService productService = new ProductService();   // 제품의 재고 관리 및 사용자의 잔액과 관련된 작업
    public static SaleService saleService = new SaleService();            // 구매 기록을 데이터 베이스에 추가
    public static CustomerService customerService = new CustomerService(); // 고객의 잔액 충전, 잔액확인과 같은 작업

    public static void main(String[] args) {
        // 사용자 인터페이스 담당
        UserView view = new UserView();                   // 회원가입, 로그인, 잔액 확인 등
        ProductView productView = new ProductView();      // 제품 목록 표시와 관련된 작업
        AdminView adminView = new AdminView();
        MainView mainView = new MainView();// 관리자 메뉴를 위한 객체 생성

        Scanner sc = new Scanner(System.in);
        int num = 0;                                       // 메뉴 선택 값을 저장하는 변수
        int balance = 0;                                    // 로그인한 사용자의 충전된 금액을 저장

        while (true) {                                      // 프로그램이 종료될 때까지 반복 실행
            System.out.println("1.회원가입 2.로그인 3.종료");
            num = sc.nextInt();                             // 사용자로부터 숫자를 입력받아 작업 수행
            switch (num) {
                case 1:   // 회원가입 메뉴
                    view.signupView();                      // UserView 클래스에서 구현
                    break;

                case 2:   // 로그인 메뉴
                    boolean check = view.loginView();       // 로그인 처리 (boolean 값 반환)
                    if (check) {                             // 반환값 check는 로그인 성공 여부를 나타냄
                        System.out.println("로그인 성공! 금액을 충전하시겠습니까?");
                        System.out.println("1. 금액 충전 2. 자판기 메뉴 3. 관리자 메뉴");

                        int chargeChoice = sc.nextInt();    // 금액 충전 또는 자판기 메뉴 선택

                        if (chargeChoice == 1) {
                            System.out.println("충전할 금액을 입력하세요:");
                            balance = sc.nextInt();
                            String id = view.loginInfo();

                            int result = customerService.chargeMoneyUpdate(id, balance);  // 데이터베이스에 금액 업데이트

                            if (result != 0) {
                                System.out.println("충전된 금액: " + balance + "원");
                            } else {
                                System.out.println("충전 실패");
                            }
                        }

                        // 관리자 메뉴 (chargeChoice == 3 일 때 관리자 메뉴로 이동)
                        if (chargeChoice == 3) {
                            adminView.adminMenu(); // 관리자 메뉴 호출
                           break; // 관리자 메뉴가 끝나면 로그아웃 처리
                        }

                        // 자판기 메뉴
                        while (true) {
                            System.out.println("\n자판기 메뉴:");
                            System.out.println("1. 제품 선택 2. 잔액 확인 3. 로그아웃");
                            int action = sc.nextInt();

                            switch (action) {
                                case 1: // 제품 선택
                                    productView.showProductMenuView();  // 제품 목록 표시
                                    System.out.println("제품 이름을 선택하세요:");
                                    String productName = sc.next();

                                    String id = view.loginInfo();
                                    ProductPurchase(id, productName);              // 입력된 제품을 처리
                                    break;

                                case 2: // 잔액 확인
                                    view.remainConfirm();
                                    break;
                                case 3: // 로그아웃
                                    System.out.println("로그아웃 되었습니다.");
                                    break;  // 로그아웃 후 종료
                                default:
                                    System.out.println("잘못 입력했습니다.");

                                    if (action == 3) {
                                        break;
                                    }
                            }

                        }
                    } else {
                        System.out.println("로그인 실패, 다시 시도하세요.");
                    }
                    break;

                case 3:   // 종료
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }
    }

    // 제품 구매 처리
    public static void ProductPurchase(String id, String productName) {
        productService.minusBalance(id, productName);           // 잔액 차감
        productService.minusStock(productName);                 // 재고 감소
        int result = saleService.addSalesInfo(id, productName);  // 판매 정보 추가

        int stock = customerService.StockInfo(productName);     // 선택한 제품의 재고 확인
        int balance = productService.BalanceInfo(id);           // 사용자의 남은 잔액 확인

        if (result != 0) {
            System.out.println(productName + " 출력 완료, 재고는 " + stock + " 잔액은 " + balance + "원 입니다.");
        } else {
            System.out.println("제품 출력 실패");
        }
    }
}
