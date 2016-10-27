package com.example.andersen.fitnesswithfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button buttonSchedule, buttonTalk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        buttonSchedule = (Button) findViewById(R.id.buttonSchedule);
        buttonSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1  = new Intent();
                intent1.setClass(home.this, schedule.class);
                startActivity(intent1);
                home.this.finish();
            }
        });

        buttonTalk = (Button) findViewById(R.id.buttonTalk);
        buttonTalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.setClass(home.this, talk.class);
                startActivity(intent2);
                home.this.finish();
            }
        });


    }
}
