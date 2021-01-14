package com.account.accountancy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;
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


        sdata1 = "Accounting is often called “the language of business.” Why?\n" +
                "Because it communicates so much of the information that owners, managers, and investors need to evaluate a company’s" +
                "financial performance.\n\n" +
                "These people are all stakeholders in the business—they’re interested in its activities because they’re affected by them.\n\n" +
                "In fact, the purpose of accounting is to help stakeholders make better business decisions by providing them with financial information.\n\n" +
                "Obviously, you wouldn’t try to run an organization or make investment decisions without accurate and timely financial information, " +
                "and it’s the accountant who prepares this information.\n\n" +
                "More importantly, accountants make sure that stakeholders understand the meaning of financial information, and they work with" +
                "both individuals and organizations to help them use financial information to deal with business problems.\n\n" +
                "Actually, collecting all the numbers is the easy part—today, all you have to do is start up your accounting software.\n\n" +
                "The hard part is analyzing, interpreting, and communicating the information. Of course, you also have to present everything clearly while" +
                "effectively " +
                "interacting with people from every business discipline.\n\n" +
                "In any case, we’re now ready to define accounting as the process of measuring and summarizing business activities, interpreting financial" +
                "information," +
                "and communicating the results to management and other decision makers.";
        data1.setText(sdata1);

        sdata2 ="Accountants typically work in one of two major fields. Management accountants provide information and analysis to decision makers inside the" +
                "organization in order to help them run it.\n Financial accountants furnish information to individuals and groups both inside and outside the" +
                "organization in order to help them assess its financial performance.\n" +
                "\n" +
                "In other words, management accounting helps you keep your business running while financial accounting tells you how well you’re running it.";
        data2.setText(sdata2);

        sdata3 ="Management accounting plays a key role in helping managers carry out their responsibilities.\n" +
                "Because the information that it provides is intended for use by people who perform a wide variety of jobs,\n" +
                "the format for reporting information is flexible. Reports are tailored to the needs of individual managers,\n" +
                "and the purpose of such reports is to supply relevant, accurate, timely information in a format that will aid managers in making decisions.\n" +
                "In preparing, analyzing, and communicating such information, accountants work with individuals from all the functional areas of the" +
                "organization—human resources, operations, marketing, and finance.";
        data3.setText(sdata3);

        sdata4 ="Financial accounting is responsible for preparing the organization’s financial statements—including the income statement,\n" +
                "the statement of owner’s equity, the balance sheet, and the statement of cash flows—that summarize a company’s\n" +
                "past performance and evaluate its current financial condition. In preparing financial statements, financial accountants\n" +
                "adhere to a uniform set of rules called generally accepted accounting principles (GAAP)—the basic principles for financial\n" +
                "reporting issued by an independent agency called the Financial Accounting Standards Board (FASB). Users want to be sure that\n" +
                "financial statements have been prepared according to GAAP because they want to be sure that the information reported in them\n" +
                "is accurate. They also know that they can compare the statements issued by one company to those of another company in the\n" +
                "same industry.";
        data4.setText(sdata4);

        sdata5 ="The users of managerial accounting information are pretty easy to identify—basically, they’re a firm’s managers. We need to look a\n " +
                "little more closely, however, at the users of financial accounting information, and we also need to know a little more about what they\n" +
                "do with the information that accountants provide them.";

        data5.setText(sdata5);

        sdata6 ="In summarizing the outcomes of a company’s financial activities over a specified period of time, financial statements are,\n" +
                "in effect, report cards for owners and managers. They show, for example, whether the company did or didn’t make a profit and\n" +
                "furnish other information about the firm’s financial condition. They also provide information that managers and owners can use\n" +
                "in order to take corrective action.";
        data6.setText(sdata6);

        sdata7 ="If you loaned money to a friend to start a business, wouldn’t you want to know how the business was doing? Investors \n" +
                "and creditors furnish the money that a company needs to operate, and not surprisingly, they feel the same way.\n" +
                "Because they know that it’s impossible to make smart investment and loan decisions without accurate reports on an organization’s financial health,\n" +
                "they study financial statements to assess a company’s performance and to make decisions about continued investment.";
        data7.setText(sdata7);
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