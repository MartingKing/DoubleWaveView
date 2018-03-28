package com.onething.balltest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2018/3/28.
 */

public class DoubleSplitTextActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_split);
        final int yellowDark = getResources().getColor(R.color.yellow_dark);
        final int yellowLight = getResources().getColor(R.color.yellow_light);
        WaveProgressTest waveView = (WaveProgressTest) findViewById(R.id.waterView);
        waveView.setWaveColor(yellowDark, yellowLight);
    }
}
