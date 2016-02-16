package com.example.klayton.trucoswhatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Page4 extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("Espiar whatsapp a Distancia");

        t1 = (TextView)findViewById(R.id.textView23);
        t2 = (TextView)findViewById(R.id.textView24);
        t3 = (TextView)findViewById(R.id.textView25);
        t4 = (TextView)findViewById(R.id.textView26);
        t5 = (TextView)findViewById(R.id.textView27);
        t6 = (TextView)findViewById(R.id.textView28);
        b = (Button)findViewById(R.id.button5);


        String l1="Para espiar un whatsapp a Distancia es mucho más fácil aún\n";

        t1.setText(l1);

        String l2 = "<font color=#ffffff> 1) </font> <font color=#a4c736>  Ingresamos a la pagina web</font>";
        t2.setText(Html.fromHtml(l2));

        String l3 ="http://www.espiarwhatsapp2016.com";
        t3.setText(l3);

        String l4 = "<font color=#ffffff> 2) </font> <font color=#a4c736>  Lean las instrucciones de la pagina web</font>";
        t4.setText(Html.fromHtml(l4));

        String l5 = "Esta pagina web solo es una de las muchas que existen que dan este servicio, esta es una de las mejores";
        t5.setText(l5);

        String l6 = "<font color=#ffffff> NOTA IMPORTANTE: </font> <font color=#a4c736>  Para evitar que esto hagan con nosotros simplemente evita instalar aplicaciones\n" +
                "que no sean de</font> <font color=#ffffff> GOOGLE PLAY </font>";

        t6.setText(Html.fromHtml(l6));

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(Page4.this,Page2.class);
                startActivity(i);
            }
        });


    }

}
