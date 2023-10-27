package com.example.daillydelay2;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CronoActivity extends AppCompatActivity implements Runnable{


    private static final String TAG = "MyActivity";


    int horas = 0;
    int minutos = 0 ;
    int segundos = 0;
    String strHoras = "00";
    String strMins = "00";
    String strSeg = "00";
    String strCrono = strHoras + " : " + strMins + " : " + strSeg;
    CharSequence textoCrono = strCrono;

    Button btnStart, btnStop;
    TextView tvCrono;

    boolean cronoActivo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crono);

        tvCrono = findViewById(R.id.cronoTxt);
        cronoActivo = false;
        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);
        tvCrono.setText(textoCrono);






    }

    public void iniciarCrono(View view){
        Thread th1 = new Thread();
        cronoActivo = true;

        th1.start();
        cronoActivo = true;
    }

    public void pararCrono(View view){
        cronoActivo = false;

    }

    public void run(){
        try{
        while (cronoActivo){
            /**Thread.sleep(1000);
            segundos += 1;
            strSeg = String.valueOf(segundos);**/
            textoCrono = "AAAAAAAAAAA";

            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }






}