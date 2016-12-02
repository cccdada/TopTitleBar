package com.wangsheng.toptitlebar.titlebar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * @author wangsheng
 *
 * TopTitleBar的辅助类 建造者模式
 * 用法例如：new TitleBarHelper.Builder(mActivity, topTitleBar)
 *              .setImmersive(true,true,R.color.colorPrimary)
 *              .setLeftVisible(false)
 *              .setDividerVisible(false)
 *              .setBackgroundColr(R.color.color_6b7072)
 *              .build();
 * 说明：当然一个应用中有很多类似功能、类似属性的标题头，你可以在这个上面再写几个常用的设置方法，更加方便
 */
public class TitleBarHelper {

    private TopTitleBar mTopTitleBar;

    public TitleBarHelper() {

    }

    public TitleBarHelper(Builder builder){
        this.mTopTitleBar = builder.mTopTitleBar;
    }

    public static class Builder {

        private TopTitleBar mTopTitleBar;

        public Builder(Context context, TopTitleBar topTitleBar) {
            this.mTopTitleBar = topTitleBar;
            mTopTitleBar.setContext(context);
        }

        public Builder setLeftVisible(boolean flag){
            mTopTitleBar.setLeftVisible(flag);
            return this;
        }

        public Builder setLeftText(String str){
            mTopTitleBar.setLeftText(str);
            return this;
        }

        public Builder setLeftText(int resId){
            mTopTitleBar.setLeft(resId);
            return this;
        }

        public Builder setLeftTextColor(int resId){
            mTopTitleBar.setLeftTextColor(resId);
            return this;
        }

        public Builder setLeftTextColor(boolean flag){
            mTopTitleBar.setLeftVisible(flag);
            return this;
        }

        public Builder setLeftTextSize(float size){
            mTopTitleBar.setLeftTextSize(size);
            return this;
        }

        public Builder setLeftTextPadding(int left,int top,int right,int bottom){
            mTopTitleBar.setLeftTextPadding(left,top,right,bottom);
            return this;
        }

        public Builder setLeftImageResource(int resId){
            mTopTitleBar.setLeftImageResource(resId);
            return this;
        }

        public Builder setLeftClickListener(View.OnClickListener listener){
            mTopTitleBar.setLeftClickListener(listener);
            return this;
        }

        public Builder setCenterViewVisible(int flag){
            mTopTitleBar.setCenterViewVisible(flag);
            return this;
        }

        public Builder setCenterClickListener(View.OnClickListener listener){
            mTopTitleBar.setCenterClickListener(listener);
            return this;
        }

        /**
         * 设置头部中间标题布局
         * @param view
         * @return
         */
        public Builder setCustomTitleView(View view){
            mTopTitleBar.setCustomTitleView(view);
            return this;
        }

        /**
         * 设置填充布局 该方法会整个填充原本的标题布局
         * @param view
         * @return
         */
        public Builder setContentLayout(View view){
            mTopTitleBar.setContentLayout(view);
            return this;
        }

        /**
         * 设置分割线 drawable
         * @param resId
         * @return
         */
        public Builder setDivider(int resId){
            mTopTitleBar.setDivider(resId);
            return this;
        }

        /**
         * 设置分割线 color
         * @param color
         * @return
         */
        public Builder setDividerColor(int color){
            mTopTitleBar.setDividerColor(color);
            return this;
        }

        public Builder setDividerHeight(int height){
            mTopTitleBar.setDividerHeight(height);
            return this;
        }

        public Builder setDividerVisible(boolean visible){
            mTopTitleBar.setDividerVisible(visible);
            return this;
        }

        /**
         * 设置topbar高度
         * @param height
         * @return
         */
        public Builder setHeight(int height){
            mTopTitleBar.setHeight(height);
            return this;
        }

        /**
         * 是否内容居中
         * @param flag
         * @return
         */
        public Builder setIsCenterAlways(boolean flag){
            mTopTitleBar.setIsCenterAlways(flag);
            return this;
        }

        public Builder setMainTitleBackground(int resId){
            mTopTitleBar.setMainTitleBackground(resId);
            return this;
        }

        public Builder setMainTitleColor(int color){
            mTopTitleBar.setMainTitleColor(color);
            return this;
        }

        public Builder setMainTitleSize(float size){
            mTopTitleBar.setMainTitleSize(size);
            return this;
        }

        public Builder setMainTitleVisible(boolean visible){
            mTopTitleBar.setMainTitleVisible(visible);
            return this;
        }

        public Builder setRightImage(Drawable drawable){
            mTopTitleBar.setRightImage(drawable);
            return this;
        }

        public Builder setRightImage(int index,Drawable drawable){
            mTopTitleBar.setRightImage(index,drawable);
            return this;
        }

        /**
         * 设置副标题
         * @param resId
         * @return
         */
        public Builder setSubTitleBackground(int resId){
            mTopTitleBar.setSubTitleBackground(resId);
            return this;
        }

        public Builder setSubTitleColor(int color){
            mTopTitleBar.setSubTitleColor(color);
            return this;
        }

        public Builder setSubTitleSize(float size){
            mTopTitleBar.setSubTitleSize(size);
            return this;
        }

        public Builder setSubTitleVisible(boolean visible){
            mTopTitleBar.setSubTitleVisible(visible);
            return this;
        }

        public Builder setTitle(CharSequence charSequence){
            mTopTitleBar.setTitle(charSequence);
            return this;
        }

        public Builder setTitle(int resId){
            mTopTitleBar.setTitle(resId);
            return this;
        }

        public Builder setTitle(CharSequence title, boolean need){
            mTopTitleBar.setTitle(title,need);
            return this;
        }

        /**
         * 添加右边的menu
         * @param action
         * @return
         */
        public Builder addAction(TopTitleBar.Action action){
            mTopTitleBar.addAction(action);
            return this;
        }

        /**
         * 添加右边的menu 位置
         * @param action
         * @return
         */
        public Builder addAction(TopTitleBar.Action action, int index){
            mTopTitleBar.addAction(action,index);
            return this;
        }

        public Builder addActions(TopTitleBar.ActionList action){
            mTopTitleBar.addActions(action);
            return this;
        }

        /**
         * 设置背景图片 也可以在xml中设置 可以配合{@link #setImmersive(boolean, boolean, int...)}达到图片沉浸效果
         * @param resId
         * @return
         */
        public Builder setBackgroundImageResource(int resId){
            mTopTitleBar.setBackgroundImageResource(resId);
            return this;
        }

        /**
         * 设置背景为颜色 可以配合{@link #setImmersive(boolean, boolean, int...)}达到颜色沉浸效果
         * @param resId
         * @return
         */
        public Builder setBackgroundColr(int resId){
            mTopTitleBar.setBackgroundColr(resId);
            return this;
        }

        //vis==true表示开启沉浸状态栏,isColor==true表示状态栏是第三个参数指定的颜色，color可以是int值也可以是in[]也可以不传
        //简单来说前面的属性约束后面的属性
        public Builder setImmersive(boolean vis,boolean isColor,int... color){
            if (isColor && color!=null && color.length>0) {
                mTopTitleBar.setImmersive(vis,isColor,color[0]);
            }else{
                mTopTitleBar.setImmersive(vis,false,-1);
            }
            return this;
        }

        public TitleBarHelper build(){
            return new TitleBarHelper(this);
        }
    }
}
