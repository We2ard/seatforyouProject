package com.penelope.seatforyou.ui.main.auth.inquireregister;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.penelope.seatforyou.R;
import com.penelope.seatforyou.databinding.FragmentInquireRegisterBinding;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class InquireRegisterFragment extends Fragment {

    private FragmentInquireRegisterBinding binding;
    private InquireRegisterViewModel viewModel;


    public InquireRegisterFragment() {
        super(R.layout.fragment_inquire_register);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding = FragmentInquireRegisterBinding.bind(view);
        viewModel = new ViewModelProvider(this).get(InquireRegisterViewModel.class);

        viewModel.getEvent().observe(getViewLifecycleOwner(), event -> {

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}