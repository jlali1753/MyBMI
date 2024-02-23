package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    String textToul="";
    String textWazn="";
    String textResult="";
    String textNote="";
    TextView textViewWazn;TextView textViewtoul;TextView textViewbmi;;TextView textViewNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewWazn = (TextView) findViewById(R.id.textViewWazn);
        textViewtoul = (TextView) findViewById(R.id.textViewtoul);
        textViewbmi = (TextView) findViewById(R.id.textViewbmi);
        textViewNote = (TextView) findViewById(R.id.textViewNote);

        Intent intent = getIntent();
        textToul = intent.getStringExtra("textToul");
        textWazn = intent.getStringExtra("textWazn");
        textResult = intent.getStringExtra("textResult");
        textNote = intent.getStringExtra("textNote");
        textViewtoul.setText(textToul);
        textViewWazn.setText(textWazn);
        textViewbmi.setText(textResult);
         textViewNote.setText(textNote);




    }
    public void onClick2(View view) {
        finish();

    }

    public void onClickZiedetWazn(View view) {
        String textTitre="طريقة زيادة الوزن";
        String text="في حال كنت تعاني من نقص في وزنك فانه عليك العمل على زيادة وزنك بطريقة صحيحة وصحية، ومن أجل زيادة الوزن فانه يجب عليك العمل على اسباب زيادة الوزن فمن خلال تناول أطعمة تحتوي على سعرات حرارية ( طاقة ) أكثر من حاجة جسمك فان ذلك بدوره سوف يؤدي تغير حالة جسمك وزيادة وزنك مع الوقت،وايضاً زيادة كمية الطعام في وجبة العشاء سوف تساعد أيضاً في زيادة وزنك،";
        Intent intent = new Intent(ResultActivity.this, NoteActivity.class);
        intent.putExtra("textTitre", textTitre);
        intent.putExtra("textNote",text );
        startActivity(intent);
    }
    public void onClickNo9sWazn(View view) {
        String textTitre="طريقة انقاص الوزن";
        String text="يمكنك انقاص وزنك بدون انقاص كمية الطعام التي تتناولها وذلك عن طريق تأخير الفطور صباحا لساعتين أو ثلاثة عن وقت افطارك الحالي المعتاد، بالاضافة إلى تبكير العشاء حوالي ثلاث ساعات قبل موعد نومك، ومع الوقت سوف تلاحظ انخفاض في وزنك، بالاضافة إلى ذلك يمكنك ممارسة بعض التمارين الرياضية صباحاً أو مساءً حسب الرغبة وذلك سوف يساعد في خسارة أكبر في الوزن مع الوقت.";
        Intent intent = new Intent(ResultActivity.this, NoteActivity.class);
        intent.putExtra("textTitre", textTitre);
        intent.putExtra("textNote", text);
        startActivity(intent);
    }
}