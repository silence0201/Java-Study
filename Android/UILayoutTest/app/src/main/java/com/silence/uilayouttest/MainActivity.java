package com.silence.uilayouttest;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar() ;
        if (actionBar != null) {
            actionBar.hide();
        }

        Button line_V  = (Button)findViewById(R.id.line_v) ;
        Button line_H = (Button)findViewById(R.id.line_h) ;
        Button relative = (Button)findViewById(R.id.relative) ;

        line_H.setOnClickListener(this);
        line_V.setOnClickListener(this);
        relative.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.line_h:
                Intent intentH = new Intent(this,LineHActivity.class) ;
                startActivity(intentH);
                break;
            case R.id.line_v:
                Intent intentV = new Intent(this,LineVActivity.class) ;
                startActivity(intentV);
                break;
            case R.id.relative:
                Intent intentR = new Intent("android.intent.action.REACTIVE") ;
                startActivity(intentR);
                break;
            default:
                break;
        }
    }
}
