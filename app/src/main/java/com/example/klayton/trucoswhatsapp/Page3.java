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

public class Page3 extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("Espiar whatsapp de forma física");

        t1 = (TextView)findViewById(R.id.textView6);
        t2 = (TextView)findViewById(R.id.textView7);
        t3 = (TextView)findViewById(R.id.textView8);
        t4 = (TextView)findViewById(R.id.textView9);
        t5 = (TextView)findViewById(R.id.textView10);
        t6 = (TextView)findViewById(R.id.textView11);
        t7 = (TextView)findViewById(R.id.textView12);
        t8 = (TextView)findViewById(R.id.textView13);
        t9 = (TextView)findViewById(R.id.textView14);
        t10 = (TextView)findViewById(R.id.textView15);
        t11 = (TextView)findViewById(R.id.textView16);
        t12 = (TextView)findViewById(R.id.textView17);
        t13 = (TextView)findViewById(R.id.textView18);
        t14 = (TextView)findViewById(R.id.textView19);
        t15 = (TextView)findViewById(R.id.textView20);
        t16 = (TextView)findViewById(R.id.textView21);
        t17 = (TextView)findViewById(R.id.textView22);
        b = (Button)findViewById(R.id.button4);

        String l1 = "Para espiar un whatsapp de forma física\n           debes cumplir estos requisitos: ";

        t1.setText(l1);

      //  String l2 = "<font color=#ffffff> 1) </font> <font color=#ffffff> Tener el celular de la persona que se necesita espiar aunque sea 1 minuto</font>";

        String l2 = "<font color=#ffffff> 1) </font> <font color=#e82583>  Tener el celular de la persona que se necesita espiar aunque sea 1 minuto</font>";

        t2.setText(Html.fromHtml(l2));


        String l3 = "<font color=#ffffff> 2) </font> <font color=#e82583>  Tener otro celular o una tablet o laptop o pc, con internet</font>";

        t3.setText(Html.fromHtml(l3));

        String l4 = "Ahora explicaremos cual es el procedimiento:";

        t4.setText(l4);

        String l5 = "<font color=#ffffff> 1) </font> <font color=#e82583>  En nuestro celular o tablet o laptop o pc abrimos el navegador de internet\n" +
                "y entramos a esta pagina web: <br> </font> <font color=#ffffff>https://web.whatsapp.com</font> <font color=#e82583> y marcamos con un clic\n" +
                "la opción que dice \"Mantener sesión iniciada\"</font>";

        t5.setText(Html.fromHtml(l5));

        String l6 = "<font color=#ffffff> 2) </font> <font color=#e82583>  Desde el celular de la persona que queremos espiar, abrimos el whatsapp y\n" +
                "damos clic en los 3 puntos de la parte superior derecha, el cual nos muestra\n" +
                "un menú de whatsapp</font>";

        t6.setText(Html.fromHtml(l6));

        String l7 ="<font color=#ffffff> 3) </font> <font color=#e82583>  Damos clic en Whatsapp Web</font>";

        t7.setText(Html.fromHtml(l7));


        String l8 ="<font color=#ffffff> 4) </font> <font color=#e82583>  Whatsapp nos activara la cámara del celular. Con la cámara del celular\n" +
                "apuntamos al código QR que aparece en la pagina web</font> <font color=#ffffff> https://web.whatsapp.com</font>\n" +
                "<font color=#e82583>de nuestro pc o tablet o laptop o celular</font>";

        t8.setText(Html.fromHtml(l8));

        String l9 ="<font color=#ffffff> 5) </font> <font color=#e82583>  Cerramos el whatsapp del celular de la persona que queremos espiar</font>";

        t9.setText(Html.fromHtml(l9));


        String l10 ="De esta manera podremos ver todas las conversaciones que la persona a la que espiamos\n" +
                "tenga en el whatsapp, se marca la opción \"Mantener sesión iniciada\" en la pagina web\n" +
                "<font color=#e82583>https://web.whatsapp.com </font>para que nunca se cierre la sesión en nuestro pc o laptop\n" +
                "así apaguemos nuestros equipos";

        t10.setText(Html.fromHtml(l10));

        String l11 = "<font color=#e82583> NOTA IMPORTANTE: </font> <font color=#ffffff>  Para evitar que esto hagan con nosotros es muy simple:\n</font>";

        t11.setText(Html.fromHtml(l11));

        String l12="<font color=#ffffff> 1) </font> <font color=#e82583>  Abrimos whatsapp desde nuestro celular</font>";

        t12.setText(Html.fromHtml(l12));

        String l13 = "<font color=#ffffff> 2) </font> <font color=#e82583>  Damos clic en los 3 puntos de la parte superior derecha, el cual nos muestra\n" +
                "un menú de whatsapp</font>";

        t13.setText(Html.fromHtml(l13));

        String l14 = "<font color=#ffffff> 3) </font> <font color=#e82583>  Damos clic en Whatsapp Web\n</font>";

        t14.setText(Html.fromHtml(l14));

        String l15 = "<font color=#ffffff> 4) </font> <font color=#e82583>  Si whatsapp nos muestra la cámara del celular activada para escanear un código QR\n" +
                "quiere decir que nadie nos esta espiando y podemos estar tranquilos" +
                "</font>";

        t15.setText(Html.fromHtml(l15));

        String l16 = "<font color=#ffffff> 5) </font> <font color=#e82583>  Si whatsapp nos muestra el mensaje: \"Dispositivos con sesiones abiertas\" quiere decir\n" +
                "que alguien nos esta espiando\n" +
                "</font>";

        t16.setText(Html.fromHtml(l16));


        String l17 = "<font color=#ffffff> 6) </font> <font color=#e82583>  Para que nos dejen de espiar simplemente damos clic en la opción: \"Cerrar todas las sesiones\"</font>";

        t17.setText(Html.fromHtml(l17));


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(Page3.this,Page2.class);
                startActivity(i);
            }
        });

    }

}
