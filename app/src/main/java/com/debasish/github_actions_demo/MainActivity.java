package com.debasish.github_actions_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPrint();
    }

    // printing 0 to 100 numeric numbers
    private void getPrint() {
        for (int i=0;i<=100;i++)
        {
            Log.i("print",""+i);
// The next set of code be added here.
        }
    }
}
