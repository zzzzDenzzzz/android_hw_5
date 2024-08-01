package com.example.android_hw_5;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonList = findViewById(R.id.button_list);
        Button buttonProfile = findViewById(R.id.button_profile);

        buttonList.setOnClickListener(v -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new ListFragment())
                .commit());

        buttonProfile.setOnClickListener(v -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new ProfileFragment())
                .commit());

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new ListFragment())
                    .commit();
        }
    }
}
