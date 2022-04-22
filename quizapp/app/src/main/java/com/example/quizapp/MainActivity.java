package com.example.quizapp;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int c1, c2, c3;
    private int tong = 0;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_nopbai = (Button) findViewById(R.id.btn_nopbai);
        RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.rb3);
        CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.cb2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.cb3);
        et1 = findViewById(R.id.et);
        btn_nopbai.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int edit1 = Integer.parseInt(et1.getText().toString());
                if (rb3.isChecked()) {
                    c1 = 1;
                } else {
                    c1 = 0;
                }
                if (cb2.isChecked()) {
                    c2 = 0;
                } else  {
                    c2 = 1;
                }
                if (edit1 == 8) {
                    c3 = 1;
                } else {
                    c3 = 0;
                }
                tong = (c1 + c2 + c3);
                Toast toast = Toast.makeText(MainActivity.this, "Ket qua: " + tong + "/3", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 20, 30);
                toast.show();
            }
        });
    }
}
