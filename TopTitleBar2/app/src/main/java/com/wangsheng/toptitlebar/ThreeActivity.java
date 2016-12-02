package com.wangsheng.toptitlebar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wangsheng.toptitlebar.titlebar.TitleBarHelper;
import com.wangsheng.toptitlebar.titlebar.TopTitleBar;

public class ThreeActivity extends AppCompatActivity {

    private TopTitleBar titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titlebar);

        titleBar = (TopTitleBar) findViewById(R.id.titleBar);

        new TitleBarHelper.Builder(ThreeActivity.this,titleBar).setImmersive(false,false).setTitle("非沉浸状态栏").setBackgroundColr(R.color.bar_color).setLeftVisible(true).build();
    }
}
