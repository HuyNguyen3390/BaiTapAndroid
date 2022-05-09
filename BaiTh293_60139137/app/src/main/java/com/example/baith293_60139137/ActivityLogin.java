package com.example.baith293_60139137;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btnQuiz = (Button) findViewById(R.id.btnQuiz);

        btnQuiz.setOnClickListener(XulichuyensangQuiz);
    }

    View.OnClickListener XulichuyensangQuiz = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText edtTK = (EditText) findViewById(R.id.edtUsername);
            EditText edtMK = (EditText) findViewById(R.id.edtPassword);
            EditText edtEmail = (EditText) findViewById(R.id.edtEmail);
            String taikhoan = "nguyengiahuy";
            String matkhau = "123";
            String email = "huy123@gmail.com";
            if(edtTK.getText().toString().equals(taikhoan) && edtMK.getText().toString().equals(matkhau)){
                Intent iQuiz = new Intent(ActivityLogin.this, ActivityHome.class);
                iQuiz.putExtra("tennguoidung",taikhoan);
                iQuiz.putExtra("matkhau",matkhau);
                iQuiz.putExtra("emailnguoidung",email);
                startActivity(iQuiz);

            }
            else{
                Toast.makeText(getApplicationContext(), "Bạn đã nhập sai!", Toast.LENGTH_SHORT).show();
            }
        }
    };

}
