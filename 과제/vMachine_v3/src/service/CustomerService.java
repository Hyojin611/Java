package service;

import dto.CustomerDto;
import repository.CustomerRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static db.DBconn.dbConn;

public class CustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    private PreparedStatement psmt = null;
    private ResultSet rs = null;
    private String sql;

    public int insertuserdata(CustomerDto dto) {
        return customerRepository.insertuserdata(dto);
    }

    public boolean logindata(String id, String password) {
        return customerRepository.findCustomerByIdAndPassword(id, password);
    }


    public int chargeMoneyUpdate(String id, int balance) {
        return customerRepository.chargeMoneyUpdate(id, balance);
    }

    public int remainConfirm(String id) {
        return customerRepository.remainConfirm(id);
    }

    public int StockInfo(String productName) {
        return customerRepository.StockInfo(productName);
    }

//    public boolean chargMoney(String customerId, int chargAmount) {
//        try {
//            // 고객의 현재 잔액을 조회
//            sql = "SELECT balance FROM customers WHERE cus_id = ?";
//            psmt = dbConn.prepareStatement(sql);
//            psmt.setString(1, customerId);  // 고객 ID를 설정
//            rs = psmt.executeQuery();
//
//            if (rs.next()) {
//                int currentBalance = rs.getInt("balance");
//
//                // 잔액 업데이트
//                sql = "UPDATE customers SET balance = ? WHERE customer_id = ?";
//                psmt = dbConn.prepareStatement(sql);
//                psmt.setInt(1, currentBalance + chargAmount);  // 기존 잔액에 충전 금액 추가
//                psmt.setString(2, customerId);
//
//                return psmt.executeUpdate() > 0;  // 업데이트 성공 여부 반환
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}