package com.example.bai2thodatnuoc_60139137_NguyenGiaHuy;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter {
    List <String> data = new ArrayList<>();
    public CustomAdapter (List <String> data) {
        this.data = data;
    }
    @Override
    public void CustomHolder onCreateViewHolder(ViewGroup viewGroup, int i){
       View view = LayoutInflater.from(viewGroup.getContext());
       return new CustomHolder(view);
    }
    @Override
    public int getItem() {
        return data.size();
    }
    class CustomHolder {
        TextView textView;
        LinearLayout linearLayout;
        public CustomHolder (View itemView){
            super(itemView);
            textView= (TextView)itemView.findViewById(R.id.poem);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.);
        }

    }

}
