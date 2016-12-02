package com.wangsheng.toptitlebar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wangsheng.toptitlebar.titlebar.TitleBarHelper;
import com.wangsheng.toptitlebar.titlebar.TopTitleBar;

public class FiveActivity extends AppCompatActivity {

    private TopTitleBar titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titlebar);

        titleBar = (TopTitleBar) findViewById(R.id.titleBar);

        View view = getLayoutInflater().inflate(R.layout.self_titlebar,null);
        new TitleBarHelper.Builder(FiveActivity.this,titleBar).setImmersive(true,false).setBackgroundImageResource(R.drawable.titlebar_imgbg).setContentLayout(view).build();
    }
}
