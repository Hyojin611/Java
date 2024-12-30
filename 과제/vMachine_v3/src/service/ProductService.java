package service;

import dto.ProductDto;
import dto.SaleDto;
import repository.ProductRepository;

import java.time.LocalDateTime;
import java.util.List;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();
    private SaleService saleService = new SaleService();

    public int addProduct(ProductDto productDto) {
        return productRepository.addProducts(productDto);
    }

    public int updateProduct(ProductDto productDto) {
        return productRepository.updateProduct(productDto);
    }

    public int deleteProduct(String proId) {
        return productRepository.deleteProduct(proId);
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

    public void minusBalance(String id,String productName) {
        productRepository.minusBalance(id,productName);
    }

    public int BalanceInfo(String id) {
        return productRepository.BalanceInfo(id);
    }
}
