package com.weli.component.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.weli.component.R;

public class FristActivity extends AppCompatActivity {

    //通信方式2类的静态变量存储信息(少量信息的数据通信)
    static boolean isFirst = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        //通信方式1：Intent/bundle;
        commumnication();
    }
    public void commumnication() {

        //首先创建一个bundle对象
        Bundle bd = new Bundle();
        bd.putString("data_string","数据");
        bd.putInt("data_int",10);
        bd.putChar("data_char",'c');
        
        //创建一个Intent对象
        Intent intent = new Intent(FristActivity.this, SecondActivity.class);
        intent.putExtras(bd);
        startActivity(intent);
    }
}
