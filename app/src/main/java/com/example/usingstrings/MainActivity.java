package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textVMsg2 = findViewById(R.id.TvMsg2);
        textVMsg2.setText("Here I am text message 2");

        Log.i("Lifecycle","OnCreate Called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle","OnStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","OnResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","OnPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","OnStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","OnDestroy Called");
    }

}