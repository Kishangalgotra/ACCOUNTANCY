package com.account.accountancy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import maes.tech.intentanim.CustomIntent;

public class BasicActivity extends AppCompatActivity  implements View.OnClickListener{
    //ConstraintLayout
    TextView data1;
    TextView data2;
    TextView data3;
    TextView data4;
    TextView data5;
    TextView data6;
    TextView data7;
    TextView data8;
    TextView data9;
    TextView data10;
    TextView data11;
    TextView data12;
    TextView data13;
    TextView data14;
    int[] arr ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
    String   sdata1;
    String   sdata2;
    String   sdata3;
    String   sdata4;
    String   sdata5;
    String   sdata6;
    String   sdata7;
    String   sdata8;
    String   sdata9;
    String   sdata10;
    String   sdata11;
    String   sdata12;
    String   sdata13;
    String   sdata14;
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

            data1 =  findViewById(R.id.basic2_textView1);
           // data1.setVisibility(View.GONE);
            data2 =  findViewById(R.id.basic2_textView2);
            //.setVisibility(View.GONE);
            data3 =  findViewById(R.id.basic2_textView3);
           // data3.setVisibility(View.GONE);
            data4 =  findViewById(R.id.basic2_textView4);
           // data4.setVisibility(View.GONE);
            data5 =  findViewById(R.id.basic2_textView5);
           // data5.setVisibility(View.GONE);
            data6 =  findViewById(R.id.basic2_textView6);
           // data6.setVisibility(View.GONE);
            data7 =  findViewById(R.id.basic2_textView7);
           // data7.setVisibility(View.GONE);

            data8 =  findViewById(R.id.basic2_textView8);
          //  data8.setVisibility(View.GONE);
            data9 =  findViewById(R.id.basic2_textView9);
          //  data9.setVisibility(View.GONE);
            data10 =  findViewById(R.id.basic2_textView10);
          //  data10.setVisibility(View.GONE);
            data11 =  findViewById(R.id.basic2_textView11);
          //  data11.setVisibility(View.GONE);
            data12 =  findViewById(R.id.basic2_textView12);
          //  data12.setVisibility(View.GONE);
            data13 =  findViewById(R.id.basic2_textView13);
         //   data13.setVisibility(View.GONE);
            data14 =  findViewById(R.id.basic2_textView14);
          //  data14.setVisibility(View.GONE);

            sdata1 ="The Accounting Equation is Assets = Liabilities + Equity. With accurate financial records, the equation balances.";
            data1.setText(sdata1);

            sdata2 ="Accounting keeps track of the financial records of a business. In addition to recording financial transactions, it involves reporting, analyzing and summarizing information.";
            data2.setText(sdata2);

            sdata3 ="Accounts Payable are liabilities of a business and represent money owed to others.\n";
            data3.setText(sdata3);

            sdata4 ="Assets of a business and represent money owed to a business by others.";
            data4.setText(sdata4);

            sdata5 ="Records financial transactions when they occur rather than when cash changes hands. For example, when goods are received without payment, an Accounts Payable is recorded.";
            data5.setText(sdata5);

            sdata6 ="Accruals acknowledge revenue when it is earned and expenses when they are incurred even though a cash transaction may not be involved.";
            data6.setText(sdata6);

            sdata7 ="Reduces debts through equal payments that include interest.";
            data7.setText(sdata7);

            sdata8 ="Items of value that are owned.";
            data8.setText(sdata8);

            sdata9 ="Allow financial transactions to be traced to their source.";
            data9.setText(sdata9);

            sdata10 ="Examine financial accounts and records to evaluate their accuracy and the financial condition of the entity.\n";
            data10.setText(sdata10);

            sdata11 ="Provides a snapshot of a business’ assets, liabilities, and equity on a given date.";
            data11.setText(sdata11);

            sdata12 ="Recording of financial transactions in an accounting system.";
            data12.setText(sdata12);

            sdata13 ="Budgeting involves maintaining a financial plan to control cash flow.";
            data13.setText(sdata13);

            sdata14 ="Total amount of common and preferred stock issued by a company.";
            data14.setText(sdata14);

    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.texttitile1 :  if(arr[0]==0){
                data1.setVisibility(View.VISIBLE); arr[0] =1;
                Transition transition = new Slide(Gravity.TOP);}
            else {data1.setVisibility(View.GONE); arr[0] =0;}
                break;
            case R.id.texttitile2 : if(arr[1]==0){data2.setVisibility(View.VISIBLE); arr[1] =1;}
            else {data2.setVisibility(View.GONE); arr[1] =0;}
                break;
            case R.id.texttitile3 :  if(arr[2]==0){data3.setVisibility(View.VISIBLE); arr[2] =1;}
            else {data3.setVisibility(View.GONE); arr[2] =0;}
                break;
            case R.id.texttitile4 : if(arr[3]==0){data4.setVisibility(View.VISIBLE); arr[3] =1;}
            else {data4.setVisibility(View.GONE); arr[3] =0;}
                break;
            case R.id.texttitile5 :  if(arr[4]==0){data5.setVisibility(View.VISIBLE); arr[4] =1;}
            else {data5.setVisibility(View.GONE); arr[4] =0;}
                break;
            case R.id.texttitile6 :  if(arr[5]==0){data6.setVisibility(View.VISIBLE); arr[5] =1;}
            else {data6.setVisibility(View.GONE); arr[5] =0;}
                break;
            case R.id.texttitile7 :  if(arr[6]==0){data7.setVisibility(View.VISIBLE); arr[6] =1;}
            else {data7.setVisibility(View.GONE); arr[6] =0;}
                break;
        }
        }
    }
