package com.example.myapplication.model;

import java.util.LinkedList;

public class LoaiMonAN {

    /** @pdOid f7c098b2-f323-41cc-902a-c5eb85202892 */
    private int Id;
    /** @pdOid 116e6e5a-b01a-4524-a073-86e2cbb2d0b1 */
    private String TenLoai;

    /** @pdRoleInfo migr=no name=MonAn assc=Association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
    private LinkedList<MonAn> monAn;

    public LoaiMonAN(int id, String tenLoai) {
        Id = id;
        TenLoai = tenLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    /** @pdGenerated default getter */
    public LinkedList<MonAn> getMonAn() {
        return monAn;
    }

    public void setMonAn(LinkedList<MonAn> monAn) {
        this.monAn = monAn;
    }

    public void setTenLoai(String tenLoai) {
        TenLoai = tenLoai;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }
}
