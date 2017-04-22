package com.silence.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String responString = data.getStringExtra("Ex") ;
                    Log.d("First",responString) ;
                }
                break;
            default:

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button intentButton = (Button)findViewById(R.id.button_1) ;
        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class) ;
                intent.putExtra("Extra_Data","你好") ;
//                startActivity(intent);
                startActivityForResult(intent,1);

//                Intent intent = new Intent("android.intent.action.ACTION_START") ;
//                startActivity(intent);

//                Intent intent = new Intent(Intent.ACTION_VIEW) ;
//                intent.setData(Uri.parse("tel://10086")) ;
//                startActivity(intent);
            }
        });



    }
}
