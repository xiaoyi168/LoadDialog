package com.example.yideng.loaddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yideng.loaddialoglibrary.LoadDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView= (TextView) findViewById(R.id.id_text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadDialog loadDialog=new LoadDialog(MainActivity.this);
               // loadDialog.ShowText(); //是否显示加载中字体（默认不显示）
                //loadDialog.SetText("努力加载中…");  //自定义字体
                loadDialog.show();

            }
        });

    }
}
