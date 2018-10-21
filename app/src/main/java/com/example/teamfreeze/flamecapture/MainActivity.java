package com.example.teamfreeze.flamecapture;

import android.content.Intent;
import android.provider.Settings;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reportOutbreak(View report){
        Intent rep = new Intent(this, ReportActivity.class);
        startActivity(rep);



    }

}
