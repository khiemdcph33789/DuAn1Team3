/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import Model.timkiemModel;

/**
 *
 * @author Administrator
 */
public class SeachRepostory {
    private ArrayList<timkiemModel> list;
    

    String URL = "jdbc:sqlserver://localhost:1433;encrypt=false;databaseName=DuAn1";
    String user = "sa";
    String pass = "admin";
    Connection con;
    Statement st;
    PreparedStatement ps;
    public SeachRepostory(){
        list = new ArrayList<>();
        try {
            con = DriverManager.getConnection(URL, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
        LoadSeach();
        
    }
    public void LoadSeach() {
        list.clear();
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select hoa_don_chi_tiet.Id,hoa_don_chi_tiet.san_pham_ID,khach_hang_ID,Name_khach_hang,Name,PNumber,\n"
                    + "FabricType,Designs,Size,Color,SellPrice,ngay_mua\n"
                    + "from hoa_don_chi_tiet join san_pham on san_pham.Id = hoa_don_chi_tiet.hoa_don_id\n"
                    + "                               join hoa_don on hoa_don.Id = hoa_don_chi_tiet.hoa_don_id\n"
                    + "				      join khach_hang on khach_hang.Id = hoa_don_chi_tiet.hoa_don_id\n"
                    + "				      join san_pham_chi_tiet on san_pham_chi_tiet.Id = hoa_don_chi_tiet.hoa_don_id");
            
            while (rs.next()) {
                int ID = rs.getInt("Id");
                
                String sp_ID = rs.getString("san_pham_ID");
                String kh_ID = rs.getString("khach_hang_ID");
                String ten_KH = rs.getString("Name_khach_hang");
                String ten_SP = rs.getString("name");
                int sdt = rs.getInt("PNumber");
                String loai = rs.getString("FabricType");
                String kieu = rs.getString("designs");
                String size = rs.getString("size");
                String mau = rs.getString("color");
                String gia = rs.getString("sellprice");
                String ngaymua = rs.getString("ngay_mua");
                
                timkiemModel tm = new timkiemModel(ID, sp_ID, kh_ID, ten_KH, ten_SP, sdt, size, loai, kieu, mau, gia, ngaymua);
                list.add(tm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<timkiemModel> getList() {
        return list;

    }

    public void setList(ArrayList<timkiemModel> list) {
        this.list = list;

    }
    public void search(int productID) {
        
        list.clear();
        try {
            // Assuming 'con' is your Connection object
            PreparedStatement stm = con.prepareStatement("SELECT hoa_don_chi_tiet.Id, hoa_don_chi_tiet.san_pham_ID, khach_hang_ID, Name_khach_hang, Name, PNumber, "
                    + "FabricType, Designs, Size, Color, SellPrice, ngay_mua "
                    + "FROM hoa_don_chi_tiet "
                    + "JOIN san_pham ON san_pham.Id = hoa_don_chi_tiet.san_pham_ID "
                    + "JOIN hoa_don ON hoa_don.Id = hoa_don_chi_tiet.hoa_don_id "
                    + "JOIN khach_hang ON khach_hang.Id = hoa_don_chi_tiet.khach_hang_ID "
                    + "JOIN san_pham_chi_tiet ON san_pham_chi_tiet.Id = hoa_don_chi_tiet.san_pham_ID "
                    + "WHERE PNumber = ?");

            stm.setInt(1, productID); // Set the parameter value

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                 //Assuming you want to print the results
//                System.out.println("Id: " + rs.getString(1)
//                        + ", San Pham ID: " + rs.getString(2)
//                        + ", Khach Hang ID: " + rs.getString(3)
//                        + ", Name Khach Hang: " + rs.getString(4)
//                        + ", Name: " + rs.getString(5)
//                        + ", PNumber: " + rs.getString(6)
//                        + ", FabricType: " + rs.getString(7)
//                        + ", Designs: " + rs.getString(8)
//                        + ", Size: " + rs.getString(9)
//                        + ", Color: " + rs.getString(10)
//                        + ", SellPrice: " + rs.getString(11)
//                        + ", Ngay Mua: " + rs.getString(12));
//-----------------------------------------------------------
                int ID = rs.getInt("Id");  
                String sp_ID = rs.getString("san_pham_ID");
                String kh_ID = rs.getString("khach_hang_ID");
                String ten_KH = rs.getString("Name_khach_hang");
                String ten_SP = rs.getString("name");
                int sdt = rs.getInt("PNumber");
                String loai = rs.getString("FabricType");
                String kieu = rs.getString("designs");
                String size = rs.getString("size");
                String mau = rs.getString("color");
                String gia = rs.getString("sellprice");
                String ngaymua = rs.getString("ngay_mua");

                timkiemModel tm = new timkiemModel(ID, sp_ID, kh_ID, ten_KH, ten_SP, sdt, size, loai, kieu, mau, gia, ngaymua);
                list.add(tm);
                System.out.println(tm);
                
            
            
            }

            System.out.println("Thành công");

        } catch (SQLException ex) {
            ex.printStackTrace();
       }
    }
}



