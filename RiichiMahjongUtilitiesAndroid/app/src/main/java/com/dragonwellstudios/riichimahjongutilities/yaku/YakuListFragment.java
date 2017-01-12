package com.dragonwellstudios.riichimahjongutilities.yaku;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dragonwellstudios.riichimahjongutilities.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class YakuListFragment extends Fragment {


    public YakuListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_yaku_list, container, false);
    }

    public static YakuListFragment newInstance() {
        return new YakuListFragment();
    }
}
