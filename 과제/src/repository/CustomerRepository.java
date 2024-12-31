package repository;

import db.DBconn;
import dto.CustomerDto;
import dto.ProductDto;
import dto.SaleDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    int result = 0; // 쿼리실행 결과를 담을 변수(성공 : 양수, 실패 : 0)
    Connection dbConn = DBconn.getConnection();
    PreparedStatement psmt = null;
    String sql;


    public int insertuserdata(CustomerDto dto) {
        try {
            sql = "INSERT INTO customers(cus_id,password,name,phone_number) ";
            sql = sql + "VALUES (?, ?, ?, ?) ";
            psmt = dbConn.prepareStatement(sql);
            // 전달할 인자값을 psmt 에 추가
            psmt.setString(1, dto.getCusId());
            psmt.setString(2, dto.getPassword());
            psmt.setString(3, dto.getName());
            psmt.setString(4, dto.getPhoneNumber());

            // DB 에 저장 요청
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public boolean findCustomerByIdAndPassword (String id, String password) {
        CustomerDto customer = null;
        String query = "SELECT * FROM customers WHERE cus_id = ? AND password = ?";
        try {
            PreparedStatement stmt = dbConn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()){
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int chargeMoneyUpdate(String id, int balance) {
        try {
            sql = "UPDATE customers SET balance = balance +  ? WHERE cus_id = ? ";

            psmt = dbConn.prepareStatement(sql);
            // 전달할 인자값을 psmt 에 추가
            psmt.setInt(1, balance);
            psmt.setString(2, id);

            // DB 에 저장 요청
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int remainConfirm(String id) {
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

    public int StockInfo(String productName) {
        ProductDto dto = new ProductDto();

        String query = "SELECT stock FROM products WHERE product_name = ? ";

        try {
            PreparedStatement stmt = dbConn.prepareStatement(query);
            stmt.setString(1, productName);
            try (ResultSet rs = stmt.executeQuery()){
                while (rs.next()) {
                    dto.setStock(rs.getInt("stock"));
                }
            }
            return dto.getStock();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<CustomerDto> getAllCustomers() {
        return null;
    }




    public List<SaleDto> getSalesInfo() {
        List<SaleDto> salesInfoList = new ArrayList<>();
        String query = "SELECT cus_id, SUM(amount) AS totalPurchases FROM purchase_records GROUP BY cus_id";

        try (PreparedStatement stmt = dbConn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String customerId = rs.getString("cus_id");
                double totalPurchases = rs.getDouble("totalPurchases");


                salesInfoList.add(new SaleDto(customerId,totalPurchases));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return salesInfoList;
    }
}