package com.example.giaodienthongtin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        RecyclerView rcv =findViewById(R.id.rcv);
        ArrayList<M_page> m_page = new ArrayList<M_page>();

        m_page.add(new M_page("https://firebasestorage.googleapis.com/v0/b/doan1-11234.appspot.com/o/Komi%2FKomi-san-wa-Komyushou-Desu.-652x1024.jpg?alt=media&token=5dc367cb-65ea-43a9-a1ab-e505f6eec83c"));
        m_page.add(new M_page("https://firebasestorage.googleapis.com/v0/b/doan1-11234.appspot.com/o/17.jpg?alt=media&token=1f92be9e-479b-4d63-ba3a-9efe239cf896"));
        m_page.add(new M_page("https://firebasestorage.googleapis.com/v0/b/doan1-11234.appspot.com/o/19.jpg?alt=media&token=6a3c1b1b-8972-40b0-b308-e33adaecf0bc"));
        Adapter_Page A_page = new Adapter_Page(this, m_page);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(A_page);
    }
}
