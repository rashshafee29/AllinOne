package com.example.rashidalshafee.allinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button simpleCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Simple Calculator
        Button simpleCalc = (Button)findViewById(R.id.simpleCalc);
        simpleCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SimpleCalculator.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Calculator",Toast.LENGTH_SHORT).show();
            }
        });


        //Tempareture
        Button temp = (Button)findViewById(R.id.temp);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tempareture.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Tempareture",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
