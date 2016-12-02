package com.wangsheng.toptitlebar.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.wangsheng.toptitlebar.R;


/**
 * @author wangsheng
 *
 * @description  关于状态栏工具类
 * @See
 * @usage
 */

public class StatusBarUtil {
    /**
     * 请先明了 此效果在4.4以上起效
     *
     * 是否展示沉浸状态栏 请在onCreate()中调用
     *
     * @param isStatusBarCol true 表示状态栏以颜色填充 false 以图片填充 区别就是状态栏是否透明
     */
    public static void showCJ(Context context, boolean isStatusBarCol, int color) {
        if (-1!=color) {
            SystemBarTintManager tintManager = new SystemBarTintManager((Activity) context);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setNavigationBarTintEnabled(true);
            tintManager.setStatusBarTintResource(context.getResources().getColor(color));
        }
        Window window = ((Activity) context).getWindow();
        if (DeviceUtil.getInstance(context).hasKitKat() && !DeviceUtil.getInstance(context).hasLollipop()) {
            // 透明状态栏
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            // 透明导航栏
            // getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        } else if (DeviceUtil.getInstance(context).hasLollipop()) {
            if (isStatusBarCol) {
                if (-1!=color) {
                    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS |
                            WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
                    window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            // | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                    window.setStatusBarColor(context.getResources().getColor(color));
                }else{
                    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                }
            } else {
                //背景图片的话图片需要设置状态栏透明 会有黑条  这里作色成透明
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS |
                        WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
                window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(Color.TRANSPARENT);

                //window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            }
        }
    }

    public static void showCJ(Context context, boolean isStatusBarCol){
        showCJ(context,isStatusBarCol,-1);
    }

    /** 获取主题色 */
    public int getColorPrimary(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return typedValue.data;
    }

    /** 获取深主题色 */
    public int getDarkColorPrimary(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimaryDark, typedValue, true);
        return typedValue.data;
    }
}
