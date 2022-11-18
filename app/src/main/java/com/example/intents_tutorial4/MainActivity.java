package com.example.intents_tutorial4;

import static com.example.intents_tutorial4.projectKeys.Number1;
import static com.example.intents_tutorial4.projectKeys.Number2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editA1N1,editA1N2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editA1N1 = findViewById(R.id.editA1num1);
        editA1N2 = findViewById(R.id.editA1num2);
    }
    public void navigate (View view) {
        String number1 = editA1N1.getText().toString();
        String number2 = editA1N2.getText().toString();


        if (!number1.isEmpty() && !number2.isEmpty()) {
            Intent intent = new Intent(this, Activity2.class);
            intent.putExtra(Number1, number1);
            intent.putExtra(Number2, number2);

            int duration = Toast.LENGTH_SHORT;
           // Toast toast = Toast.makeText(this, getResources().getString(R.string.toastMessage), duration);
           // toast.setGravity(Gravity.LEFT, 0, 0);
           // toast.show();

            LayoutInflater layoutInflater =getLayoutInflater();
            View layout =layoutInflater.inflate(R.layout.custom,findViewById(R.id.custom));
            Toast toast = new Toast(this);
            toast.setDuration(duration);
            toast.setGravity(Gravity.CENTER_VERTICAL,0,0) ;
            toast.setView(layout) ;
            toast.show();


            startActivity(intent);

        } else {
            Toast.makeText(this, getResources().getString(R.string.toastAdd),
                    Toast.LENGTH_SHORT).show();
        }

    }}
