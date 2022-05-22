package ru.synergi.androidstartproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Calculator extends AppCompatActivity {

private static final String LogcatTag="CALCULATOR_ACTIVITY";
private static final String LifecycleTog="LIVECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LifecycleTog, "I'm onCreate(),and i'm started");
        setContentView(R.layout.activity_calculator);

        final Button calculate = (Button) findViewById(R.id.calc);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Log.d(LogcatTag, "Button have been pushed");
            calculateAnswer()
           // Intent i = new Intent(Calculator.this,MainActivity.class);
           // startActivity();
            }
        });
    }
    private void calculateAnswer(){
        EditText numOne = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText numTwo = (EditText) findViewById(R.id.editTextNumberDecimal2);

        RadioButton add = (RadioButton) findViewById(R.id.add);
        RadioButton sub = (RadioButton) findViewById(R.id.subtract);
        RadioButton multiply = (RadioButton) findViewById(R.id.multiple);
        RadioButton divide = (RadioButton) findViewById(R.id.divide);

        TextView answer = (TextView) findViewById(R.id.result);

        double numone = Double.parseDouble(numOne.getText().toString());
        double numtwo = Double.parseDouble(numTwo.getText().toString());

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
