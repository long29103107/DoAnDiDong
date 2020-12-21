package com.example.myapplication.model;

public class MonAn {
    /** @pdOid d25f8a99-4779-4a84-a4c9-d74344e8e762 */
    private int Id;
    /** @pdOid f0646d8e-4244-40a7-a4ad-7db404cf3eda */
    private String TenMonAn;
    /** @pdOid 5e8ac44b-a916-4718-9976-f0de806f3b70 */
    private int DonGia;
    private String MoTa;
    private String HinhAnh;

    public MonAn(int id, String tenMonAn, int donGia, String moTa) {
        Id = id;
        TenMonAn = tenMonAn;
        DonGia = donGia;
        MoTa = moTa;
    }

    public void setTenMonAn(String tenMonAn) {
        TenMonAn = tenMonAn;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setDonGia(int donGia) {
        DonGia = donGia;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getId() {
        return Id;
    }

    public int getDonGia() {
        return DonGia;
    }

    public String getMoTa() {
        return MoTa;
    }

    public String getTenMonAn() {
        return TenMonAn;
    }
}
