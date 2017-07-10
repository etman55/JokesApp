package com.example.android.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);
        TextView jokeTxt = (TextView) findViewById(R.id.joke_txt);
        String joke = getIntent().getStringExtra("JOKE");
        if (joke != null)
            jokeTxt.setText(joke);
        else
            jokeTxt.setText("No jokes here!");
    }
}
