package com.silence.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this,"你点击了Button",Toast.LENGTH_SHORT).show(); ;
            }
        });

        Button button2 = (Button)findViewById(R.id.button_2) ;
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this,"点击了添加",Toast.LENGTH_SHORT).show(); ;
                break;
            case R.id.remove_item:
                Toast.makeText(this,"点击了删除",Toast.LENGTH_SHORT).show(); ;
                break;
            default:
        }
        return true ;
    }
}
