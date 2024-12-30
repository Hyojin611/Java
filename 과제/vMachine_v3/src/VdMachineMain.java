import dto.CustomerDto;
import dto.ProductDto;
import service.CustomerService;
import service.ProductService;
import service.SaleService;
import view.ProductView;
import view.UserView;

import java.util.Scanner;

public class VdMachineMain {
    public static ProductService productService = new ProductService();
    public static SaleService saleService = new SaleService();
    public static CustomerService customerService = new CustomerService();

    public static void main(String[] args) {

        UserView view = new UserView();
        ProductView productView = new ProductView();

        Scanner sc = new Scanner(System.in);
        int num = 0;

        // balance를 선언
        int balance = 0;

        while (true) {
            System.out.println("1.회원가입 2.로그인 3.종료");
            num = sc.nextInt();
            switch (num) {
                case 1:   // 회원가입 메뉴
                    view.signupView();
                    break;
                case 2:   // 로그인 메뉴
                    boolean check = view.loginView();
                    if (check) {
                        System.out.println("로그인 성공! 금액을 충전하시겠습니까?");
                        System.out.println("1. 금액 충전 2. 자판기 메뉴");
                        int chargeChoice = sc.nextInt();

                        if (chargeChoice == 1) {
                            System.out.println("충전할 금액을 입력하세요:");
                            balance = sc.nextInt();
                            String id = view.loginInfo();

                            int result = customerService.chargeMoneyUpdate(id,balance);

                            if (result != 0) {
                                // 금액을 충전
                                System.out.println("충전된 금액: " + balance + "원");
                            }else {
                                System.out.println("충전 실패");
                            }
                        }

                        // 자판기 메뉴
                        while (true) {
                            System.out.println("\n자판기 메뉴:");
                            System.out.println("1. 제품 선택 2. 잔액 확인 3. 로그아웃");
                            int action = sc.nextInt();

                            switch (action) {
                                case 1: // 제품 선택
                                    productView.showProductMenuView(productView); // 제품 목록 표시
                                    System.out.println("제품 이름읋 선택하세요:");
                                    String productName = sc.next();

                                    // 제품 선택 처리
                                    String id = view.loginInfo();
                                    handleProductPurchase(id, productName);
                                    break;
                                case 2: // 잔액 확인
                                    view.remainConfirm();
                                    break;  // 초기 화면으로 돌아감
                                case 3: // 로그아웃
                                    System.out.println("로그아웃 되었습니다.");
                                    return;  // 로그아웃 후 종료
                                default:
                                    System.out.println("잘못 입력했습니다.");
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
    public static void handleProductPurchase(String id ,String productName) {
        productService.minusBalance(id, productName);
        productService.minusStock(productName);
        int result = saleService.addSalesInfo(id,productName);

        int stock = customerService.StockInfo(productName);
        int balance = productService.BalanceInfo(id);


        if (result != 0) {
            System.out.println(productName + "출력 완료, 재고는 " + stock + " 잔액은 " + balance + "원 입니다.");
        }else{
            System.out.println("제품 출력 실패");
        }
    }
}
