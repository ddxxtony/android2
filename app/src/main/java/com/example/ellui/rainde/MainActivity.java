package com.example.ellui.rainde;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button btSave;
    private EditText etName;
    private EditText etPosition;
    private EditText etAge;
    private EditText etTurn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSave=(Button) findViewById(R.id.btSave);


    }
}
