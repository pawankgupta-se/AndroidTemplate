package com.example.pawan.androidtemplate.features;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pawan.androidtemplate.BaseFragment;
import com.example.pawan.androidtemplate.R;

public class StyleSheetFragment extends BaseFragment<HomeViewModel> {
    public static StyleSheetFragment newInstance(){
        return new StyleSheetFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_stylesheet,container,false);
    }
}

