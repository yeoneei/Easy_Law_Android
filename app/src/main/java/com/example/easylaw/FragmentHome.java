package com.example.easylaw;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.load.engine.Resource;
import com.example.easylaw.adapter.ItemLawerAdapter;
import com.example.easylaw.databinding.FragmentHomeBinding;
import com.example.easylaw.item.Lawer;

import java.util.ArrayList;

public class FragmentHome extends Fragment {


    FragmentHomeBinding fragmentHomeBinding;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    ArrayList<Lawer> mData;
    ItemLawerAdapter itemLawerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentHomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false);
        recyclerView = fragmentHomeBinding.rcyLawerHome;
        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        Uri uri = Uri.parse("android.resource://"+ getContext().getPackageName() +"/drawable/lawer");
        mData = new ArrayList<>();
        mData.add(new Lawer(uri.toString(),"[ 상속/이혼/부동산 ]","조연희 변호사","010-5496-3786"));
        mData.add(new Lawer(uri.toString(),"[ 상속/이혼/부동산 ]","조연희 변호사","010-5496-3786"));
        mData.add(new Lawer(uri.toString(),"[ 상속/이혼/부동산 ]","조연희 변호사","010-5496-3786"));
        mData.add(new Lawer(uri.toString(),"[ 상속/이혼/부동산 ]","조연희 변호사","010-5496-3786"));
        mData.add(new Lawer(uri.toString(),"[ 상속/이혼/부동산 ]","조연희 변호사","010-5496-3786"));
        mData.add(new Lawer(uri.toString(),"[ 상속/이혼/부동산 ]","조연희 변호사","010-5496-3786"));

        recyclerView.setLayoutManager(linearLayoutManager);
        itemLawerAdapter = new ItemLawerAdapter(mData, getContext());
        recyclerView.setAdapter(itemLawerAdapter);


        return fragmentHomeBinding.getRoot();
    }
}
