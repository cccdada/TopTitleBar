package com.wangsheng.toptitlebar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wangsheng.toptitlebar.titlebar.TitleBarHelper;
import com.wangsheng.toptitlebar.titlebar.TopTitleBar;

public class OneActivity extends AppCompatActivity {

    private TopTitleBar titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titlebar);

        titleBar = (TopTitleBar) findViewById(R.id.titleBar);

        Intent intent = getIntent();
        int flag = intent.getIntExtra("flag",1);
        if (flag==1) {
            new TitleBarHelper.Builder(OneActivity.this,titleBar).setImmersive(true,true,R.color.bar_color).setTitle("沉浸式状态栏-颜色").setBackgroundColr(R.color.bar_color).setLeftVisible(true).build();
        }else if(flag==2){
            new TitleBarHelper.Builder(OneActivity.this,titleBar).setImmersive(true,true,R.color.transparent).setTitle("沉浸式状态栏-全透明").setMainTitleColor(R.color.title_color).setBackgroundColr(R.color.transparent).setLeftVisible(true).build();
        }
    }
}
