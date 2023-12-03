/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.PhieuGiamGiaChiTiet;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class GiamGiaChiTietRepository {
    private ArrayList<PhieuGiamGiaChiTiet> list;
    private Connection conn;
    private Statement stm;
    private PreparedStatement psm;

    public GiamGiaChiTietRepository() {
        list = new ArrayList<>();
        conn = DBConnect.getConnection();
        GetDataTable();
    }

    public ArrayList<PhieuGiamGiaChiTiet> getList() {
        return list;
    }

    public void setList(ArrayList<PhieuGiamGiaChiTiet> list) {
        this.list = list;
    }

    public void GetDataTable() {
        list.clear();
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from phieu_giam_gia_chi_tiet");
            while (rs.next()) {
                int ID  = rs.getInt(1);
                int IDPGG = rs.getInt(2);
                int IDKH = rs.getInt(3);
                PhieuGiamGiaChiTiet PG = new PhieuGiamGiaChiTiet(ID, IDPGG, IDKH);
                list.add(PG);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void Add(PhieuGiamGiaChiTiet M) {
        list.clear();
        try {
            psm = conn.prepareStatement("Insert into phieu_giam_gia_chi_tiet(ID_phieu_giam_gia,ID_Khach_hang) values (?,?)");
           
            psm.setInt(1, M.getIDPGG());
            psm.setInt(2, M.getIDKH());
            
            psm.execute();
            GetDataTable();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//    
//

    public boolean Delete(int ID) {
        try {
            psm = conn.prepareStatement("Delete from phieu_giam_gia_chi_tiet where ID = ?");
            psm.setInt(1, ID);
            psm.execute();
            GetDataTable();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

