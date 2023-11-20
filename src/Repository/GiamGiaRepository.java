/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
import Repository.DBConnect;

import Model.Phieugiamgia;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class GiamGiaRepository {
    public List<Phieugiamgia> getAll() {
        String query = "select phieu_giam_gia.Id,phieu_giam_gia.san_pham_id,phieu_giam_gia.chuong_trinh,phieu_giam_gia.muc_giam,phieu_giam_gia.so_luong,phieu_giam_gia.ngay_tao,phieu_giam_gia.ngay_bat_dau,phieu_giam_gia.ngay_ket_thuc from phieu_giam_gia";

        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<Phieugiamgia> lists = new ArrayList<>();
            while (rs.next()) {
                Phieugiamgia gg= new Phieugiamgia(rs.getInt(1),rs.getString(2),
                                rs.getString(3),rs.getInt(4) ,rs.getInt(5),
                                rs.getDate(6), rs.getDate(7),rs.getDate(8));
                lists.add(gg);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public void deletephieu(int Id) {
        String sql = "DELETE FROM phieu_giam_gia WHERE Id=?";

        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            // Set parameter
            ps.setObject(1, Id);

            // Execute the delete
            ps.executeUpdate();

        } catch (SQLException e) {
            // Handle specific database exceptions
            e.printStackTrace();
        }
    }

    public boolean add(Phieugiamgia gg) {
        int check = 0;
        String query = "INSERT INTO phieu_giam_gia (san_pham_id, chuong_trinh,muc_giam,so_luong,ngay_tao, ngay_bat_dau, ngay_ket_thuc) VALUES(?,?,?,?,?,?,?)";
                   
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
           
            
            ps.setObject(1, gg.getSanphamid());
            ps.setObject(2,gg.getTenchuongtrinh());
            ps.setObject(3, gg.getMucgiamgia());
            ps.setObject(4, gg.getSoluong());
            ps.setObject(5, gg.getNgaytao());
            ps.setObject(6, gg.getNgaybatdau());
            ps.setObject(7, gg.getNgayketthuc());
            
            
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
    

    public boolean delete(String Id) {
        int check = 0;
        String query = """
                        DELETE FROM phieu_giam_gia              
                        WHERE Id = ?
                     """;
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, Id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
