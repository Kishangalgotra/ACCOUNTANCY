package com.account.accountancy;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class objective_of_accounting extends AppCompatActivity implements View.OnClickListener  {
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
    protected void onCreate(Bundle SavedIntanceState){
        super.onCreate(SavedIntanceState);
        setContentView(R.layout.activity_objective_of_accounting);
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
        data1.setText(sdata1);

        sdata2 ="If you are in a business, you would want to determine the exact status of the financial health of your firm at the end of a particular period. Usually, enterprises prefer quarterly results of its operating finances.\n" +
                "\n" +
                "The accounts department prepares the profit and loss details of the organization based on the income statement generated with the help of the records that is has kept for the period. It is an ongoing process and continues irrespective of the stipulated periods.";
        data2.setText(sdata2);

        sdata3 ="The accounting also has an objective of ascertaining the status of financial affairs of the organization. This will include debts, liabilities, property, and assets. The accounts section should be able to provide updated information on the financial conditions of the enterprise on an ongoing basis.\n" +
                "\n" +
                "This is ideally achieved through the preparation of the balance sheet. This will provide an at a glance view of the financial status of the organization at any given period. The balance sheet will be helpful in analyzing the financial status of the company and in turn making future decisions & targets.";
        data3.setText(sdata3);

        sdata4 ="Accounting has yet another wider objective of helping the managers and business owners in decision making. Systematic accounting will be an essential factor for making business decisions and set realistic goals for the targets and plans for future growth.\n"+
                "Some of the examples of the decisions that can be aided by accounting can be\n" +
                "\n" +
                "The pricing of the product to achieve the maximum possible profit. Since accounting lets you arrive at the operating costs and the other costs involved in the manufacturing of the product, you can arrive at realistic and accurate pricing without being ambiguous.\n" +
                "Taking decisions when you have a shortage of funds to maximize the profit so that the status can be improved.\n" +
                "Helping to make decisions where the organization may need to acquire additional financing. This holds in case of new product launches or diversifying into a new business.\n" +
                "Accounting can also be helpful in deciding on a non-performing product or service.\n" +
                "The decision concerning credit lending to a customer.";
        data4.setText(sdata4);

        sdata5 ="Having complete knowledge of the liquidity status of the organization is also an important objective that accounting needs to fulfill. Lack of proper accounting can often lead to financial mismanagement in the organization and can bring up huge issues like lockout and closure of the business.\n" +
                "\n" +

                "Proper accounting should be such that it aids the managers and business owners to ascertain how much cash and other resources they have at their disposal to pay for the financial commitments they may have. The knowledge of liquidity will also be helpful in working out the quantum of the working capital and the capital that can be used for paying off the liabilities.";
        data5.setText(sdata5);

        sdata6 ="One of the major objectives of accounting should be to help in the positioning of the organization. Accounting offers you a good deal of financial statements to help achieve this goal. The financial position of an organization will ideally go a long way in promoting the financial status of the company.\n" +
                "\n" +
                "The financial statements that can help ascertain the financial position of an organization include\n" +
                "\n" +
                "The amount of capital raised by the organization for the sake of conducting the business.\n" +
                "The quantum of funds from this capital that has been utilized for the business activities\n" +
                "The complete balance sheet of the organization showing cumulative profit or loss.\n" +
                "The liabilities of the organization. This refers to the amount that the company owes others\n" +
                "The total cash, inventory, machinery, property and other assets owned by the organization.\n" +
                "Accounting has an objective of managing and maintaining all these statements to provide a healthy picture of the organization.";
        data6.setText(sdata6);

        sdata7 ="One of the most major objectives that accounting can perform to perfection will include enhancing the accountability of the firm to its fullest abilities. It is the accounting section of the organization that provides a solid base for the assessment of the actual performance of the organization over some time.\n" +
                "\n" +
                "This will also go a long way in promoting the accountability of the organization in the long run and through the multiple tiers of the organizational hierarchy. Financial statements from the accounting department can also be helpful in providing enough confidence for the shareholders. If the performance is poor, the same financial statements can help shareholders hold the directors and promoters of the company accountable. This can also be helpful if you are planning for funding your new projects. Credible and accountable financial status can help you secure financing either through the loans or from the investors.";
        data7.setText(sdata7);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.texttitile1 :  if(arr[0]==0){data1.setVisibility(View.VISIBLE); arr[0] =1;}
                                       else {data1.setVisibility(View.INVISIBLE); arr[0] =0;}
                    break;
            case R.id.texttitile2 : if(arr[1]==0){data2.setVisibility(View.VISIBLE); arr[1] =1;}
                                       else {data2.setVisibility(View.INVISIBLE); arr[1] =0;}
                break;
            case R.id.texttitile3 :  if(arr[2]==0){data3.setVisibility(View.VISIBLE); arr[2] =1;}
                                       else {data3.setVisibility(View.INVISIBLE); arr[2] =0;}
                break;
            case R.id.texttitile4 : if(arr[3]==0){data4.setVisibility(View.VISIBLE); arr[3] =1;}
                                       else {data4.setVisibility(View.INVISIBLE); arr[3] =0;}
                break;
            case R.id.texttitile5 :  if(arr[4]==0){data5.setVisibility(View.VISIBLE); arr[4] =1;}
                                       else {data5.setVisibility(View.INVISIBLE); arr[4] =0;}
                break;
            case R.id.texttitile6 :  if(arr[5]==0){data6.setVisibility(View.VISIBLE); arr[5] =1;}
                                       else {data6.setVisibility(View.INVISIBLE); arr[5] =0;}
                break;
            case R.id.texttitile7 :  if(arr[6]==0){data7.setVisibility(View.VISIBLE); arr[6] =1;}
                                       else {data7.setVisibility(View.INVISIBLE); arr[6] =0;}
                break;
        }
    }
}
