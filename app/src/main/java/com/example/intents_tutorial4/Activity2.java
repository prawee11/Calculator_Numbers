package com.example.intents_tutorial4;

import static com.example.intents_tutorial4.projectKeys.Number1;
import static com.example.intents_tutorial4.projectKeys.Number2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
EditText edtTA2N1,edtA2N2;
TextView txtDisplay;
String number1, number2;
int n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        edtTA2N1 = findViewById(R.id.editA2num1);
        edtA2N2= findViewById(R.id.editA2num2);
        txtDisplay = findViewById(R.id.msg);

        Intent intent = getIntent();

        number1 = intent.getStringExtra(Number1);
        number2 = intent.getStringExtra(Number2);

        edtTA2N1.setText(number1);
        edtA2N2.setText(number2);
n1=Integer.parseInt(number1);
n2=Integer.parseInt(number2);


    }

    public void addition(View view){
      txtDisplay.setText(getResources().getString(R.string.textDisplay,n1,'+',n2,n1+n2));
    }
    public void substraction(View view){
        txtDisplay.setText(getResources().getString(R.string.textDisplay,n1,'-',n2,n1-n2));
    }
    public void multipication(View view){
        txtDisplay.setText(getResources().getString(R.string.textDisplay,n1,'*',n2,n1*n2));
    }
    public void devision(View view){
        txtDisplay.setText(getResources().getString(R.string.textDisplay,n1,'/',n2,n1/n2));
    }
}