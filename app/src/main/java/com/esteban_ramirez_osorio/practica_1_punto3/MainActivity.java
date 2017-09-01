package com.esteban_ramirez_osorio.practica_1_punto3;

import android.animation.FloatEvaluator;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {


    private Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, suma, resta, mul, div,
            igual, cero,punto;
    private TextView pantalla;
    String resultado, num1, num2, decima, mostrar="";
    Float primero,segundo,op;
    int bandera=1,bandera2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        pantalla = (TextView) findViewById(R.id.tPantalla);

        punto=(Button) findViewById((R.id.bpunto));
        igual = (Button) findViewById(R.id.bigual);
        cero = (Button) findViewById(R.id.bcero);
        uno = (Button) findViewById(R.id.buno);
        dos = (Button) findViewById(R.id.bdos);
        tres = (Button) findViewById(R.id.btres);
        cuatro = (Button) findViewById(R.id.bcuatro);
        cinco = (Button) findViewById(R.id.bcinco);
        seis = (Button) findViewById(R.id.bseis);
        siete = (Button) findViewById(R.id.bsiete);
        ocho = (Button) findViewById(R.id.bocho);
        nueve = (Button) findViewById(R.id.bnueve);
        suma = (Button) findViewById(R.id.bsuma);
        resta = (Button) findViewById(R.id.bresta);
        mul = (Button) findViewById(R.id.bmul);
        div = (Button) findViewById(R.id.bdiv);

        cero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = "0";
                mostrar = mostrar + num1;
                pantalla.setText(mostrar);

            }

        });

        uno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = "1";
                mostrar = mostrar + num1;
                pantalla.setText(mostrar);

            }

        });

        dos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = "2";
                mostrar = mostrar + num1;
                pantalla.setText(mostrar);


            }

        });

        tres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = "3";
                mostrar = mostrar + num1;
                pantalla.setText(mostrar);


            }

        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = "4";
                mostrar = mostrar + num1;
                pantalla.setText(mostrar);


            }

        });

        cinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = "5";
                mostrar = mostrar + num1;
                pantalla.setText(mostrar);


            }

        });

        seis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = "6";
                mostrar = mostrar + num1;
                pantalla.setText(mostrar);


            }

        });
        siete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = "7";
                mostrar = mostrar + num1;
                pantalla.setText(mostrar);


            }

        });

        ocho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = "8";
                mostrar = mostrar + num1;
                pantalla.setText(mostrar);


            }

        });
        nueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = "9";
                mostrar = mostrar + num1;
                pantalla.setText(mostrar);


            }

        });
        igual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (bandera==0){
                    segundo=Float.parseFloat(mostrar);
                    mostrar="";
                    op=primero+segundo;
                    bandera=1;
                }
                if (bandera==2){
                    segundo=Float.parseFloat(mostrar);
                    mostrar="";
                    op=primero-segundo;
                    bandera=1;
                }

                if (bandera==3){
                    segundo=Float.parseFloat(mostrar);
                    mostrar="";
                    op=primero*segundo;
                    bandera=1;
                }

                if (bandera==4){
                    segundo=Float.parseFloat(mostrar);
                    mostrar="";
                    op=primero/segundo;
                    bandera=1;
                }

                mostrar=Float.toString(op);
                pantalla.setText(mostrar);
                mostrar="";
            }

        });

        suma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera==1) {
                    primero = Float.parseFloat(mostrar);
                    mostrar="";
                    bandera=0;
                }



            }

        });
        resta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera==1) {
                    primero = Float.parseFloat(mostrar);
                    mostrar="";
                    bandera=2;
                }



            }

        });
        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera==1) {
                    primero = Float.parseFloat(mostrar);
                    mostrar="";
                    bandera=3;
                }



            }

        });
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera==1) {
                    primero = Float.parseFloat(mostrar);
                    mostrar="";
                    bandera=4;
                }



            }

        });

        punto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    num1 = ".";
                    mostrar = mostrar + num1;
                    pantalla.setText(mostrar);




            }

        });
    }
}
