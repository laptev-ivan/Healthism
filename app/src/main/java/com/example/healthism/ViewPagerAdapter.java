package com.example.healthism;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.healthism.fragments.ChallengesFragment;
import com.example.healthism.fragments.availableChallenges;
import com.example.healthism.fragments.completeChallenges;
import com.example.healthism.fragments.participateChallenges;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull ChallengesFragment fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new availableChallenges();
            case 1:
                return new participateChallenges();
            case 2:
                return new completeChallenges();
            default:
                return new availableChallenges();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
