package com.example.baith293_60139137;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityHome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent iQuizNhan = getIntent();
        String tenDN = iQuizNhan.getStringExtra("tennguoidung");
        TextView hienthi = (TextView) findViewById(R.id.tvTen);
        hienthi.setText(tenDN);
    }
}
