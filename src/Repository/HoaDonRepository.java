package Repository;

import Model.SanPham;
import Model.HoaDon;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HoaDonRepository {

    private ArrayList<HoaDon> list;
    private Connection conn;
    private Statement stm;
    private PreparedStatement psm;

    public HoaDonRepository() {
        list = new ArrayList<>();
        conn = DBConnect.getConnection();
        GetListBill();
    }

    public ArrayList<HoaDon> getList() {
        return list;
    }

    public void setList(ArrayList<HoaDon> list) {
        this.list = list;
    }

    public void GetListBill() {
        list.clear();
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("Select * from hoa_don");
            while (rs.next()) {
                int maHoaDon = rs.getInt(1);
                int khach_hang_id = rs.getInt(2);
                Date ngayMua = rs.getDate(3);
                String trangThai = rs.getString(5);
                BigDecimal tong_tien = rs.getBigDecimal(4);
                HoaDon hd = new HoaDon(maHoaDon, khach_hang_id, ngayMua, trangThai, tong_tien);
                list.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void InsertProduct(HoaDon hd) {
        try {
            psm = conn.prepareStatement("Insert into hoa_don (Ngay_Mua,Tong_Tien,Trang_Thai)"
                    + "Values (?,?,?)");
            psm.setDate(1, new java.sql.Date(hd.getNgayMua().getTime()));
            psm.setBigDecimal(2, hd.getTong_tien());
            psm.setInt(3, ConvertTrangThai(hd.getTrangThai()));
            
                        psm.execute();
            GetListBill();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

}
    public int ConvertTrangThai(String TrangThai) {
        if (TrangThai.equalsIgnoreCase("Đã Thanh Toán")) {
            return 1;
        } else if (TrangThai.equalsIgnoreCase("Hoá Đơn Chờ")) {
            return 2;
        } else if (TrangThai.equalsIgnoreCase("Hoá Đơn Huỷ")) {
            return 3;
        }
        return 4;
    }
}