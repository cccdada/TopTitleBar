package com.wangsheng.toptitlebar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

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
        //沉浸式－颜色
        if (flag==1) {
            new TitleBarHelper.Builder(OneActivity.this,titleBar).setImmersive(true,true,R.color.bar_color).setTitle("沉浸式状态栏-颜色").setBackgroundColr(R.color.bar_color).setLeftVisible(true).build();
        }
        else if(flag==2){//沉浸式－全透明
            new TitleBarHelper.Builder(OneActivity.this,titleBar).setImmersive(true,true,R.color.transparent).setTitle("沉浸式状态栏-全透明").setMainTitleColor(R.color.title_color).setBackgroundColr(R.color.transparent).setLeftVisible(true).build();
        }
        else if(flag==3){//沉浸式状态栏-背景
            new TitleBarHelper.Builder(OneActivity.this,titleBar).setImmersive(true,false).setTitle("沉浸式状态栏-背景").setBackgroundImageResource(R.drawable.titlebar_imgbg).setLeftVisible(true).build();
        }
        else if(flag==4){//沉浸式状态栏-非沉浸
            new TitleBarHelper.Builder(OneActivity.this,titleBar).setImmersive(false,false).setTitle("非沉浸状态栏").setBackgroundColr(R.color.bar_color).setLeftVisible(true).build();
        }
        else if(flag==5){//沉浸式状态栏-沉浸状态栏－右方添加按钮
            TopTitleBar.TextAction textAction = new TopTitleBar.TextAction("MENU",R.color.title_color);
            TopTitleBar.ImageAction imageAction = new TopTitleBar.ImageAction(android.R.drawable.ic_menu_call);
            TopTitleBar.ActionList actionList = new TopTitleBar.ActionList();
            actionList.add(imageAction);
            actionList.add(textAction);
            new TitleBarHelper.Builder(OneActivity.this,titleBar).setImmersive(true,true,R.color.bar_color).setTitle("沉浸状态栏－右方添加按钮").setBackgroundColr(R.color.bar_color).addActions(actionList).setLeftVisible(true).build();
            titleBar.getViewByAction(textAction).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(OneActivity.this,"MENU",Toast.LENGTH_SHORT).show();
                }
            });
            titleBar.getViewByAction(imageAction).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(OneActivity.this,"电话",Toast.LENGTH_SHORT).show();
                }
            });
        }
        else if(flag==6){//沉浸式状态栏-自定义布局
            View view = getLayoutInflater().inflate(R.layout.self_titlebar,null);
            new TitleBarHelper.Builder(OneActivity.this,titleBar).setImmersive(true,false).setBackgroundImageResource(R.drawable.titlebar_imgbg).setContentLayout(view).build();
        }
        else if(flag==7){//沉浸式状态栏-

        }
    }
}
