package edu.sjsu.pham01.dan.mortgagecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MortgageCalculatorActivity extends AppCompatActivity {

    private EditText mHomeValue, mDownPayment, mInterestRate, mPropertyTaxRate;
    private Button mCalculate, mReset;
    private TextView mMonthlyPaymentAmount, mTotalInterestPaid, mTotalPropertyTaxPaid, mPayOffDate;

    private double principal;
    private double rate;
    private double numOfPayments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mortgage_calculator);

        mHomeValue = (EditText)findViewById(R.id.home_value);
        mDownPayment = (EditText)findViewById(R.id.down_payment);
        mInterestRate = (EditText)findViewById(R.id.interest_rate);
        mPropertyTaxRate = (EditText)findViewById(R.id.property_tax_rate);

        mCalculate = (Button)findViewById(R.id.calculate);
        mReset = (Button)findViewById(R.id.reset);

        mMonthlyPaymentAmount = (TextView)findViewById(R.id.monthly_payment_amount);
        mTotalInterestPaid = (TextView)findViewById(R.id.total_interest_paid);
        mTotalPropertyTaxPaid = (TextView)findViewById(R.id.total_property_tax_paid);
        mPayOffDate = (TextView)findViewById(R.id.pay_off_date);

        //Spinner
        Spinner mTermsSpinner = (Spinner)findViewById(R.id.terms_spinner);
        appButtons(); //Set Calculate and Reset Buttons

    }

    public void appButtons() {

        //Reset Button
        mReset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mHomeValue.setText("");
                        mDownPayment.setText("");
                        mInterestRate.setText("");
                        mPropertyTaxRate.setText("");

                        mMonthlyPaymentAmount.setText("");
                        mTotalInterestPaid.setText("");
                        mTotalPropertyTaxPaid.setText("");
                        mPayOffDate.setText("");
                    }
                }
        );

        //Calculate Button
        mCalculate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //principal = mHomeValue.parseDouble(myString) - mDownPayment.parseDouble(myString);
                    }
                }
        );
    }

}
