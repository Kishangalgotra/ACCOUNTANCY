package com.account.accountancy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import maes.tech.intentanim.CustomIntent;

public class BasicPointActivity extends AppCompatActivity {

    public void Basic_Activity(View view) {
        Intent intent = new Intent(BasicPointActivity.this, BasicActivity.class);
        startActivity(intent);
        CustomIntent.customType(this,"left-to-right");
    }
    public void Accounting_as_Source_Of_Information(View view) {

        Intent intent = new Intent(BasicPointActivity.this, Accounting_as_Source_Of_Information.class);
        startActivity(intent);
        CustomIntent.customType(this,"left-to-right");
    }

    public void Role_of_Accounting(View view) {
        Intent intent = new Intent(BasicPointActivity.this, activity_Role_of_accounting.class);
        startActivity(intent);
        CustomIntent.customType(this,"left-to-right");
    }
    public void Objective_of_Accounting(View view) {

        Intent intent = new Intent(BasicPointActivity.this, objective_of_accounting.class);
        startActivity(intent);
        CustomIntent.customType(this,"left-to-right");
    }
    public void Basic_terms_In_Accounting(View view) {

        Intent intent = new Intent(BasicPointActivity.this, Accounting_as_Source_Of_Information.class);
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
        setContentView(R.layout.activity_basic_point);
    }
}