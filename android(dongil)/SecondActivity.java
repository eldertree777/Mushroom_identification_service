package com.example.mushroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second");

        Button before, next;
        final ViewFlipper flipper;

        flipper = (ViewFlipper) findViewById(R.id.flipper);
        before = (Button) findViewById(R.id.before);
        next = (Button) findViewById(R.id.next);


        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipper.showPrevious();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipper.showPrevious(); before.setVisibility(View.VISIBLE);
            }
        });
    }
}