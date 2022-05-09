package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText SoA, SoB;
    Button btnClick;
    Button btnClick1;
    Button btnClick2;
    Button btnClick3;
    void getWidget(){
        btnClick = (Button) findViewById(R.id.btnCong);
        btnClick1 = (Button) findViewById(R.id.btnTru);
        btnClick2 = (Button) findViewById(R.id.btnNhan);
        btnClick3 = (Button) findViewById(R.id.btnChia);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
        btnClick.setOnClickListener(XuLyCong);
        btnClick1.setOnClickListener(XuLyTru);
        btnClick2.setOnClickListener(XuLyNhan);
        btnClick3.setOnClickListener(XuLyChia);
    }
    View.OnClickListener XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText dk_soA = (EditText) findViewById(R.id.edtA);
            int soA = Integer.parseInt(dk_soA.getText().toString());

            EditText dk_soB = (EditText) findViewById(R.id.edtB);
            int soB = Integer.parseInt(dk_soB.getText().toString());
            int ketqua = soA + soB;

            TextView dk_qk = (TextView) findViewById(R.id.tvKetQua);
            dk_qk.setText(String.valueOf(ketqua));
        }
    };

    View.OnClickListener XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText dk_soA = (EditText) findViewById(R.id.edtA);
            int soA = Integer.parseInt(dk_soA.getText().toString());

            EditText dk_soB = (EditText) findViewById(R.id.edtB);
            int soB = Integer.parseInt(dk_soB.getText().toString());
            int ketqua = soA - soB;

            TextView dk_qk = (TextView) findViewById(R.id.tvKetQua);
            dk_qk.setText(String.valueOf(ketqua));
        }
    };

    View.OnClickListener XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText dk_soA = (EditText) findViewById(R.id.edtA);
            int soA = Integer.parseInt(dk_soA.getText().toString());

            EditText dk_soB = (EditText) findViewById(R.id.edtB);
            int soB = Integer.parseInt(dk_soB.getText().toString());
            int ketqua = soA * soB;

            TextView dk_qk = (TextView) findViewById(R.id.tvKetQua);
            dk_qk.setText(String.valueOf(ketqua));
        }
    };

    View.OnClickListener XuLyChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText dk_soA = (EditText) findViewById(R.id.edtA);
            float soA = Integer.parseInt(dk_soA.getText().toString());

            EditText dk_soB = (EditText) findViewById(R.id.edtB);
            float soB = Integer.parseInt(dk_soB.getText().toString());
            float ketqua = soA / soB;

            TextView dk_qk = (TextView) findViewById(R.id.tvKetQua);
            dk_qk.setText(String.valueOf(ketqua));
        }
    };



}