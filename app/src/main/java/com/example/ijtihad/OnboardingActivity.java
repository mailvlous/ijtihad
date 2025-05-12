package com.example.ijtihad;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class OnboardingActivity extends AppCompatActivity {
    int currentScreen = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showScreen(currentScreen);
    }

    private void showScreen(int screenNumber) {
        switch (screenNumber) {
            case 1:
                setContentView(R.layout.onboarding_fragment_welcome1);
                MaterialButton next1 = findViewById(R.id.btn_continue);
                next1.setOnClickListener(v -> showScreen(2));
                break;

            case 2:
                setContentView(R.layout.onboarding_fragment_welcome2);
                MaterialButton next2 = findViewById(R.id.btn_continue);
                next2.setOnClickListener(v -> showScreen(3));
                break;

            case 3:
                setContentView(R.layout.onboarding_fragment_welcome3);
                MaterialButton finish = findViewById(R.id.btn_continue);
                finish.setOnClickListener(v -> {
                    // simpan status onboarding selesai
                    startActivity(new Intent(this, MainActivity.class));
                    finish();
                });
                break;
        }
    }
}
