package com.example.giaodienthongtin;

import android.widget.EditText;

import java.util.ArrayList;

public class M_Link {
    ArrayList<String> link;

    public M_Link(ArrayList<String> link) {
        this.link = link;
    }

    public ArrayList<String> getLink() {
        return link;
    }

    public void setLink(ArrayList<String> link) {
        this.link = link;
    }
}
