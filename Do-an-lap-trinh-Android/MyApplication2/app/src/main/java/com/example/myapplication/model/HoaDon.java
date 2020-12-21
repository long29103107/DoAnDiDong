package com.example.myapplication.model;

import java.util.Date;
import java.util.LinkedList;

public class HoaDon {
    /** @pdOid 7de83d5a-d97b-47e6-956c-dc68cb656c15 */
    private int Id;
    /** @pdOid 6c8814f7-14f4-4838-b384-18599dd66d0f */
    private Date ngayTao;

    /** @pdRoleInfo migr=no name=ChiTietHoaĐon assc=Association4 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
    private LinkedList<ChiTietHoaĐon> chiTietHoaĐon;


    /** @pdGenerated default getter */
    public LinkedList<ChiTietHoaĐon> getChiTietHoaĐon() {
        return chiTietHoaĐon;
    }
    public void setChiTietHoaĐon(LinkedList<ChiTietHoaĐon> newChiTietHoaĐon) {
        chiTietHoaĐon=newChiTietHoaĐon;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
}
