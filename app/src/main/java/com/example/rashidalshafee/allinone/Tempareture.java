package com.example.rashidalshafee.allinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tempareture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempareture);

        final EditText input = (EditText)findViewById(R.id.input);
        final TextView resView = (TextView)findViewById(R.id.resView);
        final TextView resBtn = (TextView)findViewById(R.id.resBtn);

        //F - to - C
        Button fTOc = (Button)findViewById(R.id.fTOc);
        fTOc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double val = Double.parseDouble(input.getText().toString());
                    double res = (val-32)*(5.0/9.0);
                    resView.setText(String.valueOf(res));
                    resBtn.setText("Click Fahrenheit to Celsius");
                }
            }
        });

        //C - to - F
        Button cTOf = (Button)findViewById(R.id.cTOf);
        cTOf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                }
                else{

                    double val = Double.parseDouble(input.getText().toString());
                    double res = ((9.0/5.0)*val)+32;
                    resView.setText(String.valueOf(res));
                    resBtn.setText("Clicked Celsius to Fahrenheit");
                }
            }
        });

    }
}
