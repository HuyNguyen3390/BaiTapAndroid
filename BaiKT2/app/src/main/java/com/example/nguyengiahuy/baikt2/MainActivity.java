package com.example.nguyengiahuy.baikt2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText Nhap;
    Button btnOnclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Tinh_tip(View view) {
        Nhap = (EditText) findViewById(R.id.edtNhap);
        int so = Integer.parseInt((Nhap.getText().toString()));
        btnOnclick = (Button) findViewById(R.id.btnCal);
        btnOnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kq = 0;
                RadioButton rad13 = (RadioButton) findViewById(R.id.rad13);
                RadioButton rad15 = (RadioButton) findViewById(R.id.rad15);
                RadioButton rad18 = (RadioButton) findViewById(R.id.rad18);

                if (rad13.isChecked() == true)
                    kq = (so * 13) / 100;
                if (rad15.isChecked() == true)
                    kq = (so * 15) / 100;
                if (rad18.isChecked() == true)
                    kq = (so * 18) / 100;

                //Toast.makeText(getApplicationContext(), "Tien tip tinh duoc la: ",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "Your tip will be " + kq + "$", Toast.LENGTH_SHORT).show();
            }
        });
    }
}