package dto;

public class ProductDto {
    private String proId;
    private String productName;
    private int price;
    private int stock;
    private boolean status;

    public ProductDto(){}

    public ProductDto(String proId, String productName, int price, int stock,boolean status) {
        this.proId = proId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.status = status;

    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = (status == 1); // 1이면 true, 0이면 false
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "proId='" + proId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", status=" + status +
                '}';
    }
}
