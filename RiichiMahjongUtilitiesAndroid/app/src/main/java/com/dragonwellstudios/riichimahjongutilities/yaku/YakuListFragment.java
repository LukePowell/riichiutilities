package com.dragonwellstudios.riichimahjongutilities.yaku;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dragonwellstudios.riichimahjongutilities.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class YakuListFragment extends Fragment {

    @BindView(R.id.yaku_list)
    RecyclerView yakuList;

    public YakuListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_yaku_list, container, false);
        ButterKnife.bind(this, view);
        yakuList = (RecyclerView) view.findViewById(R.id.yaku_list);
        yakuList.setLayoutManager(new LinearLayoutManager(getContext()));
        yakuList.setAdapter(new YakuListAdapter());
        return view;
    }

    public static YakuListFragment newInstance() {
        return new YakuListFragment();
    }
}
