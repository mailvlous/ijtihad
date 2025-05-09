package com.example.ijtihad.onboarding;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.ijtihad.R;

public class OnboardingFragment extends Fragment {

    private static final String ARG_TITLE = "title";

    public static OnboardingFragment newInstance(String title) {
        OnboardingFragment fragment = new OnboardingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_onboarding, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView titleText = view.findViewById(R.id.textTitle);
        Button button = view.findViewById(R.id.buttonContinue);
        String title = getArguments().getString(ARG_TITLE);
        titleText.setText(title);

        button.setOnClickListener(v -> {
            ViewPager2 pager = getActivity().findViewById(R.id.viewPager);
            int nextItem = pager.getCurrentItem() + 1;
            if (nextItem < 4) {
                pager.setCurrentItem(nextItem);
            } else {
                // redirect to main activity
            }
        });
    }
}
