package com.example.klayton.trucoswhatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {

    Button b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        b = (Button)findViewById(R.id.button2);
        c = (Button)findViewById(R.id.button3);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Page2.this,Page3.class);
                startActivity(i);
            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Page2.this,Page4.class);
                startActivity(i);
            }
        });



    }

}
