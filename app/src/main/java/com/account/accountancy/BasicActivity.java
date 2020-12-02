package com.account.accountancy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import maes.tech.intentanim.CustomIntent;

public class BasicActivity extends AppCompatActivity {

    public void back(View view) {
        Intent intent = new Intent(BasicActivity.this, BasicPointActivity.class);
        startActivity(intent);
        CustomIntent.customType(this,"right-to-left");
    }
    public void next(View view) {
        Intent intent = new Intent();
        startActivity(intent);
        CustomIntent.customType(this,"left-to-right");
    }
    @Override
    public void finish() {
        super.finish();
        CustomIntent.customType(this,"right-to-left");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        //ConstraintLayout


    }
}