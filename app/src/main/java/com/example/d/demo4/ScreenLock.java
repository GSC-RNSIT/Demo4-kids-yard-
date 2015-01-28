package com.example.d.demo4;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by D on 1/28/2015.
 */
public class ScreenLock extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        if (intent.getAction() == Intent.ACTION_SCREEN_ON) {
            Toast.makeText(context, " Screen is unlocked.", Toast.LENGTH_LONG).show();

        } else if (intent.getAction() == Intent.ACTION_SCREEN_OFF) {
            Toast.makeText(context, "Screen is locked.", Toast.LENGTH_LONG).show();
        }

    }
}
