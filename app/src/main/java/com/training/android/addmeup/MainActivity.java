package com.training.android.addmeup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEtFirst;
    private EditText mEtSecond;
    private TextView mTvSum;
    private Button   mBtnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtFirst = (EditText) findViewById(R.id.etFirstNum);
        mEtSecond = (EditText) findViewById(R.id.etSecondNum);
        mTvSum = (TextView) findViewById(R.id.tvSum);
        mBtnAdd = (Button) findViewById(R.id.btnAdd);

        mBtnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Get the two numbers
        double n1 = Double.parseDouble(mEtFirst.getText().toString());
        double n2 = Double.parseDouble(mEtSecond.getText().toString());

        // Compute for the sum
        double sum = n1 + n2;

        // Set the answer to the textview
        mTvSum.setText(String.valueOf(sum));
    }
}
