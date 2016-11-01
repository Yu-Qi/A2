package com.example.andersen.fitnesswithfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class scheduleRunDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_run_day);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(scheduleRunDay.this, scheduleRunLevel.class);
                startActivity(intent1);
                scheduleRunDay.this.finish();
            }
        });

        ImageButton buttontwo = (ImageButton) findViewById(R.id.buttontwo);
        buttontwo.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(scheduleRunDay.this, schedule.class);
                startActivity(intent);
                scheduleRunDay.this.finish();
            }
        });

        ImageButton buttonthree = (ImageButton) findViewById(R.id.buttonthree);
        buttonthree.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(scheduleRunDay.this, schedule.class);
                startActivity(intent);
                scheduleRunDay.this.finish();
            }
        });

        ImageButton buttonfour = (ImageButton) findViewById(R.id.buttonfour);
        buttonfour.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(scheduleRunDay.this, schedule.class);
                startActivity(intent);
                scheduleRunDay.this.finish();
            }
        });
    }
}
