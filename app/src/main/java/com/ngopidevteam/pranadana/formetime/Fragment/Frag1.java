package com.ngopidevteam.pranadana.formetime.Fragment;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.ngopidevteam.pranadana.formetime.AmbilJam;
import com.ngopidevteam.pranadana.formetime.R;

import java.text.DateFormat;
import java.util.Calendar;

public class Frag1 extends Fragment implements TimePickerDialog.OnTimeSetListener {

    public TextView textAlarm;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.layout_frag1, container, false);

        textAlarm = (TextView) v.findViewById(R.id.text_alarm);
        Button btnAlarm = (Button) v.findViewById(R.id.btn_alarm);
        Button btnCancel = (Button) v.findViewById(R.id.btn_cancel);


//        textAlarm.setText(a);

        btnAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                DialogFragment timePicker = new TimePickerFragment();
//                timePicker.show(getFragmentManager(), "Time Picker");
                Intent i = new Intent(getActivity(), AmbilJam.class);
                startActivity(i);
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelAlarm();
            }
        });

        return v;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, hourOfDay);
        c.set(Calendar.MINUTE, minute);
        c.set(Calendar.SECOND, 0);

        updateTimeText(c);
        startAlarm(c);
    }

    private void updateTimeText(Calendar c){
        String timeText = "Alarm set for : ";
        timeText += DateFormat.getTimeInstance(DateFormat.SHORT).format(c.getTime());

        textAlarm.setText(timeText);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private void startAlarm(Calendar c){

    }

    private void cancelAlarm(){

    }
}
