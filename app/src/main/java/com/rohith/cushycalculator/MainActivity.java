package com.rohith.cushycalculator;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.icu.math.BigDecimal;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.udojava.evalex.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {


    TextView num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,dot;
    ImageView deleteTyped,addvalue,subtractvalue,dividevalue,multiplyvalue;
    CardView inputequatecard,inputoperatorscard,inputnumberscard;
    LinearLayout inputoperatorsparent,inputnumberslayout;
    ImageView opensientific,closescientific;
    RelativeLayout scientificinputlayout;
    EditText displaycalculation;
    TextView showequatedvalue;

    String calculationtext;
    String enteredvalue="";
    int currentvalue;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
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
        subtractvalue=findViewById(R.id.subtractvalue);
        dividevalue=findViewById(R.id.dividevalue);
        multiplyvalue=findViewById(R.id.multiplyvalue);
        inputoperatorsparent=findViewById(R.id.inputoperatorsparent);
        inputnumberslayout=findViewById(R.id.inputnumberslayout);





        //Cards.
        inputequatecard=findViewById(R.id.inputequatecard);
        inputoperatorscard=findViewById(R.id.inputoperatorscard);
        inputnumberscard=findViewById(R.id.inputnumberscard);




        //ImageViews.
        opensientific=findViewById(R.id.openscientific);
        closescientific=findViewById(R.id.closescientific);




        //Scientific input layout.
        scientificinputlayout=findViewById(R.id.scientificInputOptions);
        scientificinputlayout.setVisibility(View.GONE);





        //Calculation display layout and its child views.
        displaycalculation=findViewById(R.id.edittext);
        showequatedvalue=findViewById(R.id.showequatedvalue);



        displaycalculation.setShowSoftInputOnFocus(false);


        displaycalculation.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                displaycalculation.setSelection(displaycalculation.getText().length());




            }

            @Override
            public void afterTextChanged(Editable s) {



            }
        });











        //Input nums click listeners.
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clickAnim(num0);
                enteredvalue=enteredvalue+"0";
                currentvalue=0;

                calculationtext=displaycalculation.getText().toString()+"0";


                displaycalculation.setText(calculationtext);
            }
        });



        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num1);

                enteredvalue=enteredvalue+"1";
                currentvalue=1;

                calculationtext=displaycalculation.getText().toString()+"1";
                displaycalculation.setText(calculationtext);

            }
        });



        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num2);
                enteredvalue=enteredvalue+"2";
                currentvalue=2;

                calculationtext=displaycalculation.getText().toString()+"2";
                displaycalculation.setText(calculationtext);
            }
        });



        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num3);

                enteredvalue=enteredvalue+"3";
                currentvalue=3;

                calculationtext=displaycalculation.getText().toString()+"3";
                displaycalculation.setText(calculationtext);
            }
        });



        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num4);

                enteredvalue=enteredvalue+"4";
                currentvalue=4;

                calculationtext=displaycalculation.getText().toString()+"4";
                displaycalculation.setText(calculationtext);
            }
        });



        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num5);

                enteredvalue=enteredvalue+"5";
                currentvalue=5;

                calculationtext=displaycalculation.getText().toString()+"5";
                displaycalculation.setText(calculationtext);
            }
        });



        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num6);

                enteredvalue=enteredvalue+"6";
                currentvalue=6;

                calculationtext=displaycalculation.getText().toString()+"6";
                displaycalculation.setText(calculationtext);
            }
        });



        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num7);

                enteredvalue=enteredvalue+"7";
                currentvalue=7;

                calculationtext=displaycalculation.getText().toString()+"7";
                displaycalculation.setText(calculationtext);
            }
        });



        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num8);
                enteredvalue=enteredvalue+"8";
                currentvalue=8;

                calculationtext=displaycalculation.getText().toString()+"8";
                displaycalculation.setText(calculationtext);
            }
        });



        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(num9);
                enteredvalue=enteredvalue+"9";
                currentvalue=9;

                calculationtext=displaycalculation.getText().toString()+"9";
                displaycalculation.setText(calculationtext);
            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(dot);
                enteredvalue=enteredvalue+".";
                calculationtext=displaycalculation.getText().toString()+".";
                displaycalculation.setText(calculationtext);
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


                calculationtext=displaycalculation.getText().toString()+"+";

                displaycalculation.setText(calculationtext);









            }
        });


        subtractvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(subtractvalue);

                calculationtext=displaycalculation.getText().toString()+"-";




                displaycalculation.setText(calculationtext);









            }
        });


        dividevalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(dividevalue);

                calculationtext=displaycalculation.getText().toString()+"÷";

                displaycalculation.setText(calculationtext);






            }
        });


        multiplyvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(multiplyvalue);

                calculationtext=displaycalculation.getText().toString()+"×";



                displaycalculation.setText(calculationtext);





            }
        });





        LayoutTransition layoutTransition=new LayoutTransition();
        layoutTransition.setDuration(100);
        inputnumberslayout.setLayoutTransition(layoutTransition);
        scientificinputlayout.setLayoutTransition(layoutTransition);






        //Cards click listeners.
        inputequatecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(inputequatecard);




                if (!TextUtils.isEmpty(calculationtext)){
                    Expression expression=new Expression(calculationtext.replace("×","*").replace("÷","/"));
                    java.math.BigDecimal equatevalue=expression.eval();

                    showequatedvalue.setText(String.valueOf(equatevalue));
                }




            }
        });






        //ImageViews click listeners.
        opensientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumberslayout.setVisibility(View.GONE);
                scientificinputlayout.setVisibility(View.VISIBLE);



            }
        });



        closescientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scientificinputlayout.setVisibility(View.GONE);
                inputnumberslayout.setVisibility(View.VISIBLE);


            }
        });



        deleteTyped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textString = displaycalculation.getText().toString();
                if( textString.length() > 0 ) {
                    displaycalculation.setText(textString.substring(0, textString.length() - 1 ));
                    displaycalculation.setSelection(displaycalculation.getText().length());
                    calculationtext=displaycalculation.getText().toString();
                }
            }
        });












    }



    public void clickAnim(View view){

        Animation ClickAnimation=new AlphaAnimation(0f,1f);
        ClickAnimation.setDuration(500);
        ClickAnimation.setStartOffset(10);
        view.startAnimation(ClickAnimation);

    }




    //Methods for basic input operators following BODMAS rules.

    public void division(int inputValue){
       int totalvalue =Integer.valueOf(calculationtext)/inputValue;

       calculationtext=String.valueOf(totalvalue);

        showequatedvalue.setText(calculationtext);
    }

    public void multiplication(int inputValue){
       int totalvalue=Integer.valueOf(calculationtext)*inputValue;

        calculationtext=String.valueOf(totalvalue);

        showequatedvalue.setText(calculationtext);
    }

    public void addition(int inputValue){
       int totalvalue=Integer.valueOf(calculationtext)+inputValue;

        calculationtext=String.valueOf(totalvalue);

        showequatedvalue.setText(calculationtext);
    }

    public void subtraction(int inputValue){
       int totalvalue=Integer.valueOf(calculationtext)-inputValue;

        calculationtext=String.valueOf(totalvalue);

        showequatedvalue.setText(calculationtext);
    }



    public void equate(){

    }








    }








