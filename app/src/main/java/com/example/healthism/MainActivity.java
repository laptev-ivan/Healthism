package com.example.healthism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Typeface;
import android.os.Bundle;

import com.example.healthism.databinding.ActivityMainBinding;

import com.example.healthism.fragments.ChallengesFragment;
import com.example.healthism.fragments.DashboardFragment;
import com.example.healthism.fragments.DiaryFragment;
import com.example.healthism.fragments.NutritionistsFragment;
import com.example.healthism.fragments.ProfileFragment;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.helvetica_regular);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new DashboardFragment());

        binding.bottomNav.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {

                case R.id.dashboard:
                    replaceFragment(new DashboardFragment());
                    break;
                case R.id.nutrients:
                    replaceFragment(new NutritionistsFragment());
                    break;
                case R.id.diary:
                    replaceFragment(new DiaryFragment());
                    break;
                case R.id.challenges:
                    replaceFragment(new ChallengesFragment());
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileFragment());
                    break;
            }

            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}