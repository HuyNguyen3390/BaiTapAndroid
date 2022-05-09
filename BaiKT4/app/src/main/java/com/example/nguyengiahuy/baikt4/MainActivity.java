package com.example.nguyengiahuy.baikt4;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<DongVat> list = new ArrayList<DongVat>();
        DongVat Octopus = new DongVat("Octopus","8 tentacled monster",R.drawable.octopus );
        DongVat Pig = new DongVat("Pig","Dellicous in rolls",R.drawable.pig);
        DongVat Sheep = new DongVat("Sheep", "Great for jumpers",R.drawable.sheep);
        DongVat Rabbit = new DongVat("Rabbit","Nice in a stew",R.drawable.rabbit);
        DongVat Snake = new DongVat("Snake","Great for shoes",R.drawable.snake);

        list.add(Octopus);
        list.add(Pig);
        list.add(Sheep);
        list.add(Rabbit);
        list.add(Snake);

        final ListView listView = (ListView) findViewById(R.id.lvListPro);
        listView.setAdapter(new CustomListDongVat(list, this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                DongVat animal = (DongVat) o;
                Toast.makeText(MainActivity.this, "Selected: " + " " + animal, Toast.LENGTH_SHORT).show();
            }
        });
    }
}