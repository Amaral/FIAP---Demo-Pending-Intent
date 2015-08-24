package net.felipeamaral.waterremember;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        remember();
    }

    protected void remember(){
        Intent call	= new Intent(this, WakeUpActivity.class);
        PendingIntent pendingIntent	= PendingIntent.getActivity(this, 1, call, 0);

        AlarmManager alarmManager =	(AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 1000 * 60 * 30, pendingIntent);
    }

}
