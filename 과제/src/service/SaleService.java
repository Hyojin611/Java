package service;

import dto.SaleDto;
import repository.SaleRepository;

public class SaleService {
    SaleRepository saleRepository = new SaleRepository();

    public void showSaleHistory() {
    }

    public void recordSale(SaleDto saleDto) {
        SaleRepository saleRepository = null;
        int result = saleRepository.addSale(saleDto);
        if (result > 0) {
            System.out.println("판매 기록이 성공적으로 저장되었습니다.");
        } else {
            System.out.println("판매 기록 저장에 실패했습니다.");
        }
    }

    public int addSalesInfo(String id, String productName) {
        return saleRepository.addSaleInfo(id, productName);
    }

    public class SalesService {

        private SaleRepository saleRepository = new SaleRepository();

        // 판매 내역 추가
        public int recordSale(SaleDto saleDto) {
            return saleRepository.addSale(saleDto);
        }

        // 판매 내역 조회
        public void showSaleHistory() {
            saleRepository.getSaleHistory().forEach(System.out::println);
        }
    }
}
