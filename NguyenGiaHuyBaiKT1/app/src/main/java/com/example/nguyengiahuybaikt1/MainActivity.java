package com.example.nguyengiahuybaikt1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText ed_TK,ed_MK;
    TextView ed_SLN;
    Button btnLogin;
    int SLN = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_TK=(EditText) findViewById(R.id.edtTK);
        ed_SLN=(TextView) findViewById(R.id.tvSLN);
        ed_MK=(EditText) findViewById(R.id.edtMK);
        btnLogin=(Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*String TK=ed_TK.getText().toString().trim();
                String MK=ed_MK.getText().toString().trim();*/
                if(ed_TK.getText().toString().equals("maicuongtho") &&
                        ed_MK.getText().toString().equals("Cntt60ntu!"))
                {
                    Toast.makeText(MainActivity.this, " “User and Password is correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
                }
                SLN++;
                ed_SLN.setText(String.valueOf(SLN));
            }
        });
    }
}