package com.account.accountancy;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class objective_of_accounting extends AppCompatActivity {
    TextView data1;
    TextView data2;
    TextView data3;
    TextView data4;
    TextView data5;
    TextView data6;
    TextView data7;
    String   sdata1;
    String   sdata2;
    String   sdata3;
    String   sdata4;
    String   sdata5;
    String   sdata6;
    String   sdata7;

    @Override
    protected void onCreate(Bundle SavedIntanceState){
        super.onCreate(SavedIntanceState);
        setContentView(R.layout.Activity_objective_of_accounting);
        data1 =  findViewById(R.id.textViewdata1);
        data2 =  findViewById(R.id.textViewdata2);
        data3 =  findViewById(R.id.textViewdata3);
        data4 =  findViewById(R.id.textViewdata4);
        data5 =  findViewById(R.id.textViewdata5);
        data6 =  findViewById(R.id.textViewdata6);
        data7 =  findViewById(R.id.textViewdata7);

        sdata1 ="The basic role of any accounting section of an organization is to keep a systematic record of all the financial transactions. Systematic record keeping will ensure a proper level of analysis to arrive at the financial health of an organization.\n" +
                "\n" +
                "That makes Systematic Record Keeping the absolute objective of accounting. This will go a long way in analyzing systematic and accurate decision making. Before you can achieve any other objectives of accounting or any other section for that matter, a proper record should be one of the essential elements and forms a backbone of the organization.";
        sdata2 ="If you are in a business, you would want to determine the exact status of the financial health of your firm at the end of a particular period. Usually, enterprises prefer quarterly results of its operating finances.\n" +
                "\n" +
                "The accounts department prepares the profit and loss details of the organization based on the income statement generated with the help of the records that is has kept for the period. It is an ongoing process and continues irrespective of the stipulated periods.";
        sdata3 ="The accounting also has an objective of ascertaining the status of financial affairs of the organization. This will include debts, liabilities, property, and assets. The accounts section should be able to provide updated information on the financial conditions of the enterprise on an ongoing basis.\n" +
                "\n" +
                "This is ideally achieved through the preparation of the balance sheet. This will provide an at a glance view of the financial status of the organization at any given period. The balance sheet will be helpful in analyzing the financial status of the company and in turn making future decisions & targets.";
        sdata4 ="Accounting has yet another wider objective of helping the managers and business owners in decision making. Systematic accounting will be an essential factor for making business decisions and set realistic goals for the targets and plans for future growth.\n"+
                "Some of the examples of the decisions that can be aided by accounting can be\n" +
                "\n" +
                "The pricing of the product to achieve the maximum possible profit. Since accounting lets you arrive at the operating costs and the other costs involved in the manufacturing of the product, you can arrive at realistic and accurate pricing without being ambiguous.\n" +
                "Taking decisions when you have a shortage of funds to maximize the profit so that the status can be improved.\n" +
                "Helping to make decisions where the organization may need to acquire additional financing. This holds in case of new product launches or diversifying into a new business.\n" +
                "Accounting can also be helpful in deciding on a non-performing product or service.\n" +
                "The decision concerning credit lending to a customer.";
        sdata5 ="";
        sdata6 ="";
        sdata7 ="";
    }
}
