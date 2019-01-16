package com.rohith.cushycalculator;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.icu.math.BigDecimal;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
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

import java.awt.font.TextAttribute;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {


    TextView num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,dot;
    ImageView deleteTyped,addvalue,subtractvalue,dividevalue,multiplyvalue;
    CardView inputequatecard,inputoperatorscard,inputnumberscard;
    LinearLayout inputoperatorsparent,inputnumberslayout;
    ImageView closescientific;
    ToggleButton opensientific;
    LinearLayout scientificinputlayout;
    EditText displaycalculation;
    TextView showequatedvalue;
    TextView exp,mod,pi,ln,superscript,reciprocal,paranopen,paranclose,squareroot,fractionalpart,log;

    String calculationtext;
    String enteredvalue="";
    int currentvalue;

    String naturallog="";

    String logarithm="";


    String squarerootval="";

    String fracpart="";





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




        //Scientific functions.
        exp=findViewById(R.id.exp);






        mod=findViewById(R.id.mod);
        pi=findViewById(R.id.pi);
        ln=findViewById(R.id.ln);
        superscript=findViewById(R.id.superscript);
        reciprocal=findViewById(R.id.reciprocal);
        paranclose=findViewById(R.id.paranclose);
        paranopen=findViewById(R.id.paranopen);
        squareroot=findViewById(R.id.squareroot);
        fractionalpart=findViewById(R.id.fractionalpart);
        log=findViewById(R.id.log);






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


                squarerootval=squarerootval+"0";

                fracpart=fracpart+"0";

                naturallog=naturallog+"0";

                logarithm=logarithm+"0";

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
                squarerootval=squarerootval+"1";
                fracpart=fracpart+"1";
                naturallog=naturallog+"1";

                logarithm=logarithm+"1";

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

                squarerootval=squarerootval+"2";
                fracpart=fracpart+"2";

                naturallog=naturallog+"2";


                logarithm=logarithm+"2";
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

                squarerootval=squarerootval+"3";
                fracpart=fracpart+"3";

                naturallog=naturallog+"3";

                logarithm=logarithm+"3";



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

                squarerootval=squarerootval+"4";


                fracpart=fracpart+"4";

                naturallog=naturallog+"4";

                logarithm=logarithm+"4";
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

                squarerootval=squarerootval+"5";


                fracpart=fracpart+"5";


                naturallog=naturallog+"5";

                logarithm=logarithm+"5";

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


                squarerootval=squarerootval+"6";


                naturallog=naturallog+"6";


                fracpart=fracpart+"6";

                logarithm=logarithm+"6";

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

                squarerootval=squarerootval+"7";


                fracpart=fracpart+"7";


                naturallog=naturallog+"7";

                logarithm=logarithm+"7";

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

                squarerootval=squarerootval+"8";


                fracpart=fracpart+"8";



                naturallog=naturallog+"8";

                logarithm=logarithm+"8";

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

                squarerootval=squarerootval+"9";


                fracpart=fracpart+"9";

                naturallog=naturallog+"9";

                logarithm=logarithm+"9";

            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(dot);
                enteredvalue=enteredvalue+".";

                calculationtext=displaycalculation.getText().toString()+".";
                displaycalculation.setText(calculationtext);

                squarerootval=squarerootval+".";

                fracpart=fracpart+".";

                naturallog=naturallog+".";

                logarithm=logarithm+".";

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


                calculationtext=displaycalculation.getText().toString()+" + ";

                displaycalculation.setText(calculationtext);









            }
        });


        subtractvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(subtractvalue);

                calculationtext=displaycalculation.getText().toString()+" - ";




                displaycalculation.setText(calculationtext);









            }
        });


        dividevalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(dividevalue);

                calculationtext=displaycalculation.getText().toString()+" ÷ ";

                displaycalculation.setText(calculationtext);






            }
        });


        multiplyvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(multiplyvalue);

                calculationtext=displaycalculation.getText().toString()+" × ";



                displaycalculation.setText(calculationtext);





            }
        });





        LayoutTransition layoutTransition=new LayoutTransition();
        layoutTransition.setDuration(100);
        inputnumberslayout.setLayoutTransition(layoutTransition);
        scientificinputlayout.setLayoutTransition(layoutTransition);








        //Scientific functions click listeneres.
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(mod);
                calculationtext=displaycalculation.getText().toString()+" Mod ";



                displaycalculation.setText(calculationtext);

            }
        });


        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(pi);
                calculationtext=displaycalculation.getText().toString()+" π ";



                displaycalculation.setText(calculationtext);

            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(ln);

                naturallog="";

                calculationtext=displaycalculation.getText().toString()+"ln(";



                displaycalculation.setText(calculationtext);



            }
        });


        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                clickAnim(exp);






                    calculationtext=displaycalculation.getText().toString()+" e ";



                displaycalculation.setText(calculationtext);







            }
        });




        reciprocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(reciprocal);

                calculationtext=displaycalculation.getText().toString()+"1/(";



                displaycalculation.setText(calculationtext);

            }
        });

        paranopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(paranopen);
                calculationtext=displaycalculation.getText().toString()+"(";



                displaycalculation.setText(calculationtext);

            }
        });


        paranclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(paranclose);
                calculationtext=displaycalculation.getText().toString()+")";



                displaycalculation.setText(calculationtext);

            }
        });

        squareroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(squareroot);


                squarerootval="";
                calculationtext=displaycalculation.getText().toString()+"√";



                displaycalculation.setText(calculationtext);

            }
        });




        superscript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(superscript);
                calculationtext=displaycalculation.getText().toString()+"^";



                displaycalculation.setText(calculationtext);

            }
        });


        fractionalpart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(fractionalpart);

                fracpart="";

                calculationtext=displaycalculation.getText().toString()+"frac(";



                displaycalculation.setText(calculationtext);


            }
        });



        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(log);

                logarithm="";


                calculationtext=displaycalculation.getText().toString()+"log(";



                displaycalculation.setText(calculationtext);

            }
        });















        //Cards click listeners.
        inputequatecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickAnim(inputequatecard);

                double s=Double.valueOf(fracpart);

                long integerpart=(long)s;



                if (!TextUtils.isEmpty(calculationtext)){
                    Expression expression=new Expression(calculationtext.replace(" × "," * ").replace(" ÷ "," / ").replace(" Mod "," % ").replace(" π ", " "+Math.PI+" ").replace("√",""+Math.sqrt(Double.valueOf(squarerootval))).replace("frac(",String.valueOf(Double.valueOf(fracpart)-integerpart)).replace("ln(",String.valueOf(Math.log(Double.valueOf(naturallog)))).replace("log(",String.valueOf(Math.log10(Double.valueOf(logarithm)))) );

                    java.math.BigDecimal equatevalue=expression.eval();

                    showequatedvalue.setText(String.valueOf(equatevalue));
                }





            }
        });









        opensientific.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    inputnumberslayout.setVisibility(View.GONE);
                    scientificinputlayout.setVisibility(View.VISIBLE);
                    opensientific.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));

                }
                else {
                    inputnumberslayout.setVisibility(View.VISIBLE);
                    scientificinputlayout.setVisibility(View.GONE);
                    opensientific.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.Grey)));
                }
            }
        });




        closescientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            opensientific.setChecked(false);

            }
        });



        deleteTyped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textString = displaycalculation.getText().toString().trim();

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








