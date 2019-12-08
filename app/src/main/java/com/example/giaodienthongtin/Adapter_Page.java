package com.example.giaodienthongtin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter_Page extends RecyclerView.Adapter<Adapter_Page.ViewHolder>{
    Context context;
    ArrayList<M_page> pageArrayList;

    public Adapter_Page(Context context, ArrayList<M_page> pageArrayList) {
        this.context = context;
        this.pageArrayList = pageArrayList;
    }

    @NonNull
    @Override
    public Adapter_Page.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_page,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Page.ViewHolder holder, int position) {
        Picasso.with(context).load(pageArrayList.get(position).getLink()).into(holder.Imv);
    }

    @Override
    public int getItemCount() {
        return pageArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView Imv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Imv = itemView.findViewById(R.id.Imv);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {


        }
    }
}
