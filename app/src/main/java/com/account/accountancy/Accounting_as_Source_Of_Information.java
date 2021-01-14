package com.account.accountancy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.account.accountancy.R;

public class Accounting_as_Source_Of_Information extends AppCompatActivity {

    TextView data1;
    TextView data2;
    TextView data3;
    TextView data4;
    TextView data5;
    TextView data6;
    TextView data7;
    int[] arr ={0,0,0,0,0,0,0};
    String   sdata1;
    String   sdata2;
    String   sdata3;
    String   sdata4;
    String   sdata5;
    String   sdata6;
    String   sdata7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounting_as__source__of__information);

        data1 = findViewById(R.id.role_of_accounting_text);

        data2 =  findViewById(R.id.role_textViewdata1);
        data2.setVisibility(View.GONE);
        data3 =  findViewById(R.id.role_textViewdata2);
        data3.setVisibility(View.GONE);
        data4 =  findViewById(R.id.role_textViewdata3);
        data4.setVisibility(View.GONE);
        data5 =  findViewById(R.id.role_textViewdata4);
        data5.setVisibility(View.GONE);
        data6 =  findViewById(R.id.role_textViewdata5);
        data6.setVisibility(View.GONE);
        data7 =  findViewById(R.id.role_textViewdata6);
        data7.setVisibility(View.GONE);

    }
}