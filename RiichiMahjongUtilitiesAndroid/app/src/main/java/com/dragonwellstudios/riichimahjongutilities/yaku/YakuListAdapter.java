package com.dragonwellstudios.riichimahjongutilities.yaku;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.dragonwellstudios.riichimahjongutilities.R;
import com.dragonwellstudios.riichimahjongutilities.databinding.YakuListElementBinding;

/**
 * Created by lukepowell on 1/19/17.
 */
public class YakuListAdapter extends RecyclerView.Adapter<YakuViewHolder> {
    @Override
    public YakuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        YakuListElementBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.yaku_list_element, parent, false);
        return new YakuViewHolder(binding);
//        return new YakuViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.yaku_list_element, parent, false));
    }

    @Override
    public void onBindViewHolder(YakuViewHolder holder, int position) {
        holder.bind(Yaku.values()[position]);
    }

    @Override
    public int getItemCount() {
        return Yaku.values().length;
    }
}
