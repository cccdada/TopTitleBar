package com.wangsheng.toptitlebar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wangsheng.toptitlebar.titlebar.TitleBarHelper;
import com.wangsheng.toptitlebar.titlebar.TopTitleBar;

public class TwoActivity extends AppCompatActivity {

    private TopTitleBar titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titlebar);

        titleBar = (TopTitleBar) findViewById(R.id.titleBar);

        new TitleBarHelper.Builder(TwoActivity.this,titleBar).setImmersive(true,false).setTitle("沉浸式状态栏-背景").setBackgroundImageResource(R.drawable.titlebar_imgbg).setLeftVisible(true).build();
    }
}
