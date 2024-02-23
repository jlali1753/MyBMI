package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout1;//LinearLayout linearLayout2;
    EditText editTextText1;EditText editTextText2;

    int wazn;
    int toul;
    double BMI;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          linearLayout1 = (LinearLayout) findViewById(R.id.LinearLayout1);
         // linearLayout2 = (LinearLayout) findViewById(R.id.LinearLayout2);

        //linearLayout1.setVisibility(View.VISIBLE);
       // linearLayout2.setVisibility(View.GONE);

        editTextText1 = (EditText) findViewById(R.id.editTextText1);
        editTextText2 = (EditText) findViewById(R.id.editTextText2);


    }
    public void onClick(View view) {

        String textToul="";
        String textWazn="";
        String textResult="";
        String textNote="";
        if(!editTextText1.getText().toString().equals("") && !editTextText2.getText().toString().equals("")){
            wazn=Integer.parseInt(editTextText1.getText().toString());
            toul=Integer.parseInt(editTextText2.getText().toString());
            editTextText1.setText("");
            editTextText2.setText("");
            //textViewtoul.setText("الطول: "+ toul);
            textToul="الطول: "+ toul;
            //textViewWazn.setText("الوزن: "+ wazn);
            textWazn = "الوزن: "+ wazn;

             BMI=(double)((double)wazn/(((double)toul/100)*((double)toul/100)));
            //textViewbmi.setText("مؤشر كتلة الجسم BMI هو: " + Math.round(BMI));
            textNote="مؤشر كتلة الجسم BMI هو: " + Math.round(BMI);
            if (BMI<15){
                // textViewNote.setText("نقص حاد جداً في الوزن");
                textNote= "نقص حاد جداً في الوزن";
            }else if (BMI<16){
               // textViewNote.setText("نقص حاد في الوزن");
                textNote="نقص حاد في الوزن";
            }else if (BMI<18.5){
               // textViewNote.setText("نقص في الوزن");
                textNote="نقص في الوزن";
            }else if (BMI<25){
                //textViewNote.setText("وزن طبيعي");
                textNote="وزن طبيعي";
            }else if (BMI<30){
                //textViewNote.setText("زيادة في الوزن");
                textNote="زيادة في الوزن";
            }else if (BMI<35){
                //textViewNote.setText("سمنة درجة أولى");
                textNote="سمنة درجة أولى";
            }else if (BMI<40){
                //textViewNote.setText("سمنة درجة ثانية");
                textNote="سمنة درجة ثانية";
            }else if (BMI>40){
                //textViewNote.setText("سمنة مفرطة جداً");
                textNote="سمنة مفرطة جداً";
            }

                //linearLayout1.setVisibility(View.GONE);
            //linearLayout2.setVisibility(View.VISIBLE);

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("textToul", textToul);
            intent.putExtra("textWazn", textWazn);
            intent.putExtra("textResult", textResult);
            intent.putExtra("textNote", textNote);
            startActivity(intent);
        }
    }

}