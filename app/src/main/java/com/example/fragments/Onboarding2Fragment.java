package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Onboarding2Fragment extends Fragment {

    Button botonNext, botonSkip;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_onboarding2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonNext = view.findViewById(R.id.botonNext);
        botonSkip = view.findViewById(R.id.botonSkip);

        botonNext.setOnClickListener(v ->
                navController.navigate(R.id.action_onboarding2Fragment_to_onboarding3Fragment)
        );

        botonSkip.setOnClickListener(v ->
                navController.navigate(R.id.action_onboarding2Fragment_to_homeFragment)
        );
    }
}
