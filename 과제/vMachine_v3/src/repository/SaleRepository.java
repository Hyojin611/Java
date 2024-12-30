package repository;

import db.DBconn;
import dto.SaleDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SaleRepository {

    private Connection dbConn = DBconn.getConnection();
    private PreparedStatement psmt = null;
    private ResultSet rs = null;
    private String sql;

    public int addSale(SaleDto saleDto) {
        try {
            sql = "INSERT INTO sales (cus_id, pro_id, total_price, sales_date) VALUES (?, ?, ?, ?)";
            psmt = dbConn.prepareStatement(sql);
            psmt.setString(1, saleDto.getCusId());
            psmt.setString(2, saleDto.getProId());
            psmt.setInt(3, saleDto.getTotalPrice());
            psmt.setTimestamp(4, Timestamp.valueOf(saleDto.getSalesDate()));

            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public List<SaleDto> getSaleHistory() {
        List<SaleDto> saleList = new ArrayList<>();
        try {
            sql = "SELECT * FROM sales";
            psmt = dbConn.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (rs.next()) {
                SaleDto saleDto = new SaleDto();
                saleDto.setSaleId(rs.getInt("sale_id"));
                saleDto.setCusId(rs.getString("cus_id"));
                saleDto.setProId(rs.getString("pro_id"));
                saleDto.setTotalPrice(rs.getInt("total_price"));
                saleDto.setSalesDate(rs.getTimestamp("sales_date").toLocalDateTime());

                saleList.add(saleDto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return saleList;
    }
    public int addSaleInfo(String id, String productName) {
        try {
            sql = "INSERT INTO sales (cus_id, pro_id, total_price, sales_date) SELECT ?, (SELECT pro_id FROM products WHERE product_name = ?) , (SELECT price FROM products WHERE product_name = ?) , now() ";
            psmt = dbConn.prepareStatement(sql);
            psmt.setString(1, id);
            psmt.setString(2, productName);
            psmt.setString(3, productName);

            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

