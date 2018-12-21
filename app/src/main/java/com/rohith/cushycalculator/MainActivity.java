package com.rohith.cushycalculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout calinputlayout;


    ViewGroup.LayoutParams layoutParams;

    private float mScaleFactor = 1.f;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calinputlayout=findViewById(R.id.calculationinputlayout);

        layoutParams=calinputlayout.getLayoutParams();


        calinputlayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction()==MotionEvent.ACTION_DOWN){

                    float y=event.getY();



                    ViewGroup.LayoutParams layoutParams=v.getLayoutParams();

                    

                    v.setLayoutParams(layoutParams);






                }
                if (event.getAction()==MotionEvent.ACTION_MOVE){

                    float y=event.getY();


                    layoutParams.height=Integer.getInteger(String.valueOf(y));

                    calinputlayout.setLayoutParams(layoutParams);

                }


                return true;
            }
        });

    }
}
