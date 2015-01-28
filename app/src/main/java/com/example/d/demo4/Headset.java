package com.example.d.demo4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by D on 1/28/2015.
 */
public class Headset extends BroadcastReceiver {
    private static final String TAG = "MainActivity";
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_HEADSET_PLUG)) {
            int state = intent.getIntExtra("state", -1);
            switch (state) {
                case 0:
                    Toast.makeText(context, "Headset is unplugged", Toast.LENGTH_LONG).show();
                    break;
                case 1:
                    Toast.makeText(context, "Headset is plugged.", Toast.LENGTH_LONG).show();
                    break;
                default:
                    Toast.makeText(context, "I have no idea what the headset state is", Toast.LENGTH_LONG).show();

            }
        }
    }
}