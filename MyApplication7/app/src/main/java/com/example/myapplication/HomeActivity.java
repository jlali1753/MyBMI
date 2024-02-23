package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    String textTitre=" حاسبة الوزن المثالي";
    String textNote="تقوم حاسبة الوزن المثالي بحساب الوزن المثالي حسب الطول والعمر أو كما يعرف معادلة الوزن المثالي للطول أو الوزن المناسب للطول أو حساب الوزن الصحي ومن أجل القيام بهذه العملية يجب عليك معرفة وزنك من خلال قياس الوزن ومعرفة طولك من خلال قياس الطول الخاص بك، وتقوم حاسبة الوزن المثالي لكل طول بشكل الكتروني بعملية قياس كتلة الجسم الخاص بك واعطاؤك معلومات عن الوزن المثالي الذي يجب ان تسعى إلى تحقيقه وذلك عن طريق تخسيس الوزن اذا كان وزنك زائد أو عن طريق زيادة الوزن اذا كنت تعاني من نقص حاد في الوزن وذلك لكي تحصل على الجسم المثالي الذي سوف يشعرك بالراحة النفسية ويقيك من الأمراض التي تسببها السمنة.  ولنلخص ما سبق فأن قياس الوزن المثالي للرجل أو للمرأة يعتمد بالأساس على قياس BMI الذي يعرف بالعربية مؤشر كتلة الجسم، ويتم قياس هذا المؤشر عن طريق العلاقة بين الوزن والطول، ولتحصل على مؤشر كتلة جسمك أولاً احسب وزنك ثم ثانياً احسب طولك وقم بالعملية الحسابية التي وضحناها لك سابقاً أو استخدم موقعنا لقياس BMI الخاص بك.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void onClickStartHome(View view) {
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickLireHome(View view) {
        Intent intent = new Intent(HomeActivity.this, NoteActivity.class);
        intent.putExtra("textTitre", textTitre);
        intent.putExtra("textNote", textNote);
        startActivity(intent);
    }
    public void onClickInfoAppHome(View view) {
        Intent intent = new Intent(HomeActivity.this, InfoAppActivity.class);
        startActivity(intent);
    }

}