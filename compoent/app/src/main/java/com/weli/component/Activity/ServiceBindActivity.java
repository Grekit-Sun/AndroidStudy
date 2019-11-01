package com.weli.component.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;

import com.weli.component.R;

public class ServiceBindActivity extends AppCompatActivity implements ServiceConnection {

    public MyService1.Binder binder = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_bind);
    }

    @Override
    public void onServiceConnected(ComponentName name, IBinder binder) {
        this.binder = (MyService1.Binder) binder;
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {

    }
}
