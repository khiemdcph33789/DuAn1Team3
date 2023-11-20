/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import Model.HangDoiModel;


/**
 *
 * @author Administrator
 */
public class HangDoiRepository {
    private ArrayList<HangDoiModel> list;

    Connection con;
    Statement st;
    PreparedStatement ps;

    public HangDoiRepository() {
        list = new ArrayList<>();
        try {
            con = DBConnect.getConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
        LoadHangDoi();

    }

    public void LoadHangDoi() {
        list.clear();
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("Select *  from doi_hang");
            while (rs.next()) {
                int ID = rs.getInt(1);
                int ID_DH = rs.getInt(2);
                Date date = rs.getDate(3);
                String ly_do = rs.getString(4);
                String trang_thai = rs.getString(5);
                HangDoiModel M = new HangDoiModel(ID, ID_DH, date, ly_do, trang_thai);
                list.add(M);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<HangDoiModel> getList() {
        return list;

    }

    public void setList(ArrayList<HangDoiModel> list) {
        this.list = list;

    }

    public void Add(HangDoiModel M) {
        list.clear();
        try {
            ps = con.prepareStatement("Insert into doi_hang(hoa_don_id,ngay_doi_hang,ly_do,trang_thai) values(?,?,?,?)");
//            ps.setInt(1, M.getID());
            ps.setInt(1, M.getHoa_don_ID());
            ps.setDate(2, new java.sql.Date(M.getDate().getTime()));
            ps.setString(3, M.getLyDo());
            ps.setString(4, M.getTrangThai());
            ps.execute();
            LoadHangDoi();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean Delete(int ID) {
        try {
            ps = con.prepareStatement("Delete from doi_hang where ID = ?");
            ps.setInt(1, ID);
            ps.execute();
            LoadHangDoi();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }
    public void Update(int ID,Date date, String lydo, String trangthai) {
        try {
            ps = con.prepareStatement("Update doi_hang SET ngay_doi_hang = ?, ly_do = ?, trang_thai = ? where ID =? ");
            ps.setDate(1, new java.sql.Date(date.getTime()));
            ps.setString(2, lydo);
            ps.setString(3, trangthai);
            ps.setInt(4,ID);
            ps.execute();
            LoadHangDoi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

