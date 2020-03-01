package com.example.windowmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        int a = 9;
        Log.e("khoado",a+"");
        if(bundle != null && bundle.getString("LAUNCH").equals("YES")) {
//            startService(new Intent(MainActivity.this, FlyBitch.class));
        }

        Button launch = (Button)findViewById(R.id.button1);
        launch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                startService(new Intent(MainActivity.this, FlyBitch.class));
            }
        });

        Button stop = (Button)findViewById(R.id.button2);
        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                stopService(new Intent(MainActivity.this, FlyBitch.class));
            }
        });
    }

    @Override
    protected void onStop() {
//        stopService(new Intent(MainActivity.this, FlyBitch.class));
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Bundle bundle = getIntent().getExtras();

//        startService(new Intent(MainActivity.this, FlyBitch.class));


        super.onResume();
    }
}
