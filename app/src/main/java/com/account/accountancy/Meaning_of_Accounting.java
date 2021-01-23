package com.account.accountancy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.account.accountancy.R;

public class Meaning_of_Accounting extends AppCompatActivity implements View.OnClickListener  {

    TextView data1;
    TextView data2;
    TextView data3;
    TextView data4;
    TextView data5;

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
        setContentView(R.layout.activity_meaning_of__accounting);

        data1 = findViewById(R.id.meaning_of_accounting_text);

        data2 =  findViewById(R.id.meaning_of_accounting_textViewdata1);
        data2.setVisibility(View.GONE);
        data3 =  findViewById(R.id.meaning_of_accounting_textViewdata2);
        data3.setVisibility(View.GONE);
        data4 =  findViewById(R.id.meaning_of_accounting_textViewdata3);
        data4.setVisibility(View.GONE);
        data5 =  findViewById(R.id.meaning_of_accounting_textViewdata4);
       data5.setVisibility(View.GONE);


        sdata1 = "Accounting is all about the process that helps to record, summarize, analyze, and report data that concerns" +
                " financial transactions.\n Let’s understand the components a little better to understand the true meaning of accounting.\n";
        data1.setText(sdata1);

        sdata2 ="The first and foremost function that accounting looks forward to achieving is the recording of the different" +
                "transactions that are made within the firm.\nThis can also be referred to as book-keeping which is a process " +
                "of recognizing the transactions and setting them up as records.\n" +
                "Book-keeping is only concerned with the recording segment and nothing else.\n" +
                "Accounting maintains a few books for the cause of recording.\n" +
                "The maintenance of the procedure happens in a systematic manner.\n"
                +"The three different ways of recording are:\n" +
                "\n" +
                "1.Putting up a system that will help in maintaining the" +
                "  records.\n" +
                "2.Tracking financial transactions.\n" +
                "3.Aggregating the reports to present a final set of financial reports.";
        data2.setText(sdata2);

        sdata3 ="Raw data is generally the result of recording transactions. However, these raw data are not of much significance to the organization.\n" +
                "They have no part to play in the decision-making process.\n" +
                "As a result of this, the accountants divide these raw data into several categories.\n" +
                "So the recording of the transactions is then followed up by summarizing.";
        data3.setText(sdata3);

        sdata4 ="The affairs in any company are the responsibility of the management.\n" +
                "The owners must know about the various operations happening within the firm using their money.\n"+
                "Therefore, to take care of this, owners receive reports.\n" +
                "They receive these reports quarterly and at the end, they receive an annual report that summarizes all their performances.";
        data4.setText(sdata4);

        sdata5 ="Finally, there is an analysis of all the results so far.\n" +
                "After recording and summary, it is very important to draw conclusions.\n"+
                "It is the responsibility of the management to check for the positive and negative points.\n"+
                "Therefore, to analyze all of this, accounting introduces the concept of comparison.\n"+
                "Comparing profits, sales, equity, and so on with one another to determine and analyze the performance and growth of an organization.";

        data5.setText(sdata5);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.meaning_of_accounting_texttitile1 :  if(arr[0]==0){
                data2.setVisibility(View.VISIBLE); arr[0] =1; }
            else {data2.setVisibility(View.GONE); arr[0] =0;}
                break;
            case R.id.meaning_of_accounting_texttitile2 : if(arr[1]==0){data3.setVisibility(View.VISIBLE); arr[1] =1;}
            else {data3.setVisibility(View.GONE); arr[1] =0;}
                break;
            case R.id.meaning_of_accounting_texttitile3 :  if(arr[2]==0){data4.setVisibility(View.VISIBLE); arr[2] =1;}
            else {data4.setVisibility(View.GONE); arr[2] =0;}
                break;
            case R.id.meaning_of_accounting_texttitile4 : if(arr[3]==0){data5.setVisibility(View.VISIBLE); arr[3] =1;}
            else {data5.setVisibility(View.GONE); arr[3] =0;}
                break;

        }
    }
}