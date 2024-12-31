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
}