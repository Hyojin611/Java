package view;

import dto.ProductDto;
import service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductView {


    ProductService productService = new ProductService();
    Scanner sc = new Scanner(System.in);

    public void showProductMenuView(ProductView productView) {
        List<ProductDto> productList = productService.getProductList(); // 제품 리스트 가져오기

        if (productList.isEmpty()) {
            System.out.println("제품 목록이 비어 있습니다.");
        } else {
            System.out.println("제품 목록:");
            for (ProductDto product : productList) {
                System.out.println("이름: " + product.getProductName() +
                        ", 가격: " + product.getPrice() +
                        ", 재고: " + product.getStock() +
                        ", 상태: " + (product.isStatus() ? "판매 중" : "판매 중지"));
            }
        }

    }

    public void addProductView() {
        System.out.println("제품을 추가합니다.");
        System.out.println("제품 ID : ");
        String proId = sc.next();
        System.out.println("제품 이름 : ");
        String productName = sc.next();
        System.out.println("제품 가격 : ");
        int price = sc.nextInt();
        System.out.println("제품 재고 : ");
        int stock = sc.nextInt();
        System.out.println("제품 상태 (1: 판매 중, 0: 판매중지): ");
        boolean status = sc.nextInt() == 1;

        ProductDto productDto = new ProductDto(proId, productName, price, stock, status);
        productService.addProduct(productDto);
        System.out.println("제품이 추가되었습니다.");
    }

    public void updateProductView() {
        System.out.println("제품을 수정합니다.");
    }

    public void deleteProductView() {
        System.out.println("제품을 삭제합니다.");
        System.out.println("삭제할 제품 ID : ");
        String proId = sc.next();
        productService.deleteProduct(proId);

    }

    public void showProductView() {
    }

}
