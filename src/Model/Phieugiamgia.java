/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;


/**
 *
 * @author Admin
 */
public class Phieugiamgia {
    private int ID;
    private String sanphamid;
    private String tenchuongtrinh;
    private int mucgiamgia;
    private int soluong;
    private Date ngaytao;
    private Date ngaybatdau;
    private Date ngayketthuc;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSanphamid() {
        return sanphamid;
    }

    public void setSanphamid(String sanphamid) {
        this.sanphamid = sanphamid;
    }

    public String getTenchuongtrinh() {
        return tenchuongtrinh;
    }

    public void setTenchuongtrinh(String tenchuongtrinh) {
        this.tenchuongtrinh = tenchuongtrinh;
    }

    public int getMucgiamgia() {
        return mucgiamgia;
    }

    public void setMucgiamgia(int mucgiamgia) {
        this.mucgiamgia = mucgiamgia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Date getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(Date ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public Date getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(Date ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    public Phieugiamgia(int ID, String sanphamid, String tenchuongtrinh, int mucgiamgia, int soluong, Date ngaytao, Date ngaybatdau, Date ngayketthuc) {
        this.ID = ID;
        this.sanphamid = sanphamid;
        this.tenchuongtrinh = tenchuongtrinh;
        this.mucgiamgia = mucgiamgia;
        this.soluong = soluong;
        this.ngaytao = ngaytao;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
    }

    public Phieugiamgia() {
    }

    
    
}
