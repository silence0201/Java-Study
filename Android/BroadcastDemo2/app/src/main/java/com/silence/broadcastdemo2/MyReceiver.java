package com.silence.broadcastdemo2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"收到了一个自定义的通知",Toast.LENGTH_LONG).show();
    }
}
