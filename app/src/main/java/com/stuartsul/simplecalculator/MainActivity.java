package com.stuartsul.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button button0, button1, button2, button3, button4, button5,
                    button6, button7, button8, button9;
    private Button buttonadd, buttondel, buttonmul, buttonsub,
                    buttonresult, buttonclear;

    private TextView text;
    private EditText edit;

    private int a;
    private int where=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonadd = (Button)findViewById(R.id.buttonadd);
        buttondel = (Button)findViewById(R.id.buttondel);
        buttonmul = (Button)findViewById(R.id.buttonmul);
        buttonsub = (Button)findViewById(R.id.buttonsub);
        buttonresult = (Button)findViewById(R.id.buttonresult);
        buttonclear = (Button)findViewById(R.id.buttonclear);
        text = (TextView)findViewById(R.id.t1);
        edit = (EditText)findViewById(R.id.e1);

        OnClickListener cl = new OnClickListener(){
            @Override
            public void onClick(View v) {
                //TODO: implement onClick method
            }
        };

        button0.setOnClickListener(cl);
        button1.setOnClickListener(cl);
        button2.setOnClickListener(cl);
        button3.setOnClickListener(cl);
        button4.setOnClickListener(cl);
        button5.setOnClickListener(cl);
        button6.setOnClickListener(cl);
        button7.setOnClickListener(cl);
        button8.setOnClickListener(cl);
        button9.setOnClickListener(cl);
        buttonadd.setOnClickListener(cl);
        buttondel.setOnClickListener(cl);
        buttonmul.setOnClickListener(cl);
        buttonsub.setOnClickListener(cl);
        buttonresult.setOnClickListener(cl);
        buttonclear.setOnClickListener(cl);
    }
}
