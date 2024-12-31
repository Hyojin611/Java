package view;

import dto.ProductDto;
import service.AdminService;
import java.util.Scanner;

public class AdminView {
    private Scanner scanner;
    private AdminService adminService;

    public AdminView() {
        this.scanner = new Scanner(System.in);
        this.adminService = new AdminService();
    }

    public void adminMenu() {
        while (true) {
            System.out.println("\n===== 관리자 메뉴 =====");
            System.out.println("1. 자판기 관리");
            System.out.println("2. 회원 관리");
            System.out.println("3. 판매 관리");
            System.out.println("4. 메인 메뉴로 돌아가기");
            System.out.print("선택: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageMachine();
                    break;
                case 2:
                    manageCustomers();
                    break;
                case 3:
                    manageSales();
                    break;
                case 4:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
        //자판기 관리
    private void manageMachine() {
        while (true) {
            System.out.println("=== 자판기 관리 ===");   //  \n
            System.out.println("1. 제품 추가");
            System.out.println("2. 제품 수정");
            System.out.println("3. 제품 삭제");
            System.out.println("4. 제품 조회");
            System.out.println("5. 이전 메뉴로");
            System.out.print("선택: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adminService.addProduct();
                    break;
                case 2:
                    adminService.updateProduct();
                    break;
                case 3:
                    adminService.deleteProduct();
                    break;
                case 4:
                    adminService.viewAllProducts();
                    break;
                case 5:
                    System.out.println("이전 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private void manageCustomers() {
        while (true) {
            System.out.println("\n=== 회원 관리 ===");
            System.out.println("1. 회원 정보 입력");
            System.out.println("2. 회원 정보 수정");
            System.out.println("3. 회원 정보 삭제");
            System.out.println("4. 회원 정보 조회");
            System.out.println("5. 이전 메뉴로");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adminService.addCustomer();
                    break;
                case 2:
                    adminService.updateCustomer();
                    break;
                case 3:
                    adminService.deleteCustomer();
                    break;
                case 4:
                    adminService.viewAllCustomers();
                    break;
                case 5:
                    System.out.println("이전 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private void manageSales() {
        while (true) {
            System.out.println("\n=== 판매 관리 ===");
            System.out.println("1. 제품별 판매 현황");
            System.out.println("2. 회원별 판매 현황");
            System.out.println("3. 이전 메뉴로");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adminService.viewProductSales();
                    break;
                case 2:
                    adminService.viewCustomerSales();
                    break;
                case 3:
                    System.out.println("이전 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}

