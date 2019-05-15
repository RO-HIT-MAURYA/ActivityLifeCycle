package com.print.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.e("onCreate2 is","executed");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("onStart2 is","executed");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("onResume2 is","executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e("onRestart2 is","executed");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("onStop2 is","executed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("onPause2 is","executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("onDestroy2 is","executed");
    }
}
