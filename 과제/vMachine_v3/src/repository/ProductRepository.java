package repository;

import db.DBconn;
import dto.CustomerDto;
import dto.ProductDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private Connection dbConn = DBconn.getConnection();
    private PreparedStatement psmt = null;
    private ResultSet rs = null;
    private String sql;

    // 데이터베이스에서 제품 목록 조회
    public List<ProductDto> getProductList() {
        List<ProductDto> productList = new ArrayList<>();

       try (PreparedStatement psmt = dbConn.prepareStatement("SELECT * FROM products");
                ResultSet rs = psmt.executeQuery()) {

            // 조회한 데이터를 ProductDto에 담아서 리스트에 추가
            while (rs.next()) {
                ProductDto productDto = new ProductDto();
                productDto.setProId(rs.getString("pro_id"));
                productDto.setProductName(rs.getString("product_name"));
                productDto.setPrice(rs.getInt("price"));
                productDto.setStock(rs.getInt("stock"));
                productDto.setStatus(rs.getInt("status") == 1);  // DB의 status 값이 1이면 true, 0이면 false
                productList.add(productDto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    // 제품 추가
    public int addProducts(ProductDto productDto) {
        try {
            sql = "UPDATE products SET product_name = ?, price = ?, stock = ?, status = ? WHERE pro_id = ?";
            psmt = dbConn.prepareStatement(sql);
            psmt.setString(1, productDto.getProductName());
            psmt.setInt(2, productDto.getPrice());
            psmt.setInt(3, productDto.getStock());
            psmt.setInt(4, productDto.isStatus() ? 1 : 0);
            psmt.setString(5, productDto.getProId());

            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    // 제품 삭제
    public int deleteProduct(String proId) {
        try {
            sql = "DELETE FROM products WHERE pro_id = ?";
            psmt = dbConn.prepareStatement(sql);
            psmt.setString(1, proId);

            return psmt.executeUpdate();  // 성공하면 1, 실패하면 0
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateProduct(ProductDto productDto) {
        try {
            sql = "UPDATE products SET product_name = ?, price = ?, stock = ?, status = ? WHERE pro_id = ?";
            psmt = dbConn.prepareStatement(sql);
            psmt.setString(1, productDto.getProductName());
            psmt.setInt(2, productDto.getPrice());
            psmt.setInt(3, productDto.getStock());
            psmt.setInt(4, productDto.isStatus() ? 1 : 0);
            psmt.setString(5, productDto.getProId());

            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public ProductDto getProductById(String proId) {
        ProductDto productDto = null;
        try {
            sql = "SELECT * FROM products WHERE pro_id = ?";
            psmt = dbConn.prepareStatement(sql);
            psmt.setString(1, proId);

            rs = psmt.executeQuery();

            if (rs.next()) {
                productDto = new ProductDto();
                productDto.setProId(rs.getString("pro_id"));
                productDto.setProductName(rs.getString("product_name"));
                productDto.setPrice(rs.getInt("price"));
                productDto.setStock(rs.getInt("stock"));
                productDto.setStatus(rs.getInt("status") == 1);  // DB의 status 값이 1이면 true, 0이면 false
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (psmt != null) psmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return productDto;
    }

    public void minusStock(String productName) {
        try {
            sql = "UPDATE products SET stock = stock - 1 WHERE product_name = ? ";
            psmt = dbConn.prepareStatement(sql);
            psmt.setString(1, productName);

            psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void minusBalance(String id, String productName) {
        try {
            sql = "UPDATE customers c , ( SELECT price FROM products WHERE product_name = ? ) p  SET c.balance = c.balance - p.price WHERE cus_id = ? ";
            psmt = dbConn.prepareStatement(sql);
            psmt.setString(1, productName);
            psmt.setString(2, id);

            psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public int BalanceInfo(String id) {
        CustomerDto dto = new CustomerDto();

        String query = "SELECT balance FROM customers WHERE cus_id = ? ";

        try {
            PreparedStatement stmt = dbConn.prepareStatement(query);
            stmt.setString(1, id);
            try (ResultSet rs = stmt.executeQuery()){
                while (rs.next()) {
                    dto.setBalance(rs.getInt("balance"));
                }
            }
            return dto.getBalance();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

