package dto;

public class ProductDto {
    private String proId;
    private int productName;
    private int price;
    private int stock;
    private boolean status;
    private boolean isAvailable;

    public ProductDto(){}

    public ProductDto(String proId, int productName, int price, int stock, boolean status, boolean isAvailable) {
        this.proId = proId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.isAvailable = true;

    }

    public ProductDto(int productName, int price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public ProductDto(String productName, int price, int stock) {
    }

    public ProductDto(String proId, String name, int price, int stock) {
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public ProductDto(String proId, String productName, int price, int stock, boolean status) {
    }

    public ProductDto(String productName, int price, int stock, boolean isAvailable) {
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProductName() {
        return String.valueOf(productName);
    }

    public void setProductName(int productName) {
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

    public void setStatus(boolean status) {
        this.status = status; // 1이면 true, 0이면 false
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "proId='" + proId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", status=" + status +
                ", isAvailable=" + isAvailable +
                '}';
    }

}
