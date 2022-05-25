package ru.synergi.androidstartproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Calculator extends AppCompatActivity {

private static final String LogcatTag="CALCULATOR_ACTIVITY";
private static final String LifeCycleTag="LIFECYClE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LifeCycleTag,"I'm onCreate(), and i'm started");

        setContentView(R.layout.activity_calculator);

        final Button calculate = (Button) findViewById(R.id.calc);



        //Context training
        // TextView textView = new TextView(this);
        // ListAdapter adapter = new SimpleCursorAdapter(getApplicationContext());

        //Доступ из класса Activity -- наследник Context
        // getSystemService(LAYOUT_INFLATER_SERVICE);

        // Shared pref доступ с импользованием контекста приложения

        // SharedPreferences prefs = getApplicationContext().getSharedPreferences("PREFS", MODE_PRIVATE);


        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               Log.d(LogcatTag, "Button have been pushed");
                calculateAnswer();
            }
        });
    }

    public Calculator() {
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
    Log.d(LifeCycleTag, "I'm onCreate(), and i'm started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LifeCycleTag,"I'm onStop(), and i'm started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LifeCycleTag,"I'm onDestroy(), and i'm started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LifeCycleTag, "I'm onPause(), and i'm started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LifeCycleTag,"I'm onResume(), and i'm started");
    }

    private void calculateAnswer(){
        EditText numOne = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText numTwo = (EditText) findViewById(R.id.editTextNumberDecimal2);

        RadioButton add = (RadioButton) findViewById(R.id.add);
        RadioButton sub = (RadioButton) findViewById(R.id.subtract);
        RadioButton multiply = (RadioButton) findViewById(R.id.multiple);
        RadioButton divide = (RadioButton) findViewById(R.id.divide);

        double numone = 0;
        double numtwo = 0;
        String num1 = numOne.getText().toString();
        String num2 = numTwo.getText().toString();
        TextView answer = (TextView) findViewById(R.id.result);
        if (num1.equals("") && num1 != null) {
        numone = Double.parseDouble(numOne.getText().toString());}
        if (num2.equals("") && num2 != null) {
        numtwo = Double.parseDouble(numTwo.getText().toString());}

        double solution = 0;

        if (add.isChecked()){
            solution = numone + numtwo;
        }
        if (sub.isChecked()){
            solution = numone - numtwo;
        }
        if (multiply.isChecked()){
            solution = numone * numtwo;
        }
        if (divide.isChecked()){
            if(numtwo == 0 ){
                Toast.makeText(this,"На ноль делить нельзя", Toast.LENGTH_SHORT).show();
                return;
            }
            solution = numone / numtwo;
        }
        answer.setText("Результат: "+ solution);
    }

}
