package ru.synergi.androidstartproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

    TextView textView = (TextView) findViewById(R.id.header);

    textView.setText("Hello from Java");


//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        TextView textView = new TextView(this);
//        textView.setText("Hello Android!");
//        textView.setTextSize(40);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,  // базовые параметры
//                ConstraintLayout.LayoutParams.WRAP_CONTENT);
////цепляемся к родителю
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;   //по левому краю
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;     // по верху
//        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;  // по правому краю
//      //  layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID; // по низу
//        textView.setLayoutParams(layoutParams);
//
//        constraintLayout.addView(textView);
//
//        setContentView(constraintLayout);

    }
}