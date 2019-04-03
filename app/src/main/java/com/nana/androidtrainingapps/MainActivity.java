package com.nana.androidtrainingapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button_toast, button_count;
    private TextView show_count;
    private Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_toast = (Button) findViewById(R.id.button_toast);
        button_count = (Button) findViewById(R.id.button_count);
        show_count = (TextView) findViewById(R.id.show_count);

        button_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Button is clicked " + count.toString(), Toast.LENGTH_LONG).show();
            }
        });

        button_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if (count != null) {
                    show_count.setText(count.toString());
                }
            }
        });


    }
}
