package com.example.yideng.loaddialoglibrary;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;


/**
 * Created by ming on 2016/8/18.
 *加载对话框和
 *
 */
public class LmiotDialog {

    private static LoadDialog loadingDialog;

    public static void show(Context context){
        try{
            if(loadingDialog!=null){
                loadingDialog=null;
            }
            loadingDialog = new LoadDialog(context);
            loadingDialog.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void show(Context context,String msg){
        try {
            if(loadingDialog!=null){
                loadingDialog=null;
            }
            loadingDialog = new LoadDialog(context);
            loadingDialog.SetText(msg);
            loadingDialog.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void hidden(){
        try {

            if(loadingDialog!=null){
                loadingDialog.dismiss();
                loadingDialog.setTextViewNull();
                loadingDialog=null;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }




}
