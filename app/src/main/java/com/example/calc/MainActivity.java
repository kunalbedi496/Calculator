package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button nine,eight,seven,six,five,four,three,two,one,plus,minus,multiply,divide,clear,equals,zero,dot;

    TextView tv;
    boolean addition=false;
    boolean subtraction=false;
    boolean division=false;
    boolean multiplication=false;
 double first,second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//finding id's

        nine=findViewById(R.id.nine);
        eight=findViewById(R.id.eight);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        six=findViewById(R.id.six);
        five=findViewById(R.id.five);
        four=findViewById(R.id.four);
        three=findViewById(R.id.three);
        two=findViewById(R.id.two);
        one=findViewById(R.id.one);
        zero=findViewById(R.id.zero);
        equals=findViewById(R.id.equals);
        dot=findViewById(R.id.dot);
        clear=findViewById(R.id.clear);
        divide=findViewById(R.id.divide);
        plus=findViewById(R.id.plus);
        multiply=findViewById(R.id.multiply);
        minus=findViewById(R.id.minus);

        tv=findViewById(R.id.tv);



        //setup Onclicklisteners

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("5");

            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("9");

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.append("0");
            }
        });


        //dot and equals

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



               /* try {
                    String textd = "" + tv.getText();
                    int l = textd.length()+1;
                    while (l >= 0) {


                        int findex = textd.indexOf('.');
                        int lindex = textd.lastIndexOf('.');
                        if (findex == lindex) {
                            Toast.makeText(MainActivity.this, "invalid condition", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            tv.append(".");

                        }

                        l--;
                    }
                }
                catch (Exception e){}
*/


                   /* int findex = textd.indexOf('.');
                    int lindex = textd.lastIndexOf('.');

                    if(findex==lindex)
                    {
                        tv.append(".");
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"invalid condition",Toast.LENGTH_SHORT).show();
                    }
                */

            }
        });


        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    second = Double.valueOf("" + tv.getText()); //converting value into double type and storing in second variable
                    if (addition) {
                        tv.setText("" + (first + second));
                    }
                    if (subtraction) {
                        tv.setText("" + (first - second));
                    }
                    if (multiplication) {
                        tv.setText("" + (first * second));
                    }
                    if (division) {
                        tv.setText("" + (first / second));
                    }
                    //reset the flags
                    addition = false;
                    subtraction = false;
                    multiplication = false;
                    division = false;
                }
                catch (Exception e){}

            }
        });


        //operators


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    first = Double.valueOf("" + tv.getText()); //value of screen converted into double and stored in variable first

                    /* or first=Double.valueOf(tv.getText().toString());*/

                    tv.setText(null); //wipe out the text of screen
                    addition=true;
                    subtraction=false;
                    multiplication=false;
                    division=false;

                }
                catch (Exception e){}


            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    first = Double.valueOf("" + tv.getText());  //value of screen converted into double and stored in variable first
                    tv.setText("");
                    addition=false;
                    subtraction=true;
                    multiplication=false;
                    division=false;
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"second operator",Toast.LENGTH_SHORT).show();
                }

            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    first = Double.valueOf("" + tv.getText());  //value of screen converted into double and stored in variable first
                    tv.setText("");
                    addition=false;
                    subtraction=false;
                    multiplication=false;
                    division=true;
                }
                catch (Exception e){}
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    first = Double.valueOf("" + tv.getText());  //value of screen converted into double and stored in variable first
                    tv.setText("");
                    addition=false;
                    subtraction=false;
                    multiplication=true;
                    division=false;

                }
                catch (Exception e){}

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textw=String.valueOf(tv.getText());

              // String textw=""+tv.getText(); second way to convert sequence of characters to string
               // tv.setText(textw.substring(0,textw.length()-1));

                try{
                    tv.setText(textw.substring(0,textw.length()-1));
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"we have nothing to clear",Toast.LENGTH_SHORT).show();
                }

                clear.setOnLongClickListener(new View.OnLongClickListener() { //on long pressing clear all data should be erased
                    @Override
                    public boolean onLongClick(View view) {
                        tv.setText("");
                        return false;
                    }
                });
            }
        });





    }
}
