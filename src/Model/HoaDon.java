/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HoaDon {
    private int maHoaDon;
    private int khach_hang_id;
    private Date ngayMua;
    private String trangThai; 
    private BigDecimal tong_tien;

    public HoaDon() {
        this.ngayMua = new Date();
    }

    public HoaDon(int maHoaDon, int khach_hang_id, Date ngayMua, String trangThai, BigDecimal tong_tien) {
        this.maHoaDon = maHoaDon;
        this.khach_hang_id = khach_hang_id;
        this.ngayMua = ngayMua;
        this.trangThai = trangThai;
        this.tong_tien = tong_tien;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getKhach_hang_id() {
        return khach_hang_id;
    }

    public void setKhach_hang_id(int khach_hang_id) {
        this.khach_hang_id = khach_hang_id;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public BigDecimal getTong_tien() {
        return tong_tien;
    }

    public void setTong_tien(BigDecimal tong_tien) {
        this.tong_tien = tong_tien;
    }
    
}
