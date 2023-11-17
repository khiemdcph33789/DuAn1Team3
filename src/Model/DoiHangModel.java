/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
public class DoiHangModel {
    private int ID;
    private String ID_DH;
    private String ten;
    private String size;
    private String loai;
    private String kieu;
    private String mau;
    private String gia;
    private String ngaydoi;
    private String lydo;

    public DoiHangModel() {
    }

    public DoiHangModel(int ID,String ID_DH,String ten, String size, String loai, String kieu, String mau, String gia, String ngaydoi, String lydo) {
        
        this.ID = ID;
        this.ID_DH = ID_DH;
        this.ten = ten;
        this.size = size;
        this.loai = loai;
        this.kieu = kieu;
        this.mau = mau;
        this.gia = gia;
        this.ngaydoi = ngaydoi;
        this.lydo = lydo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getID_DH() {
        return ID_DH;
    }

    public void setID_DH(String ID_DH) {
        this.ID_DH = ID_DH;
    }
    
    

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getNgaydoi() {
        return ngaydoi;
    }

    public void setNgaydoi(String ngaydoi) {
        this.ngaydoi = ngaydoi;
    }

    public String getLydo() {
        return lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }
    
    

}