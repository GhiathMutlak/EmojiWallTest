package com.giyas.emojiwalltest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.jem.liquidswipe.LiquidSwipeViewPager;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button continue_btn;
    private ImageView iv_close;
    private ImageView background_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        continue_btn=findViewById(R.id.continue_btn);
        iv_close=findViewById(R.id.iv_close);
        background_iv=findViewById(R.id.background_iv);

        continue_btn.setOnClickListener(this);
        iv_close.setOnClickListener(this);

        LiquidSwipeViewPager viewpager=findViewById(R.id.viewpager);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id) {
            case R.id.continue_btn:
                background_iv.setImageResource(R.drawable.ic_emoji_u1f36a);
                break;
            case R.id.iv_close:
                finish();
                break;

    }
    }

}