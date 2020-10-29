package com.example.ratingimages;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {

    TextView like_count;
    TextView dislike_count;
    private int like_counter = 0;
    private int dislike_counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLike (View view)
    {
        TextView text1 = (TextView)findViewById(R.id.textView3);
        text1.setText("Вам нравиться");
        TextView like_count = (TextView) findViewById(R.id.textView2);
        like_counter++;
        like_count.setText(String.valueOf(like_counter));
    }
    public void onClickDislike (View view)
    {
        TextView text2 = (TextView)findViewById(R.id.textView3);
        text2.setText("Вам не нравиться");
        TextView dislike_count = (TextView) findViewById(R.id.textView);
        dislike_counter++;
        dislike_count.setText(String.valueOf(dislike_counter));
    }
}
