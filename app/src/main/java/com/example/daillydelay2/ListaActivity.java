package com.example.daillydelay2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);



        String[] weather = {"Wind above op limits", "Not enough wind", "Preccipitation","Visibility", "Temperatures", "Lighting", "Offshore", "Other "};

        String[] skySpeckts = {"Alta troubleshooting", "Battery Charger TroubleShoot", "Battery Charger/Power lead", "Camera Troubleshooting", "FPY TroubleShooting"
                ,"Gimbal TroubleShooting", "Power board TroubleShooting", "Radio TroubleShooting", "Software TroubleShooting", "Waiting For Replacements", "Miscelanieous troubleShooting","Other"};
        String[] site = {"Turbine operation issues", "Turbine access issues", "Turbine pinning required", "Not enought keys to access turbines"};

    }
}