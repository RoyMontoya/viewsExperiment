package com.example.rmontoya.viewexperiment;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ViewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views);


        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout firstLayout = createLinearLayout("TextView 1", "#222222");
        LinearLayout secondLayout = createLinearLayout("TextView 2", "#000FFF");
        LinearLayout thirdLayout = createLinearLayout("TextView 3", "#00FF00");
        LinearLayout fourthLayout = createLinearLayout("TextView 4", "#FF0FFF");
        LinearLayout mehLayout = createLinearLayout("TextView 5", "#000000");

        // add views to our base layout
        baseLayout.addView(firstLayout);
        baseLayout.addView(secondLayout);
        baseLayout.addView(thirdLayout);
        baseLayout.addView(fourthLayout);
        baseLayout.addView(mehLayout);

        firstLayout.setClickable(true);
        firstLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ViewsActivity.this, "El Carlos nos enseño de Activities", Toast.LENGTH_SHORT).show();
            }
        });


        setContentView(baseLayout);
    }


    private LinearLayout createLinearLayout(String textToDisplay, String colorBackground) {
        LinearLayout firstLayout = new LinearLayout(this);
        firstLayout.setOrientation(LinearLayout.VERTICAL);

        // not working Wooo!!! (I tried)
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.gravity = Gravity.CENTER;

        firstLayout.setLayoutParams(lp);
        firstLayout.setGravity(View.TEXT_ALIGNMENT_CENTER);
        firstLayout.setBackgroundColor(Color.parseColor(colorBackground));

        TextView textView1 = new TextView(this);
        textView1.setTextColor(Color.parseColor("#FFFFFF"));
        textView1.setText(textToDisplay);

        firstLayout.addView(textView1);
        return firstLayout;
    }

}
