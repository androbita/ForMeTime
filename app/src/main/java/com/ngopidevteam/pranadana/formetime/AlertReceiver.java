package com.ngopidevteam.pranadana.formetime;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.app.NotificationCompat;

import java.util.Timer;
import java.util.TimerTask;

public class AlertReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.final_count_down);
        mediaPlayer.start();

        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = (NotificationCompat.Builder) notificationHelper.getChannelNotification("Alarm", "Alarm set" );
        notificationHelper.getManager().notify(1, nb.build());

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                mediaPlayer.stop();
            }
        },20000);
    }
}
