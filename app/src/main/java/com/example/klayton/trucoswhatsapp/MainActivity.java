package com.example.klayton.trucoswhatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t,t1,t2,t3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        t = (TextView)findViewById(R.id.textView3);
        t1 = (TextView)findViewById(R.id.textView4);
        t2 = (TextView)findViewById(R.id.textView);
        t3 = (TextView)findViewById(R.id.textView5);

        b = (Button)findViewById(R.id.button);

        setTitle("Trucos Whatsapp");

        String d = "<p align='justify' > Aprende como se puede espiar las conversaciones de whatsapp para que lo uses a tu favor y no permitas que te espíen a TI  </p>";

        //t2.setText(Html.fromHtml(d));


        String ll = "Heloow " + "\n" +"               world";

        //t2.setText(ll);

        String k = "<font color=#e82583>Forma Física: </font> <font color=#ffffff>  Si la persona que te quiere espiar tiene acceso a tu celular aunque sea solo por 1 minuto</font>";

        t.setText(Html.fromHtml(k));

        String l = "<font color=#e82583>Forma Remota: </font> <font color=#ffffff>  No importa si te encuentras en otro país, igual podrán espiarte los chats de whatsapp</font>";

        t1.setText(Html.fromHtml(l));


        String last = "Esta guía esta desarrollada para que evites" + "\n  ser víctima de algún hacker o persona que \n     desee ver tus mensajes privados de\n      \t\t\t\t         whatsapp";

        t3.setText(last);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this,Page2.class);
                startActivity(n);
            }
        });



    }


}
