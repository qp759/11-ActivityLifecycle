package com.example.a13_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity Flow", "onCreate");


        Button nextPageBtn = (Button) findViewById(R.id.Abutton);

        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this , Main2Activity.class);
                startActivity(intent);
            }
    });
}
    @Override
    protected void onStart(){

        super.onStart();
        Log.d("Activity Flow", "onStart");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Activity Flow", "onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Activity Flow", "onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Activity Flow", "onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Activity Flow", "onStop");

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Activity Flow", "onDestroy");

    }
}
