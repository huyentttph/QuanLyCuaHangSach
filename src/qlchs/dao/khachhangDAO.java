/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlchs.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlchs.entity.KhachHang;
import qlchs.utils.JDBCHelper;

/**
 *
 * @author tachi
 */
public class khachhangDAO extends QLNSDAO<KhachHang, Integer> {

    final String INSERT_SQL = "INSERT INTO KHACHHANG(TenKH,SDT,Email) values(?,?,?)";
    final String UPDATE_SQL = "UPDATE KHACHHANG set TenKH=?, SDT = ?, Email=? WHERE MaKH=?";
    final String DELETE_SQL = "DELETE FROM KHACHHANG WHERE MaKH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM KHACHHANG";
    final String SELECT_BY_ID_SQL = "SELECT * FROM KHACHHANG WHERE MaKH= ?";

    @Override
    public void insert(KhachHang entity) {
        JDBCHelper.update(INSERT_SQL, entity.getTenKH(), entity.getSDT(), entity.getEmail());
    }

    @Override
    public void update(KhachHang entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getTenKH(), entity.getSDT(), entity.getEmail(), entity.getMaKH());
    }

     @Override
    public void delete(Integer id) {
      JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<KhachHang> selectAll() {
       return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang selectById(Integer id) {
          List<KhachHang> list = selectBySql(SELECT_BY_ID_SQL,id);
        if(list.isEmpty()){
            return  null;
        } 
        return list.get(0);
    }

    @Override
    public List<KhachHang> selectBySql(String sql, Object... args) {
       List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setTenKH(rs.getString("TenKH"));
                entity.setSDT(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));

                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
