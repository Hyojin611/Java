
package service;

import dto.ProductDto;
import repository.ProductRepository;
import repository.CustomerRepository;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminService {
    private ProductRepository productRepository;
    private CustomerRepository customerRepository;
    Scanner sc = new Scanner(System.in);

    public AdminService() {
        productRepository = new ProductRepository();
        customerRepository = new CustomerRepository();
    }

    // 제품 추가
    public void addProduct() {
        // 제품 추가 로직
        System.out.println("제품을 추가합니다.");
        System.out.println("제품명을 입력하세요:");
        String productName = sc.nextLine();

        System.out.println("가격을 입력하세요:");
        int price = sc.nextInt();

        System.out.println("재고 수량을 입력하세요:");
        int stock = sc.nextInt();
        sc.nextLine();

        ProductDto product = new ProductDto(productName, price, stock);

        boolean result = productRepository.addProduct(product);

        if (result) {
            System.out.println("제품이 추가되었습니다.");
        } else {
            System.out.println("제품 추가에 실패했습니다.");
        }
    }



    public void updateProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 제품 수정 ===");

        // 제품 ID 입력 받기
        System.out.print("수정할 제품 ID를 입력하세요: ");
        scanner.nextLine();
        String proId = scanner.nextLine();

        // 제품 이름 입력 받기
        System.out.print("제품 이름을 입력하세요: ");
        String name = scanner.nextLine();

        // 가격 입력 받기
        int price = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("가격을 입력하세요: ");
                price = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("유효하지 않은 입력입니다. 정수 값을 입력해주세요.");
                scanner.nextLine();
            }
        }

        // 재고 입력 받기
        int stock = 0;
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("재고를 입력하세요: ");
                stock = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("유효하지 않은 입력입니다. 정수 값을 입력해주세요.");
                scanner.nextLine();
            }
        }

        // 입력값을 ProductDto에 설정
        ProductDto productDto = new ProductDto(proId, name, price, stock);

        // 제품 수정
        boolean result = productRepository.updateProduct(productDto);
        if (result) {
            System.out.println("제품 수정이 완료되었습니다.");
        } else {
            System.out.println("제품 수정에 실패했습니다.");
        }
    // 제품 수정
//    public void updateProduct() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("수정할 제품 ID: ");
//        String proId = String.valueOf(scanner.nextLine());  // 수정할 제품의 ID 입력 받기
//        scanner.nextLine();  // 버퍼 비우기
//
//        System.out.print("새로운 제품명: ");
//        int name = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("새로운 가격: ");
//        int price = scanner.nextInt();
//
//        System.out.print("새로운 재고: ");
//        int stock = scanner.nextInt();
//
//        boolean isUpdated = productRepository.updateProduct(proId, name, price, stock);
//
//        if (isUpdated) {
//            System.out.println("제품이 성공적으로 수정되었습니다.");
//        } else {
//            System.out.println("제품 수정에 실패했습니다.");
//        }
//    }
//

        }
    // 제품 삭제
    public void deleteProduct() {

        System.out.println("제품을 삭제합니다.");
        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine(); // 삭제할 제품 이름 입력받음

        ProductDto productToDelete = productRepository.getProductById(productName); // 제품 조회

        if (productToDelete != null) {
            boolean result = productRepository.deleteProduct(productName); // 삭제 메서드 호출
            if (result) {
                System.out.println("제품이 삭제되었습니다.");
            } else {
                System.out.println("제품 삭제에 실패했습니다.");
            }
        } else {
            System.out.println("제품을 찾을 수 없습니다.");
        }
    }

    // 모든 제품 조회
    public void viewAllProducts() {
        // 제품 조회 로직
        System.out.println("모든 제품을 조회합니다.");
    }

    // 회원 관리 (추가, 수정, 삭제, 조회)
    public void addCustomer() {
        // 회원 추가 로직
        System.out.println("회원 추가 기능");
    }

    public void updateCustomer() {
        // 회원 수정 로직
        System.out.println("회원 수정 기능");
    }

    public void deleteCustomer() {
        // 회원 삭제 로직
        System.out.println("회원 삭제 기능");
        System.out.println("삭제할 제품의 이름을 입력하세요:");
        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine();
        boolean result = productRepository.deleteProduct(productName);

        if (result) {
            System.out.println("제품이 삭제되었습니다.");
        } else {
            System.out.println("제품 삭제에 실패했습니다.");
        }
    }

    public void viewAllCustomers() {
        // 회원 조회 로직
        System.out.println("모든 회원을 조회합니다.");
    }

    // 제품별 판매 현황
    public void viewProductSales() {
        System.out.println("제품별 판매현황을 조회합니다.");
        // 실제 판매량과 금액 계산 로직 구현
    }

    // 회원별 판매 현황
    public void viewCustomerSales() {
        System.out.println("회원별 판매현황을 조회합니다.");
        // 실제 회원별 판매금액과 충전잔액 계산 로직 구현
    }
}