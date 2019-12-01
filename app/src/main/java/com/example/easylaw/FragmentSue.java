package com.example.easylaw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.easylaw.databinding.FragmentSueBinding;

public class FragmentSue  extends Fragment {

    FragmentSueBinding fragmentSueBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentSueBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_sue,container,false);
        return fragmentSueBinding.getRoot();
    }
}
