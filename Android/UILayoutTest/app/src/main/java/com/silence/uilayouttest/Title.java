package com.silence.uilayouttest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by silence on 2017/4/22.
 */

public class Title extends LinearLayout  {
    private static final String TAG = "Title";
    public Title(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this) ;

        Button back = (Button)findViewById(R.id.back) ;
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"返回") ;
            }
        });

        Button edit = (Button)findViewById(R.id.edit) ;
        edit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"编辑") ;
            }
        });
    }
}
