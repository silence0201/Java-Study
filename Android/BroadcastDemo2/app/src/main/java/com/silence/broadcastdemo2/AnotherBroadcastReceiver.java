package com.silence.broadcastdemo2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AnotherBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"收到了一个广播",Toast.LENGTH_LONG).show();
//        abortBroadcast();  // 阻止广播传播链
    }
}
