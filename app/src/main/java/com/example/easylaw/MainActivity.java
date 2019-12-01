package com.example.easylaw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.database.DatabaseUtils;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.easylaw.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private FragmentManager fragmentManager;
    private FragmentHome fragmentHome;
    private FragmentFind fragmentFind;
    private FragmentSue fragmentSue;
    private FragmentLawer fragmentLawer;
    private ActivityMainBinding activityMainBinding;
    private FragmentTransaction transaction;


    private LinearLayout homeLinear;
    private LinearLayout sueLinear;
    private LinearLayout findLinear;
    private LinearLayout lawerLinear;

    private ImageView homeImg;
    private ImageView sueImg;
    private ImageView findImg;
    private ImageView lawerImg;

    private TextView homeTxt;
    private TextView sueTxt;
    private TextView findTxt;
    private TextView lawerTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();

        fragmentHome = new FragmentHome();
        fragmentFind = new FragmentFind();
        fragmentSue = new FragmentSue();
        fragmentLawer = new FragmentLawer();

        homeLinear = activityMainBinding.btnHome;
        sueLinear = activityMainBinding.btnSue;
        findLinear = activityMainBinding.btnFinder;
        lawerLinear = activityMainBinding.btnLawer;

        homeLinear.setOnClickListener(this);
        sueLinear.setOnClickListener(this);
        findLinear.setOnClickListener(this);
        lawerLinear.setOnClickListener(this);

        homeImg = activityMainBinding.imgHomeHome;
        sueImg = activityMainBinding.imgSueHome;
        findImg = activityMainBinding.imgFindHome;
        lawerImg = activityMainBinding.imgLawerHome;

        homeTxt = activityMainBinding.txtHomeHome;
        sueTxt = activityMainBinding.txtSueHome;
        findTxt = activityMainBinding.txtFindHome;
        lawerTxt = activityMainBinding.txtLawerHome;



        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container,fragmentHome).commitAllowingStateLoss();
    }


    @Override
    public void onClick(View v) {
        transaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.btn_home:
                homeImg.setImageResource(R.drawable.clickhome);
                homeTxt.setTextColor(Color.parseColor("#FDBF40"));
                sueImg.setImageResource(R.drawable.rose);
                sueTxt.setTextColor(Color.parseColor("#919191"));
                findImg.setImageResource(R.drawable.finder);
                findTxt.setTextColor(Color.parseColor("#919191"));
                lawerImg.setImageResource(R.drawable.sue);
                lawerTxt.setTextColor(Color.parseColor("#919191"));
                transaction.replace(R.id.fragment_container, fragmentHome).commitAllowingStateLoss();
                break;
            case R.id.btn_sue:
                homeImg.setImageResource(R.drawable.home);
                homeTxt.setTextColor(Color.parseColor("#919191"));
                sueImg.setImageResource(R.drawable.clickrose);
                sueTxt.setTextColor(Color.parseColor("#FDBF40"));
                findImg.setImageResource(R.drawable.finder);
                findTxt.setTextColor(Color.parseColor("#919191"));
                lawerImg.setImageResource(R.drawable.sue);
                lawerTxt.setTextColor(Color.parseColor("#919191"));
                transaction.replace(R.id.fragment_container, fragmentSue).commitAllowingStateLoss();
                break;
            case R.id.btn_finder:
                homeImg.setImageResource(R.drawable.home);
                homeTxt.setTextColor(Color.parseColor("#919191"));
                sueImg.setImageResource(R.drawable.rose);
                sueTxt.setTextColor(Color.parseColor("#919191"));
                findImg.setImageResource(R.drawable.clickfinder);
                findTxt.setTextColor(Color.parseColor("#FDBF40"));
                lawerImg.setImageResource(R.drawable.sue);
                lawerTxt.setTextColor(Color.parseColor("#919191"));
                transaction.replace(R.id.fragment_container, fragmentFind).commitAllowingStateLoss();
                break;
            case R.id.btn_lawer:
                homeImg.setImageResource(R.drawable.home);
                homeTxt.setTextColor(Color.parseColor("#919191"));
                sueImg.setImageResource(R.drawable.rose);
                sueTxt.setTextColor(Color.parseColor("#919191"));
                findImg.setImageResource(R.drawable.finder);
                findTxt.setTextColor(Color.parseColor("#919191"));
                lawerImg.setImageResource(R.drawable.clicksue);
                lawerTxt.setTextColor(Color.parseColor("#FDBF40"));
                transaction.replace(R.id.fragment_container, fragmentLawer).commitAllowingStateLoss();
                break;


        }
    }
}
