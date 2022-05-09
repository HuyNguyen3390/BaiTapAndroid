package com.example.nguyengiahuy.baikt3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText So;
    EditText Giatri;
    Button Them;
    Button Xoa;
    Button Sua;
    ArrayList<String> arrayList;
    ArrayAdapter<String> BoNap;
    ListView lvDS;
    int vitri= -1;
    void getWidget(){
        lvDS=findViewById(R.id.lvList);
        So=findViewById(R.id.edtSo);
        Giatri=findViewById(R.id.edtGiaTri);
        Them=findViewById(R.id.btnThem);
        Xoa=findViewById(R.id.btnXoa);
        Sua=findViewById(R.id.btnSua);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            getWidget();


            arrayList = new ArrayList<String>();
            arrayList.add("Content");
            arrayList.add("Graphics");
            arrayList.add("HardWare");
            arrayList.add("Media");
            arrayList.add("NFC");
            arrayList.add("OS");
            arrayList.add("Preference");
            BoNap = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,android.R.id.text1,arrayList);
            lvDS.setAdapter(BoNap);
            Them.setOnClickListener(XuLyThem);
            Xoa.setOnClickListener(XuLyXoa);
            Sua.setOnClickListener(XuLySua);
            lvDS.setOnItemClickListener(XuLy);
    }
        View.OnClickListener XuLyThem=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Chon = Giatri.getText().toString();
                arrayList.add(Chon);
                BoNap.notifyDataSetChanged();
            }
        };
        View.OnClickListener XuLySua=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.set(vitri,Giatri.getText().toString());
                BoNap.notifyDataSetChanged();
            }
        };
        View.OnClickListener XuLyXoa=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.remove(vitri);
                BoNap.notifyDataSetChanged();
            }
        };
        AdapterView.OnItemClickListener XuLy=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Giatri.setText(arrayList.get(i));
                String ItemDcChon = arrayList.get(i);
                Toast.makeText(MainActivity.this, "Bạn chọn " + ItemDcChon, Toast.LENGTH_SHORT).show();
                vitri = i;
                So.setText(String.valueOf(vitri + 1));
            }
        };
}