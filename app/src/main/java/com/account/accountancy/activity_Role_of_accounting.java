package com.account.accountancy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_Role_of_accounting extends AppCompatActivity  implements View.OnClickListener {

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
        setContentView(R.layout.activity_role_of_accounting);

        data1 = findViewById(R.id.role_of_accounting_text);
        sdata1 = "Accounting is often called “the language of business.” Why?\n Because it communicates so much of the information that owners, managers, and investors need to evaluate a company’s financial performance. These people are all stakeholders in the business—they’re interested in its activities because they’re affected by them. In fact, the purpose of accounting is to help stakeholders make better business decisions by providing them with financial information. Obviously, you wouldn’t try to run an organization or make investment decisions without accurate and timely financial information, and it’s the accountant who prepares this information. More importantly, accountants make sure that stakeholders understand the meaning of financial information, and they work with both individuals and organizations to help them use financial information to deal with business problems. Actually, collecting all the numbers is the easy part—today, all you have to do is start up your accounting software. The hard part is analyzing, interpreting, and communicating the information. Of course, you also have to present everything clearly while effectively interacting with people from every business discipline. In any case, we’re now ready to define accounting as the process of measuring and summarizing business activities, interpreting financial information, and communicating the results to management and other decision makers.";
        data1.setText(sdata1);
    }

    @Override
    public void onClick(View v) {

    }
}