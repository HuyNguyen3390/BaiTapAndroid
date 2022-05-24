package com.example.bai2thodatnuoc_60139137_NguyenGiaHuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customAdapter= new CustomAdapter();

        }
    private List<String> poemList(){
        List<String> poemList = new ArrayList<String>();
        ArrayList<String> items= new ArrayList<String>();
    }

}