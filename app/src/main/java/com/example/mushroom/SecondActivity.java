package com.example.mushroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class SecondActivity extends Activity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second");

        Button before, next, finish;
        ViewFlipper flipper;

        flipper = (ViewFlipper) findViewById(R.id.flipper);
        before = (Button) findViewById(R.id.before);
        next = (Button) findViewById(R.id.next);
        finish = (Button) findViewById(R.id.finish);

        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipper.showPrevious();
                count--;
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipper.showNext();
                if (count == 0){
                    before.setVisibility(View.VISIBLE);}
                count++;
                if (count == 22){
                    next.setVisibility(View.GONE);
                    finish.setVisibility(View.VISIBLE);}

            }
        });
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LastActivity.class);
                startActivity(intent);
            }
        });
    }
}