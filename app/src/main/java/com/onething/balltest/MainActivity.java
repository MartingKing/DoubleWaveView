package com.onething.balltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WaveProgress waterView;
    private ImageView iv_ball_bg;
    private TextView tv_unit, tv_restflow;
    private Button btn_yellow, btn_red;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int yellowDark = getResources().getColor(R.color.yellow_dark);
        final int yellowLight = getResources().getColor(R.color.yellow_light);

        final int reaDark = getResources().getColor(R.color.red_dark);
        final int reaLight = getResources().getColor(R.color.red_light);

        final int blueDark = getResources().getColor(R.color.blue_dark);
        final int blueLight = getResources().getColor(R.color.blue_light);

        waterView = (WaveProgress) findViewById(R.id.waterView);
        iv_ball_bg = (ImageView) findViewById(R.id.iv_ball_bg);
        tv_unit = (TextView) findViewById(R.id.tv_unit);
        tv_restflow = (TextView) findViewById(R.id.tv_restflow);


        btn_red = (Button) findViewById(R.id.btn_red);
        btn_yellow = (Button) findViewById(R.id.btn_yellow);
        waterView.setMaxValue(100f);
        waterView.setValue(55f);

        findViewById(R.id.btn_blue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waterView.setWaveColor(blueDark, blueLight);
                iv_ball_bg.setBackgroundResource(R.mipmap.blue_ball);
                tv_restflow.setTextColor(getResources().getColor(R.color.blue_tint));
                tv_unit.setTextColor(getResources().getColor(R.color.blue_tint));
            }
        });

        btn_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waterView.setWaveColor(yellowDark, yellowLight);
                iv_ball_bg.setBackgroundResource(R.mipmap.yello_ball);
                tv_restflow.setTextColor(getResources().getColor(R.color.yellow_tint));
                tv_unit.setTextColor(getResources().getColor(R.color.yellow_tint));
            }
        });
        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waterView.setWaveColor(reaDark, reaLight);
                iv_ball_bg.setBackgroundResource(R.mipmap.red_ball);
                tv_restflow.setTextColor(getResources().getColor(R.color.red_tint));
                tv_unit.setTextColor(getResources().getColor(R.color.red_tint));
            }
        });
        findViewById(R.id.btn_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,DoubleSplitTextActivity.class));
            }
        });
    }
}
