package com.example.rubelcsedu.myapp;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.ageInput);
    }

    public void onSaveButtonClicked(View view){
        String input = editText.getText().toString();
        age = Integer.parseInt(input);
        editText.setText("");
        String type = "insert";

        MyDBHandler myDBHandler = new MyDBHandler(this);
        myDBHandler.execute(type,input);

        //Toast.makeText(getApplicationContext(), "Number: " + age+" is Successfully Inserted!", Toast.LENGTH_SHORT).show();

    }
}
