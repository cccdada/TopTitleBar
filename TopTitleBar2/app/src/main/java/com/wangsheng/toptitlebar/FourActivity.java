package com.wangsheng.toptitlebar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.wangsheng.toptitlebar.titlebar.TitleBarHelper;
import com.wangsheng.toptitlebar.titlebar.TopTitleBar;

public class FourActivity extends AppCompatActivity {

    private TopTitleBar titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titlebar);

        titleBar = (TopTitleBar) findViewById(R.id.titleBar);

        TopTitleBar.TextAction textAction = new TopTitleBar.TextAction("MENU",R.color.title_color);
        TopTitleBar.ImageAction imageAction = new TopTitleBar.ImageAction(android.R.drawable.ic_menu_call);
        TopTitleBar.ActionList actionList = new TopTitleBar.ActionList();
        actionList.add(imageAction);
        actionList.add(textAction);
        new TitleBarHelper.Builder(FourActivity.this,titleBar).setImmersive(true,true,R.color.bar_color).setTitle("沉浸状态栏－右方添加按钮").setBackgroundColr(R.color.bar_color).addActions(actionList).setLeftVisible(true).build();
        titleBar.getViewByAction(textAction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FourActivity.this,"MENU",Toast.LENGTH_SHORT).show();
            }
        });
        titleBar.getViewByAction(imageAction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FourActivity.this,"电话",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
