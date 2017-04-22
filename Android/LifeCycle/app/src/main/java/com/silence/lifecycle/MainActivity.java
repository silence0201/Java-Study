package com.silence.lifecycle;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate") ;
        if(savedInstanceState != null) {
            String tempData = savedInstanceState.getString("data") ;
            Log.d(TAG,tempData) ;
        }

        Button normalBtn = (Button)findViewById(R.id.button_normal) ;
        Button diglog = (Button)findViewById(R.id.button_dialog) ;
        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class) ;
                startActivity(intent);
            }
        });

        diglog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class) ;
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart") ;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume") ;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause") ;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop") ;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy") ;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "Some Info" ;
        outState.putString("data",tempData);
    }
}
