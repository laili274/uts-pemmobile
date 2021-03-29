package com.example.yoga;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ActionBar actionBar = getSupportActionBar();
        ImageView imageView = findViewById(R.id.imageView);
        TextView mDetailTv = findViewById(R.id.textView);

        Intent intent = getIntent();
        String mActionBarTitle= intent.getStringExtra("ActionBarTitle");
        String mContent = intent.getStringExtra("contentTv");
        Integer mImg = intent.getIntExtra("imgG",0);

        actionBar.setTitle(mActionBarTitle);
        mDetailTv.setText(mContent);
        imageView.setImageResource(mImg);
    }
}
