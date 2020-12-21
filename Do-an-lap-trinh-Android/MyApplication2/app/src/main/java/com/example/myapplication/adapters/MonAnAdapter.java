package com.example.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.MonAn;

import java.net.URI;
import java.net.URL;
import java.util.LinkedList;

public class MonAnAdapter extends RecyclerView.Adapter<MonAnAdapter.FoodViewHolder> {
    private LinkedList<MonAn> MonAn;

    public MonAnAdapter(LinkedList<MonAn> foods) {
        this.MonAn = foods;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new FoodViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.bindData(MonAn.get(position));
    }

    @Override
    public int getItemCount() {
        return MonAn.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder {
        private TextView ten;
        private TextView gia;
        private ImageView HinhAnh;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            ten=itemView.findViewById(R.id.textView2);
            gia=itemView.findViewById(R.id.Gia);
            HinhAnh=itemView.findViewById(R.id.HinhAnh);
        }
        public void bindData(MonAn monAn) {
            ten.setText(monAn.getTenMonAn());
            gia.setText(String.valueOf(monAn.getDonGia()));

            HinhAnh.setImageResource(R.drawable.ic_monan_background);
        }
    }
}
