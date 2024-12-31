package dto;

import java.time.LocalDateTime;

public class SaleDto {
    private int saleId;
    private String cusId;
    private String proId;
    private int totalPrice;
    private LocalDateTime salesDate;
    private double totalPurchases;  // 총 구매 금액


    public SaleDto(){
        this.salesDate = LocalDateTime.now();
    }

    public SaleDto(int saleId, String cusId, String proId, int totalPrice, LocalDateTime salesDate) {
        this.saleId = saleId;
        this.cusId = cusId;
        this.proId = proId;
        this.totalPrice = totalPrice;
        this.salesDate = salesDate;
        this.totalPurchases = totalPrice;
    }

    public SaleDto(String customerId, double totalPurchases) {
    }

    public int getSaleId() {

        return saleId;
    }

    public void setSaleId(int saleId)
    {
        this.saleId = saleId;
    }

    public String getCusId() {

        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getProId() {

        return proId;
    }

    public void setProId(String proId) {

        this.proId = proId;
    }

    public int getTotalPrice() {

        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(LocalDateTime salesDate) {
        this.salesDate = salesDate;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    @Override
    public String toString() {
        return "SaleDto{" +
                "saleId=" + saleId +
                ", cusId='" + cusId + '\'' +
                ", proId='" + proId + '\'' +
                ", totalPrice=" + totalPrice +
                ", salesDate=" + salesDate +
                ", totalPurchases=" + totalPurchases +
                '}';
    }
}
