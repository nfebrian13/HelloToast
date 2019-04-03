package com.nana.androidtrainingapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MenuActivity extends AppCompatActivity {

    private Button btnLinear, btnRelative, btnConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnLinear = (Button) findViewById(R.id.btnLinear);
        btnRelative = (Button) findViewById(R.id.btnRelative);
        btnConstraint = (Button) findViewById(R.id.btnConstraint);

        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RelativeActivity.class);
                startActivity(intent);
            }
        });

        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ConstraintActivity.class);
                startActivity(intent);
            }
        });
    }
}
