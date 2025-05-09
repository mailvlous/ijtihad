package com.example.ijtihad.onboarding;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class OnboardingAdapter extends FragmentStateAdapter {

    private final List<OnboardingItem> onboardingItems;

    public OnboardingAdapter(@NonNull OnboardingActivity fragmentActivity, List<OnboardingItem> items) {
        super(fragmentActivity);
        this.onboardingItems = items;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return OnboardingFragment.newInstance(onboardingItems.get(position).title);
    }

    @Override
    public int getItemCount() {
        return onboardingItems.size();
    }
}
