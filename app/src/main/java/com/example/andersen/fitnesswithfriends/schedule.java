package com.example.andersen.fitnesswithfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class schedule extends AppCompatActivity {
    private Button buttonHome,buttonTalk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(schedule.this, home.class);
                startActivity(intent);
                schedule.this.finish();
            }
        });

        buttonTalk = (Button) findViewById(R.id.buttonTalk);
        buttonTalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.setClass(schedule.this, talk.class);
                startActivity(intent2);
                schedule.this.finish();
            }
        });
    }
}
