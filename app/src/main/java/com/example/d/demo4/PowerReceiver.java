package com.example.d.demo4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class PowerReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        if (intent.getAction() == Intent.ACTION_POWER_CONNECTED) {
            Toast.makeText(context, " Power is Connected.", Toast.LENGTH_LONG).show();
        } else if (intent.getAction() == Intent.ACTION_POWER_DISCONNECTED) {
            Toast.makeText(context, " Power is Dis-connected.", Toast.LENGTH_LONG).show();
        }

    }
}