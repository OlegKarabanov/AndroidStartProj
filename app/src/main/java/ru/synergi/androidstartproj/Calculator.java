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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        final Button calculate = (Button) findViewById(R.id.calc);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            calculateAnswer();

            }
        });

    }

    private void calculateAnswer(){
        EditText numOne = (EditText) findViewById(R.id.editTextNumberDecimal); // ищем первый номер
        EditText numTwo = (EditText) findViewById(R.id.editTextNumberDecimal2); // ищем второй номер

        RadioButton add = (RadioButton) findViewById(R.id.add); // ищем радио баттон прибавить
        RadioButton sub = (RadioButton) findViewById(R.id.subtract);
        RadioButton multiply = (RadioButton) findViewById(R.id.multiple);
        RadioButton divide = (RadioButton) findViewById(R.id.divide);


        TextView answer = (TextView) findViewById(R.id.result); // ищем куда выгрузить результат

//        Log.d(LogcatTag, "All views have been founded");


        double numone = Double.parseDouble(numOne.getText().toString());
        double numtwo = Double.parseDouble(numTwo.getText().toString());
//        Log.d(LogcatTag, "Successfully grabbed data from input fields");
//        Log.d(LogcatTag, "numone is: " + numone + ";" + "numtwo is: " + numtwo);

        double solution = 0; // изначальный результат

        if (add.isChecked()){
            Log.d(LogcatTag, "Operation is add");
            solution = numone + numtwo;
        }
        if (sub.isChecked()){
            Log.d(LogcatTag, "Operation is sub");
            solution = numone - numtwo;
        }
        if (multiply.isChecked()){
            Log.d(LogcatTag, "Operation is multiply");
            solution = numone * numtwo;
        }
        if (divide.isChecked()){
            Log.d(LogcatTag, "Operation is divide");
            if(numtwo == 0){
                Toast.makeText(this,"На ноль делить низяяяя!", Toast.LENGTH_SHORT).show();
                return; // возврат программы если ввели ноль
            }
            solution = numone / numtwo;
        }
        Log.d(LogcatTag, "The result of operation is: " + solution);

        answer.setText("Результат: "+ solution);
    }

}
