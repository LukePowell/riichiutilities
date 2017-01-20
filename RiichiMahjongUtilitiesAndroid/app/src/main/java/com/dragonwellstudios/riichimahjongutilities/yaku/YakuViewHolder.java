package com.dragonwellstudios.riichimahjongutilities.yaku;

import android.support.v7.widget.RecyclerView;

import com.dragonwellstudios.riichimahjongutilities.databinding.YakuListElementBinding;

/**
 * Created by lukepowell on 1/19/17.
 */
public class YakuViewHolder extends RecyclerView.ViewHolder {

    private final YakuListElementBinding binding;

    public YakuViewHolder(YakuListElementBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Yaku yaku) {
        this.binding.setYaku(yaku);
    }
}
