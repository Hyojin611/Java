package view;

import dto.CustomerDto;
import service.SaleService;

import java.util.Scanner;

public class MainView {
    private SaleService saleService = new SaleService();
    private Scanner sc = new Scanner(System.in);

    // 판매 내역 조회
    public void showSaleHistory() {
        saleService.showSaleHistory();
    }
    public void showProductMenuView(ProductView productView) {
        int option;
        while (true) {
            System.out.println("제품관리 메뉴");
            System.out.println("1. 제품 목록 보기 2. 제품 추가 3. 제품 수정 4. 제품 삭제 5. 뒤로 가기");
            option = sc.nextInt();
            switch (option) {
                case 1: //제품 목록 보기
                    productView.showProductView();
                    break;
                case 2:  //제품 추가
                    productView.addProductView();
                    break;
                case 3:  //제품 수정
                    productView.updateProductView();
                    break;
                case 4: //제품 삭제
                    productView.deleteProductView();
                    break;
                case 5:
                  return;
                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }
    }



}
