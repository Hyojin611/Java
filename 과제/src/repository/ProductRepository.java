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
    private Connection connection;

    // 데이터베이스에서 제품 목록 조회
    public List<ProductDto> getProductList() {
        List<ProductDto> productList = new ArrayList<>();

       try (PreparedStatement psmt = dbConn.prepareStatement("SELECT * FROM products");
                ResultSet rs = psmt.executeQuery()) {

            // 조회한 데이터를 ProductDto에 담아서 리스트에 추가
            while (rs.next()) {
                ProductDto productDto = new ProductDto();
                productDto.setProId(rs.getString("pro_id"));
                productDto.setProductName(Integer.parseInt(rs.getString("product_name")));
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
    public boolean addProduct(ProductDto product) {
        String sql = "INSERT INTO products (product_name, price, stock) VALUES (?, ?, ?)";

        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            // ProductDto에서 값을 가져와서 PreparedStatement에 설정
            psmt.setInt(1, Integer.parseInt(product.getProductName()));
            psmt.setInt(2, product.getPrice());
            psmt.setInt(3, product.getStock());
//            psmt.setBoolean(4, product.isAvailable());

            // 쿼리 실행 후 영향을 받은 행의 수를 확인
            int rowsAffected = psmt.executeUpdate();

            // 행이 추가되었으면 true 반환, 아니면 false 반환
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;  // 예외 발생 시 실패로 간주
    }

    // 제품 삭제
    public boolean deleteProduct(String productName) {
        String sql = "DELETE FROM products WHERE product_name = ?";
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setString(1, productName);

            int rowsAffected = psmt.executeUpdate(); // 성공 시 1 이상의 값 반환
            return rowsAffected > 0; // 삭제 성공 여부를 boolean으로 반환
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateProduct(ProductDto productDto) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String updateQuery = "UPDATE products SET product_name = ?, price = ?, stock = ? WHERE pro_id = ?";

        try {
            connection = DBconn.getConnection();
            preparedStatement = connection.prepareStatement(updateQuery);

            // 디버깅을 위한 로그 출력
            System.out.println("Updating products with ID: " + productDto.getProId());
            System.out.println("New name: " + productDto.getProductName());
            System.out.println("New price: " + productDto.getPrice());
            System.out.println("New stock: " + productDto.getStock());

            preparedStatement.setString(1, productDto.getProductName());
            preparedStatement.setInt(2, productDto.getPrice());
            preparedStatement.setInt(3, productDto.getStock());
            preparedStatement.setString(4, productDto.getProId());

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                return true;
            } else {
                System.out.println("No products found with ID: " + productDto.getProId());
                return false; // 수정할 제품이 없을 때
            }
        } catch (SQLException e) {
            System.out.println("Error updating products: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            DBconn.close();
        }
    }

    //제품 수정
//    public boolean updateProduct(String proId, int name, int price, int stock) {
//        String sql = "UPDATE products SET name = ?, price = ?, stock = ? WHERE pro_id = ?";
//
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setInt(1, name);
//            stmt.setInt(2, price);
//            stmt.setInt(3, stock);
//            stmt.setInt(4, Integer.parseInt(proId));
//
//            int rowsAffected = stmt.executeUpdate();
//            return rowsAffected > 0;  // 업데이트된 행이 있으면 true 반환
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        }
//
//    }

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
                productDto.setProductName(rs.getInt("product_name"));
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


    public List<ProductDto> getAllProducts() {
        return null;
    }

    public Iterable<Object> getSalesInfo() {
        return null;
    }

    public int addProducts(ProductDto productDto) {
        return 0;
    }

    public boolean updateProduct(String s, int name, int price, int stock) {
        return true;
    }

//    public boolean updateProduct(ProductDto product) {
//        return false;
//    }
}

