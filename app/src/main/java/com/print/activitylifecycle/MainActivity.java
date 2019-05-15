package com.print.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.crashlytics.android.Crashlytics;

import java.util.function.LongToDoubleFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("onCreate is","executed");

        Crashlytics.getInstance().crash();
        Crashlytics.log("line 26");
        Crashlytics.getInstance().getIdentifier();


        Object object = null;
        Log.e("objectIs",object.toString());

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ActivityMain.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("onStart is","executed");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("onResume is","executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e("onRestart is","executed");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("onStop is","executed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("onPause is","executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("onDestroy is","executed");
    }
}
