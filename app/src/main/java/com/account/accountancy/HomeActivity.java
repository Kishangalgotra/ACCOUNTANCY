package com.account.accountancy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import maes.tech.intentanim.CustomIntent;

public class HomeActivity extends AppCompatActivity {

    public void nextbasic(View view){
        Intent intent = new Intent(HomeActivity.this, BasicPointActivity.class);
        startActivity(intent);
        CustomIntent.customType(this,"left-to-right");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView button1 =(TextView) findViewById(R.id.Basic);
        //button1.animate().
        //ConstraintLayout cons = findViewById(R.id.homeconstraint);
    }
}