package com.example.rmontoya.viewexperiment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class GroupViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_mode);

        LinearLayout firstLayout = (LinearLayout) findViewById(R.id.first_layout);
        firstLayout.setClickable(true);
        firstLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GroupViewActivity.this, "click Event!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}