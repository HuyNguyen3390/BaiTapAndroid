package com.example.baith293_60139137;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nutIntro = (Button) findViewById(R.id.btnLogin);
        nutIntro.setOnClickListener(XulychuyensangLogin);
    }

    View.OnClickListener XulychuyensangLogin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent iLogin = new Intent(MainActivity.this, ActivityLogin.class);
            startActivity(iLogin);
        }
    };
}