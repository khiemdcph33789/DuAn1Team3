package Repository;

import java.util.ArrayList;
import Model.DoiHangModel;
import Model.timkiemModel;
import java.sql.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class DoiHangRepositity {
    private ArrayList<DoiHangModel> list;
    
    Connection con;
    Statement st;
    PreparedStatement ps;
    
    public DoiHangRepositity(){
        list = new ArrayList<>();
        try{
            con = DBConnect.getConnection();
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        LoadData();
        
    }
    public void LoadData(){
        list.clear();
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("Select *  from doi_hang_san_pham_chi_tiet");
            while (rs.next()) {
                int ID = rs.getInt("ID");
                String ID_DH = rs.getString("doi_hang_ID");
                String ten = rs.getString("name");
                String size = rs.getString("size");
                String loai = rs.getString("FabricType");
                String kieu = rs.getString("desgin");
                String mau = rs.getString("color");
                String gia = rs.getString("sellprice");
                String ngaydoi = rs.getString("ngay_doi_hang");
                String lydo = rs.getString("ly_do");
                DoiHangModel M = new DoiHangModel(ID,ID_DH, ten, size, loai, kieu, mau, gia, ngaydoi, lydo);
                list.add(M);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<DoiHangModel> getList(){
        return list;
        
    }
    public void setList(ArrayList<DoiHangModel> list){
        this.list = list;
        
    }
    
    public void Add(DoiHangModel M){
        try {
            ps = con.prepareStatement("Insert into doi_hang_san_pham_chi_tiet values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, M.getID_DH());
            ps.setString(2, M.getTen());
            ps.setString(3,M.getSize());
            ps.setString(4, M.getLoai());
            ps.setString(5, M.getKieu());
            ps.setString(6, M.getMau());
            ps.setString(7, M.getGia());
            ps.setString(8, M.getNgaydoi());
            ps.setString(9, M.getLydo());
            ps.execute();
            LoadData();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean Delete(int ID) {
        try {
            ps = con.prepareStatement("Delete from doi_hang_san_pham_chi_tiet where ID = ?");
            ps.setInt(1, ID);
            ps.execute();
            LoadData();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }
    
}
    

