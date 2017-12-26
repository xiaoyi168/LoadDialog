package com.example.yideng.loaddialoglibrary;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 进度条对话框
 * Created by Administrator on 2017/5/23 0023.
 */


public class LoadDialog extends Dialog{


    private static   TextView mTextView;

    public LoadDialog(@NonNull Context context) {
        super(context,R.style.LoadDialogStyle);
        setContentView(R.layout.dialog);
        mTextView = (TextView)findViewById(R.id.id_text);


    }

    /**
     * 设置为空，方式内存泄漏
     */
    public static void setTextViewNull(){
        mTextView=null;
    }



    public static void SetText(String msg) {
        mTextView.setVisibility(View.VISIBLE);
        mTextView.setText(msg);
    }
    public static void ShowText() {
        mTextView.setVisibility(View.VISIBLE);
    }

    private void Rotate(ImageView img) {
        RotateAnimation rotateAnimation = new RotateAnimation(0f, -360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setInterpolator(new LinearInterpolator());//不停顿
        rotateAnimation.setRepeatCount(-1);           //重复次数
        img.startAnimation(rotateAnimation); //开启动画
    }


}
