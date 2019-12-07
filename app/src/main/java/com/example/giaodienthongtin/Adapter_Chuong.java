package com.example.giaodienthongtin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Chuong extends RecyclerView.Adapter<Adapter_Chuong.ViewHolder>{
    Context context;
    ArrayList<M_Chuong> chuongArrayList;

    public Adapter_Chuong(Context context, ArrayList<M_Chuong> chuongArrayList) {
        this.context = context;
        this.chuongArrayList = chuongArrayList;
    }

    @NonNull
    @Override
    public Adapter_Chuong.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_chuong,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Chuong.ViewHolder holder, int position) {
        holder.tv.setText("Chương" +(position+1));
    }

    @Override
    public int getItemCount() {
        return chuongArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {


        }
    }
}
