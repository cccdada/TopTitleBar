package com.wangsheng.toptitlebar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                startActivity(new Intent(MainActivity.this,OneActivity.class).putExtra("flag",1));
                break;
            case R.id.btn2:
                startActivity(new Intent(MainActivity.this,OneActivity.class).putExtra("flag",2));
                break;
            case R.id.btn3:
                startActivity(new Intent(MainActivity.this,OneActivity.class).putExtra("flag",3));
                break;
            case R.id.btn4:
                startActivity(new Intent(MainActivity.this,OneActivity.class).putExtra("flag",4));
                break;
            case R.id.btn5:
                startActivity(new Intent(MainActivity.this,OneActivity.class).putExtra("flag",5));
                break;
            case R.id.btn6:
                startActivity(new Intent(MainActivity.this,OneActivity.class).putExtra("flag",6));
                break;
        }
    }
}
