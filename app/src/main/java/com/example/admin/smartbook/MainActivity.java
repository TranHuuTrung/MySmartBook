package com.example.admin.smartbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_book;
    private Button btn_write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_book = (Button) findViewById(R.id.btn_book);
        btn_write = (Button) findViewById(R.id.btn_write);
        btn_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bookintent = new Intent(MainActivity.this, ListBookActivity.class);
                startActivity(Bookintent);
            }
        });
        btn_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Writeintent = new Intent(MainActivity.this, WriteActivity.class);
                startActivity(Writeintent);
            }
        });


    }
}
