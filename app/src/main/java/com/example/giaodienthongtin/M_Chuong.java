package com.example.giaodienthongtin;

import java.util.ArrayList;

public class M_Chuong {
    ArrayList<M_Link> chuong;

    public M_Chuong(ArrayList<M_Link> chuong) {
        this.chuong = chuong;
    }

    public ArrayList<M_Link> getChuong() {
        return chuong;
    }

    public void setChuong(ArrayList<M_Link> chuong) {
        this.chuong = chuong;
    }
}
