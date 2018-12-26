package com.rohith.cushycalculator;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,dot;
    ImageView deleteTyped,addvalue,removevalue,dividevalue,multiplyvalue;
    CardView inputequatecard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Input numbers.
        num0=findViewById(R.id.num0);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        num4=findViewById(R.id.num4);
        num5=findViewById(R.id.num5);
        num6=findViewById(R.id.num6);
        num7=findViewById(R.id.num7);
        num8=findViewById(R.id.num8);
        num9=findViewById(R.id.num9);
        dot=findViewById(R.id.dot);
        deleteTyped=findViewById(R.id.deletetyped);





        //Input operators.
        addvalue=findViewById(R.id.addvalue);
        removevalue=findViewById(R.id.removevalue);
        dividevalue=findViewById(R.id.dividevalue);
        multiplyvalue=findViewById(R.id.multiplyvalue);





        //Cards.
        inputequatecard=findViewById(R.id.inputequatecard);








        //Input nums click listeners.
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clickAnim(num0);
            }
        });



        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num1);
            }
        });



        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num2);
            }
        });



        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num3);
            }
        });



        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num4);
            }
        });



        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num5);
            }
        });



        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num6);
            }
        });



        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num7);
            }
        });



        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num8);
            }
        });



        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num9);
            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(dot);
            }
        });


        deleteTyped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(deleteTyped);
            }
        });




        //Input operators click listeners.
        addvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(addvalue);
            }
        });


        removevalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(removevalue);
            }
        });


        dividevalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(dividevalue);
            }
        });


        multiplyvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(multiplyvalue);
            }
        });






        //Cards click listeners.
        inputequatecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(inputequatecard);
            }
        });









    }



    public void clickAnim(View view){

        Animation ClickAnimation=new AlphaAnimation(0f,1f);
        ClickAnimation.setDuration(500);
        ClickAnimation.setStartOffset(10);
        view.startAnimation(ClickAnimation);

    }



    }








