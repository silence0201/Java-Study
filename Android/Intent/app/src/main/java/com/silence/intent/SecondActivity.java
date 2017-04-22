package com.silence.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button back = (Button)findViewById(R.id.button_2) ;
        Intent intent = getIntent() ;
        String data = intent.getStringExtra("Extra_Data") ;
        Log.d("Second",data) ;
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent backIntent = new Intent(SecondActivity.this,FirstActivity.class);
//                startActivity(backIntent);
                Intent intent = new Intent() ;
                intent.putExtra("Ex","Hello,First") ;
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
