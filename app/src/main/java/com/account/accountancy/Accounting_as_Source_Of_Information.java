package com.account.accountancy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.account.accountancy.R;

public class Accounting_as_Source_Of_Information extends AppCompatActivity implements View.OnClickListener {

    TextView data1;
    TextView data2;
    TextView data3;
    TextView data4;
    TextView data5;
    TextView data6;
    TextView data7;
    TextView data8;
    TextView data9;
    int[] arr ={0,0,0,0,0,0,0,0,0};
    String   sdata1;
    String   sdata2;
    String   sdata3;
    String   sdata4;
    String   sdata5;
    String   sdata6;
    String   sdata7;
    String   sdata8;
    String   sdata9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounting_as__source__of__information);

        data1 = findViewById(R.id.source_textviewbrief);

        data2 =  findViewById(R.id.source_textdata1);

        data3 =  findViewById(R.id.source_textdata2);
       // data3.setVisibility(View.GONE);
        data4 =  findViewById(R.id.source_textdata3);
       // data4.setVisibility(View.GONE);
        data5 =  findViewById(R.id.source_textdata4);
       // data5.setVisibility(View.GONE);
        data6 =  findViewById(R.id.source_textdata5);
       // data6.setVisibility(View.GONE);
        data7 =  findViewById(R.id.source_textdata6);
       // data7.setVisibility(View.GONE);
        data8 =  findViewById(R.id.source_textdata7);
       // data8.setVisibility(View.GONE);
        data9 =  findViewById(R.id.source_textdata8);
      //  data9.setVisibility(View.GONE);

        sdata1 ="Accounting is regarded as the language of a business.\n"+
                "It is used as a means of communication between a business" +
                "organization and its shareholders.\nThe accounting process is a source of information, it uses business data and" +
                "processes it to generate relevant information.\nLet us have a look.";
        data1.setText(sdata1);


        sdata2 ="Accounting is a definite processes of interlinked activities,\n" +
                "that begins with the identification of transactions and ends\n" +
                "with the preparation of financial statements.\nEvery step in the process of" +
                "accounting generates information.\nGeneration of information is not an end" +
                "in itself.\nIt is a means to facilitate the dissemination of information among" +
                "different user groups. Such information enables the interested parties to" +
                "take appropriate decisions.\nTherefore, dissemination of information is an" +
                "essential function of accounting.\nTo be useful, the accounting information should" +
                "ensure to:\n";
        data2.setText(sdata2);

        sdata3 ="Its role is to observe,\n" +
                "screen and recognise events and transactions to measure and process them," +
                "and thereby compile reports comprising accounting information that are" +
                "communicated to the users.\nThese are then interpreted, decoded and used" +
                "by management and other user groups.\nIt must be ensured that the information" +
                "provided is relevant, adequate and reliable for decision-making.\nThe apparently" +
                "divergent needs of internal and external users of accounting information have" +
                "resulted in the development of sub-disciplines within the accounting discipline" +
                "namely, financial accounting, cost accounting and management accounting";

        data3.setText(sdata3);

        sdata4 ="It assists keeping a systematic record of financial" +
                "transactions the preparation and presentation of financial reports in order to" +
                "arrive at a measure of organisational success and financial soundness.\n" +
                "It relates to the past period, serves the stewardship function and is monetary in" +
                "nature.\nIt is primarily concerned with the provision of financial information to" +
                "all stakeholders.\n" +
                "Cost accounting assists in analysing the expenditure for ascertaining the" +
                "cost of various products manufactured or services rendered by the firm";
        data4.setText(sdata4);

        sdata5 ="It also helps in controlling the costs and providing" +
                "necessary costing information to management for decision-making.\n" +
                "Management accounting deals with the provision of necessary accounting" +
                "information to people within the organisation to enable them in decision-making," +
                "planning and controlling business operations.\n Management accounting draws" +
                "the relevant information mainly from financial accounting and cost accounting" +
                "which helps the management in budgeting, assessing profitability, taking pricing" +
                "decisions, capital expenditure decisions and so on.\n Besides, it generates other" +
                "information (quantitative and qualitative, financial and non-financial) which" +
                "relates to the future and is relevant for decision-making in the organisation.\n" +
                "Such information includes: sales forecast, cash flows, purchase requirement," +
                "manpower needs, environmental data about effects on air, water, land, natural" +
                "resources, flora, fauna, human health, social responsibilities, etc.\n" +
                "As a result, the scope of accounting has become so vast, that new areas" +
                "like human resource accounting, social accounting, responsibility accounting" +
                "have also gained prominance.";

        data5.setText(sdata5);

        sdata6 =
                "Qualitative characteristics are the attributes of accounting information which" +
                "tend to enhance its understandability and usefulness.\nIn order to assess" +
                "whether accounting information is decision useful, it must possess the" +
                "characteristics of reliability, relevance, understandability and comparability.";
        data6.setText(sdata6);

        sdata7 ="Reliability means the users must be able to depend on the information.\nThe" +
                "reliability of accounting information is determined by the degree of" +
                "correspondence between what the information conveys about the transactions" +
                "or events that have occurred, measured and displayed.\nA reliable information" +
                "should be free from error and bias and faithfully represents what it is meant" +
                "to represent.\nTo ensure reliability, the information disclosed must be credible," +
                "verifiable by independent parties use the same method of measuring, and be" +
                "neutral and faithful";
        data7.setText(sdata7);

        sdata8 ="To be relevant, information must be available in time, must help in prediction" +
                "and feedback, and must influence the decisions of users by :\n" +
                "(a) helping them form prediction about the outcomes of past, present or" +
                "future events; and\n" +
                "(b) confirming or correcting their past evaluations.";
        data8.setText(sdata8);

        sdata9 ="Understandability means decision-makers must interpret accounting" +
                "information in the same sense as it is prepared and conveyed to them.\nThe" +
                " qualities that distinguish between good and bad communication in a message" +
                "are fundamental to the understandability of the message.\nA message is said" +
                " to be effectively communicated when it is interpreted by the receiver of the" +
                " message in the same sense in which the sender has sent.\nAccountants should" +
                " present the comparable information in the most intenlligible manner without" +
                " sacrificing relevance and reliability.";
        data9.setText(sdata9);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.role_texttitile1 :  if(arr[0]==0){
                data2.setVisibility(View.VISIBLE); arr[0] =1; }
            else {data2.setVisibility(View.GONE); arr[0] =0;}
                break;
            case R.id.role_texttitile2 : if(arr[1]==0){data3.setVisibility(View.VISIBLE); arr[1] =1;}
            else {data3.setVisibility(View.GONE); arr[1] =0;}
                break;
            case R.id.role_texttitile3 :  if(arr[2]==0){data4.setVisibility(View.VISIBLE); arr[2] =1;}
            else {data4.setVisibility(View.GONE); arr[2] =0;}
                break;
            case R.id.role_texttitile4 : if(arr[3]==0){data5.setVisibility(View.VISIBLE); arr[3] =1;}
            else {data5.setVisibility(View.GONE); arr[3] =0;}
                break;
            case R.id.role_texttitile5 :  if(arr[4]==0){data6.setVisibility(View.VISIBLE); arr[4] =1;}
            else {data6.setVisibility(View.GONE); arr[4] =0;}
                break;
            case R.id.role_texttitile6 :  if(arr[5]==0){data7.setVisibility(View.VISIBLE); arr[5] =1;}
            else {data7.setVisibility(View.GONE); arr[5] =0;}
                break;

        }
    }
}