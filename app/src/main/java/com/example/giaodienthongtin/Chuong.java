package com.example.giaodienthongtin;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Chuong extends Fragment {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    ArrayList<M_Chuong> list=new ArrayList<>();
    RecyclerView rcv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_chuong, container, false);
        rcv = view.findViewById(R.id.rcv);
        list.add(new M_Chuong(1));
        list.add(new M_Chuong(2));
        Adapter_Chuong adapter = new Adapter_Chuong(getContext(),list);
        rcv.setLayoutManager(new LinearLayoutManager(getContext()));
        rcv.setAdapter(adapter);
        return view;
    }

}
