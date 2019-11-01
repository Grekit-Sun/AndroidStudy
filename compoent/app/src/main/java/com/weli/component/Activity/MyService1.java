package com.weli.component.Activity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService1 extends Service {

    public String data = "";

    public MyService1() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new Binder();
    }

    public class Binder extends android.os.Binder{

        public void sendData(String data) {
            MyService1.this.data = data;
        }
    }

}
