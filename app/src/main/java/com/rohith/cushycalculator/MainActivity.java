package com.rohith.cushycalculator;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout calinputlayout;

    ImageView button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC;
    EditText EditText;

    float mValueOne, mValueTwo;

    boolean Addition, mSubtract, Multiplication, Division;


    ToggleButton inputminimizer;

    CardView inputcard;

    LinearLayout inputLayout;



    private float mScaleFactor = 0.5f;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLayout=findViewById(R.id.inputlayout);

        inputminimizer=findViewById(R.id.inputlayoutminimizer);


        inputcard=findViewById(R.id.inputcard);

        final LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT,1f);
        layoutParams.bottomMargin=-10;


        final LinearLayout.LayoutParams layoutParams2=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT,0f);
        layoutParams2.bottomMargin=-10;





        inputminimizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputminimizer.isChecked()){
                    inputLayout.setVisibility(View.GONE);

                    inputcard.setLayoutParams(layoutParams2);




                }
                else {
                    inputLayout.setVisibility(View.VISIBLE);
                    inputcard.setLayoutParams(layoutParams);

                }
            }
        });


        inputminimizer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    inputminimizer.setBackground(getResources().getDrawable(R.drawable.ic_keyboard_arrow_up_black_24dp));
                }
                else {
                    inputminimizer.setBackground(getResources().getDrawable(R.drawable.ic_keyboard_arrow_down_black_24dp));
                }
            }
        });



         button0 =findViewById(R.id._0);
        button1 =findViewById(R.id._1);
        button2 =findViewById(R.id._2);
        button3 =findViewById(R.id._3);
        button4 =findViewById(R.id._4);
        button5 =findViewById(R.id._5);
        button6 =findViewById(R.id._6);
        button7 =findViewById(R.id._7);
        button8 =findViewById(R.id._8);
        button9 =findViewById(R.id._9);
        button10=findViewById(R.id.dot);
        buttonMul =findViewById(R.id._multiply);
        buttonDivision =findViewById(R.id.divide);

        buttonAdd =findViewById(R.id._plus);
        buttonC = findViewById(R.id.back);
        EditText = findViewById(R.id.textView);

        buttonSub=findViewById(R.id._minus);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               EditText.setText(EditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               EditText.setText(EditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (EditText == null) {
                    EditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(EditText.getText() + "");
                    Addition = true;
                    EditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                mSubtract = true;
                EditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                Multiplication = true;
                EditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                Division = true;
                EditText.setText(null);
            }
        });



        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + ".");
            }
        });
    }
    }

