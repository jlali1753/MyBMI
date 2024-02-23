package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NoteActivity extends AppCompatActivity {
    String textTitre=" ضضضضضضضض";
    String textNote="ضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضضض";
    TextView textViewTextTitre;TextView textViewTextNote;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Intent intent = getIntent();
        textTitre = intent.getStringExtra("textTitre");
        textNote = intent.getStringExtra("textNote");

        textViewTextTitre = (TextView) findViewById(R.id.textViewTextTitre);
        textViewTextNote = (TextView) findViewById(R.id.textViewTextNote);

        textViewTextTitre.setText(textTitre);
        textViewTextNote.setText(textNote);

    }
}
