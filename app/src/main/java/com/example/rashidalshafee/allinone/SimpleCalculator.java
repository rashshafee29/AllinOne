package com.example.rashidalshafee.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.BatchUpdateException;

public class SimpleCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        final EditText txt1 = (EditText)findViewById(R.id.txt1);
        final EditText txt2 = (EditText)findViewById(R.id.txt2);
        final TextView resView = (TextView)findViewById(R.id.resView);
        final TextView resBtn = (TextView)findViewById(R.id.resBtn);

        //add
        Button add = (Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txt1.getText().toString().equals("")) || txt2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double num1 = Double.parseDouble(txt1.getText().toString());
                    double num2 = Double.parseDouble(txt2.getText().toString());

                    double resAdd = num1 + num2;
                    String ans = String.valueOf(resAdd);
                    resView.setText(ans);
                    resBtn.setText("Clicked Add button");
                }
            }
        });

        //sub
        Button sub = (Button)findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txt1.getText().toString().equals("")) || txt2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double num1 = Double.parseDouble(txt1.getText().toString());
                    double num2 = Double.parseDouble(txt2.getText().toString());

                    double resAdd = num1 - num2;
                    String ans = String.valueOf(resAdd);
                    resView.setText(ans);
                    resBtn.setText("Clicked Sub button");
                }
            }
        });

        //Mul
        Button mul = (Button)findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txt1.getText().toString().equals("")) || txt2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double num1 = Double.parseDouble(txt1.getText().toString());
                    double num2 = Double.parseDouble(txt2.getText().toString());

                    double resAdd = num1 * num2;
                    String ans = String.valueOf(resAdd);
                    resView.setText(ans);
                    resBtn.setText("Clicked Mul utton");
                }
            }
        });

        //Div
        Button div = (Button)findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txt1.getText().toString().equals("")) || txt2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double num1 = Double.parseDouble(txt1.getText().toString());
                    double num2 = Double.parseDouble(txt2.getText().toString());
                    double resAdd;
                    String ans;
                    if(num2==0){
                        ans = "Invalid";
                    }
                    else
                    {
                        resAdd = num1/num2;
                        ans = String.valueOf(resAdd);
                    }
                    resView.setText(ans);
                    resBtn.setText("Clicked Div button");
                }
            }
        });

    }
}
