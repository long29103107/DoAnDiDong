package com.example.myapplication.model;

import java.util.LinkedList;

public class DanhSachMonAnDaChon {
    /** @pdOid 5eb3d1a8-1d88-4edf-8d0b-a7dd563fb1cf */
    private int Id;

    /** @pdRoleInfo migr=no name=Ban assc=Association2 mult=0..1 type=Aggregation */
    public Ban ban;
    /** @pdRoleInfo migr=no name=MonAn assc=Association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
    public LinkedList<MonAn> monAn;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Ban getBan() {
        return ban;
    }

    public void setBan(Ban ban) {
        this.ban = ban;
    }

    public LinkedList<MonAn> getMonAn() {
        return monAn;
    }

    public void setMonAn(LinkedList<MonAn> monAn) {
        this.monAn = monAn;
    }
}
