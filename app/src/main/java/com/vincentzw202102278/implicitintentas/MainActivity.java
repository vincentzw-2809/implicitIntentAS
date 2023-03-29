package com.vincentzw202102278.implicitintentas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tampilTelepon(View view) {
        Intent teleponIntent = new Intent(Intent.ACTION_DIAL);
        startActivity(teleponIntent);
    }

    public void tampilSms(View view) {
        Intent smsIntent = new Intent(Intent.ACTION_MAIN);
        smsIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivity(smsIntent);
    }

    public void tampilKalender(View view) {
        Intent kalenderIntent = new Intent(Intent.ACTION_MAIN);
        kalenderIntent.addCategory(Intent.CATEGORY_APP_CALENDAR);
        startActivity(kalenderIntent);
    }



    public void tampilKalkulator(View view)
    {
        try {
            Intent kalkulatorIntent = new Intent(Intent.ACTION_MAIN);
            kalkulatorIntent.addCategory(Intent.CATEGORY_LAUNCHER);

            ComponentName cn = new ComponentName("com.android.calculator2", "com.android.calculator2.calculator");
            kalkulatorIntent.setComponent(cn);
            startActivity(kalkulatorIntent);

        }
        catch (ActivityNotFoundException anfe)
        {
            Toast.makeText(getApplicationContext(), "aplikasi tidak dapat ditemukan", Toast.LENGTH_LONG).show();
    }
}

    public void tampilKontak(View view) {
        Intent kontakIntent = new Intent(Intent.ACTION_MAIN);
        kontakIntent.addCategory(Intent.CATEGORY_APP_CONTACTS);
        startActivity(kontakIntent);
    }

    public void tampilGaleri(View view) {
        Intent GaleriIntent = new Intent(Intent.ACTION_MAIN);
        GaleriIntent.addCategory(Intent.CATEGORY_APP_GALLERY);
        startActivity(GaleriIntent);
    }

    public void tampilwifi(View view) {
        Intent wifiIntent = new Intent(Intent.ACTION_WEB_SEARCH);
        startActivity(wifiIntent);
    }

    public void tampilsound(View view) {
        Intent soundIntent = new Intent(Intent.ACTION_SCREEN_ON);
        startActivity(soundIntent);
    }

    public void tampilaiplane(View view) {
        Intent airplaneIntent = new Intent(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        startActivity(airplaneIntent);
    }

    public void tampilaplikasi(View view) {
        Intent aplikasiIntent = new Intent(Intent.ACTION_APPLICATION_LOCALE_CHANGED);
        startActivity(aplikasiIntent);
    }

    public void tampilbluetooth(View view) {
        Intent bluetoothIntent = new Intent(Intent.ACTION_BUG_REPORT);
        startActivity(bluetoothIntent);
    }}
