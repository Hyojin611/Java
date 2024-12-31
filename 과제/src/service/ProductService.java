package service;

import dto.ProductDto;
import dto.SaleDto;
import repository.ProductRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();
    private SaleService saleService = new SaleService();


    public int addProduct(ProductDto productDto) {
        return productRepository.addProducts(productDto);
    }

    public boolean updateProduct(ProductDto productDto) {
        // ProductDto에서 값을 추출
        int proId = Integer.parseInt(productDto.getProId());  // productDto 객체에서 proId 추출
        int name = Integer.parseInt(productDto.getProductName());  // name은 String이므로 그대로 사용
        int price = productDto.getPrice();  // price는 int이므로 그대로 사용
        int stock = productDto.getStock();  // stock은 int이므로 그대로 사용

        // 추출한 값을 ProductRepository의 updateProduct 메서드에 전달
        return productRepository.updateProduct(String.valueOf(proId), name, price, stock);
    }


    public boolean deleteProduct(String proId) {
        // 제품 삭제 메서드 호출
        boolean result = productRepository.deleteProduct(proId);

        if (result) {
            System.out.println("제품이 삭제되었습니다.");
        } else {
            System.out.println("제품 삭제에 실패했습니다.");
        }
        return result;
    }

    public List<ProductDto> getProductList() {
        return productRepository.getProductList();
    }

    public void buyProduct(String cusId, String proId, int quantity) {
        ProductDto product = productRepository.getProductById(proId);
        if (product != null && product.getStock() >= quantity) {
            int totalPrice = product.getPrice() * quantity;
            product.setStock(product.getStock() - quantity);  // 재고 감소
            productRepository.updateProduct(product);

            // 거래 내역 기록
            SaleDto saleDto = new SaleDto();
            saleDto.setCusId(cusId);
            saleDto.setProId(proId);
            saleDto.setTotalPrice(totalPrice);
            saleDto.setSalesDate(LocalDateTime.now());

            saleService.recordSale(saleDto);

            System.out.println("구매가 완료되었습니다. 총 금액: " + totalPrice);
        } else {
            System.out.println("재고가 부족하거나 제품을 찾을 수 없습니다.");
        }
    }

    public void minusStock(String productName) {
        productRepository.minusStock(productName);
    }

    public void minusBalance(String id, String productName) {
        productRepository.minusBalance(id, productName);
    }

    public int BalanceInfo(String id) {
        return productRepository.BalanceInfo(id);
    }


    public void viewAllProducts() {

    }

    public void updateProduct(String proId, int newPrice, int newStock, boolean newStatus) {
    }

    public ProductDto getProductById(String proId) {
        for (ProductDto product : getProductList()) {
            if (product.getProId().equals(proId)) {
                return product;
            }
        }
        return null;
    }
}
