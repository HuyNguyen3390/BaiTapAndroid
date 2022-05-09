package com.example.nguyengiahuy.baith12_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView autoTV;
    private ArrayList<String> nationList;
    private ArrayAdapter<String> adapterNations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get data
        nationList.add("Vietnam");
        nationList.add("USA");
        nationList.add("England");
        nationList.add("Albania");
        nationList.add("Algeria");
        //Adapter
        adapterNations = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, nationList);
        //Autocompleted
        AutoCompleteTextView autoTV= (AutoCompleteTextView) findViewById(R.id.autoQuocGia);
        autoTV.setAdapter(adapterNations);
    }
}