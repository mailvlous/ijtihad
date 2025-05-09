package com.example.ijtihad.onboarding;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.ijtihad.R;

import java.util.Arrays;
import java.util.List;


public class OnboardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        ViewPager2 viewPager = findViewById(R.id.viewPager);

        List<OnboardingItem> slides = Arrays.asList(
                new OnboardingItem("Ijtihad App"),
                new OnboardingItem("Pelajari Prinsip-Prinsip Ijtihad"),
                new OnboardingItem("Uji Diri Lewat Kuis Interaktif"),
                new OnboardingItem("Hadapi Studi Kasus")
        );

        OnboardingAdapter adapter = new OnboardingAdapter(this, slides);
        viewPager.setAdapter(adapter);
    }
}
