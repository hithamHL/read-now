package com.hithamhl.ude.readnoww.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hithamhl.ude.readnoww.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CatagoriesFragment extends Fragment {


    public CatagoriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_catagories, container, false);
    }

}
