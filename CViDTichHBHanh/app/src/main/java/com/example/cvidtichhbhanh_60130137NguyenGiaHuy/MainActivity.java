package com.example.cvidtichhbhanh_60130137NguyenGiaHuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText chieudai, chieurong;
    Button tinhChuvi, tinhDientich;
    TextView ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chieudai = (EditText)findViewById(R.id.chieudai);
        chieurong = (EditText)findViewById(R.id.chieurong);
        tinhChuvi = (Button)findViewById(R.id.tinhChuvi);
        tinhDientich = (Button)findViewById(R.id.tinhDientich);
        ketqua = (TextView)findViewById(R.id.ketqua);

        tinhChuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cdai= Integer.parseInt(chieudai.getText().toString());
                int crong= Integer.parseInt(chieurong.getText().toString());
                int kqua= 2 * (cdai + crong);
                ketqua.setText("Chu vi hinh binh hanh la:"+ kqua);
            }
        });
        tinhDientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cdai= Integer.parseInt(chieudai.getText().toString());
                int crong= Integer.parseInt(chieurong.getText().toString());
                int kqua= (cdai * crong);
                ketqua.setText("Dien tich hinh binh hanh la:"+ kqua);
            }
        });

    }
}