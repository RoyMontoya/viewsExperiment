package com.example.rmontoya.viewexperiment;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GroupViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.group_activity_views);


        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout firstLayout = createLinearLayout("TextView 1", "#222222");
        LinearLayout secondLayout = createLinearLayout("TextView 2", "#000FFF");
        LinearLayout thirdLayout = createLinearLayout("TextView 3", "#00FF00");


        // add views to our base layout
        baseLayout.addView(firstLayout);
        baseLayout.addView(secondLayout);
        baseLayout.addView(thirdLayout);

        firstLayout.setClickable(true);
        firstLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GroupViewActivity.this, "click Event", Toast.LENGTH_SHORT).show();
            }
        });

        setContentView(baseLayout);
    }

    private LinearLayout createLinearLayout(String textToDisplay, String colorBackground) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        linearLayout.setLayoutParams(lp);
        linearLayout.setMinimumHeight(getInDpi(100));
        linearLayout.setGravity(View.TEXT_ALIGNMENT_CENTER);
        linearLayout.setBackgroundColor(Color.parseColor(colorBackground));

        TextView textView1 = new TextView(this);
        textView1.setTextColor(Color.parseColor("#FFFFFF"));
        textView1.setText(textToDisplay);

        linearLayout.addView(textView1);
        return linearLayout;
    }

    private int getInDpi(int n) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, n, getResources().getDisplayMetrics());
    }
}
