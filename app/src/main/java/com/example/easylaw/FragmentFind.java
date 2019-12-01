package com.example.easylaw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.easylaw.databinding.FragmentFindBinding;

public class FragmentFind extends Fragment {

    FragmentFindBinding fragmentFindBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentFindBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_find,container,false);

        return fragmentFindBinding.getRoot();
    }
}
