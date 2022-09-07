package com.example.myhello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addBtn=(Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText firstNumEditText=(EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText=(EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView=(TextView) findViewById(R.id.resultTextView);

                Integer integer = null;
                int num1;
                num1 = integer.parseInt(firstNumEditText.getText().toString());
                int num2;
                num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });
    }
}