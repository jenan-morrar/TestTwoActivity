package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View view) {
        editText = findViewById(R.id.edtTxt);
        String data = editText.getText().toString();
        Intent intent1 = new Intent(this,MainActivity2.class);
        intent1.putExtra("Data",data);
        startActivity(intent1);
    }

    public void click2(View view) {
        Intent intent2 = new Intent(Intent.ACTION_SEND);
        intent2.putExtra(Intent.EXTRA_TEXT,"This is a sample message.");
        intent2.putExtra(Intent.EXTRA_SUBJECT,"Hello There");
        intent2.setType("text/plain");
        Intent chooser = Intent.createChooser(intent2,null);

        startActivity(chooser);
    }
}