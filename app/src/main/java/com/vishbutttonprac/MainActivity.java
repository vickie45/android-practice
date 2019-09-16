package com.vishbutttonprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFunc(View view){
        final int info = Log.i("Info", " Hey! you Pressed me!");
        Toast.makeText(getApplicationContext(),"Hey! you Pressed me!",Toast.LENGTH_SHORT).show();
    }
}
/*
* **/