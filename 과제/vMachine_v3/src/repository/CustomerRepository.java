package repository;

import db.DBconn;
import dto.CustomerDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class CustomerRepository{

    int result = 0; // 쿼리실행 결과를 담을 변수(성공 : 양수, 실패 : 0)
    Connection dbConn = DBconn.getConnection();
    PreparedStatement psmt = null;
    String sql;


    public int insertuserdata(CustomerDto dto) {
        try {
            sql = "INSERT INTO customer(cus_id,password,name,phone_number) ";
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

}
