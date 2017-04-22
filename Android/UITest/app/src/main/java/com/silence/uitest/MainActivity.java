package com.silence.uitest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MainActivity";

    private EditText editView ;
    private ImageView imageView ;
    private ProgressBar progressBar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button) ;
        Button hide = (Button)findViewById(R.id.hide) ;
        Button add = (Button)findViewById(R.id.add) ;
        Button alert = (Button)findViewById(R.id.alert) ;
        Button progressDig = (Button)findViewById(R.id.progress) ;

        editView = (EditText) findViewById(R.id.editView) ;
        imageView = (ImageView)findViewById(R.id.imageView) ;
        progressBar = (ProgressBar)findViewById(R.id.progress_bar) ;
        imageView.setOnClickListener(this);

        button.setOnClickListener(this);
        hide.setOnClickListener(this);
        add.setOnClickListener(this);
        alert.setOnClickListener(this);
        progressDig.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG,"点击了"+ view.getId()) ;
        switch (view.getId()) {
            case R.id.button:

                String inputView = editView.getText().toString() ;
                Toast.makeText(this,inputView,Toast.LENGTH_SHORT).show();
                break;
            case R.id.hide:
                if (progressBar.getVisibility() == View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }else{
                    progressBar.setVisibility(View.GONE);
                }
                break;
            case R.id.add:
                int progress =  progressBar.getProgress() ;
                progress = progress + 10 ;
                progressBar.setProgress(progress);
                break;
            case R.id.alert:
                AlertDialog.Builder dialog = new AlertDialog.Builder(this) ;
                dialog.setTitle("我是标题") ;
                dialog.setMessage("我是详细信息") ;
                dialog.setCancelable(false) ;
                dialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d(TAG,"点击了确认按钮") ;
                    }
                }) ;
                dialog.show() ;
                break;
            case R.id.progress:
                ProgressDialog progsress = new ProgressDialog(this) ;
                progsress.setTitle("我是标题");
                progsress.setMessage("我是内容");
                progsress.show();
                break;
            case R.id.imageView:
                imageView.setImageResource(R.drawable.img_2);
                break;
            default:
        }
    }
}
