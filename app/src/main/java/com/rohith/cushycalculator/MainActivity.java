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
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout calinputlayout;



    ToggleButton inputminimizer;

    CardView inputcard;

    LinearLayout inputLayout;



    private float mScaleFactor = 0.5f;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calinputlayout=findViewById(R.id.calculationinputlayout);

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
                    calinputlayout.setVisibility(View.GONE);

                    inputcard.setLayoutParams(layoutParams2);




                }
                else {
                    calinputlayout.setVisibility(View.VISIBLE);
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





    }
}
