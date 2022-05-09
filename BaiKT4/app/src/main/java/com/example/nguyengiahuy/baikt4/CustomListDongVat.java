package com.example.nguyengiahuy.baikt4;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListDongVat extends BaseAdapter {
    private List<DongVat> listData;              // Danh sách mục dữ liệu cho Adapter của mình
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListDongVat(List<DongVat> listData, Context aContext) {
        this.listData = listData;
        this.context = context;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int i) {
        return listData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyCustomItemListView row;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.list_item, null);
            row = new MyCustomItemListView();
            row.imageDongVat = (ImageView) view.findViewById(R.id.imvAnh);
            row.textViewDongVat = (TextView) view.findViewById(R.id.tvTen);
            row.textViewDacTinh = (TextView) view.findViewById(R.id.tvDacTinh);
            view.setTag(row);
        } else {
            row = (MyCustomItemListView) view.getTag();
        }
        DongVat dongVat = this.listData.get(i);
        row.textViewDongVat.setText(dongVat.getTendv());
        row.textViewDacTinh.setText("Đặc tính: " + dongVat.getDactinḥ̣());
        row.imageDongVat.setImageResource(dongVat.getIDHinhAnh());
        return view;
    }

    static class MyCustomItemListView {
        ImageView imageDongVat;
        TextView textViewDongVat;
        TextView textViewDacTinh;
    }
}