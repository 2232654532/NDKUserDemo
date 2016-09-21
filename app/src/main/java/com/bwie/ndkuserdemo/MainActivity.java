package com.bwie.ndkuserdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    String TAG="tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //调用c库
        String result=new JNI().sayHello();
        Log.e(TAG, "onCreate: "+ result);
        Toast.makeText(this,result,Toast.LENGTH_SHORT).show();
    }
}
