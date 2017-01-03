package com.dragonwellstudios.riichimahjongutilities.tiles;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/**
 * Created by lukepowell on 1/1/17.
 */

public final class Collection {
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({SET_COLLECTION, SEQUENCE_COLLECTION, PAIR_COLLECTION, SINGLE_COLLECTION})
    public @interface CollectionType {}

    public static final int SET_COLLECTION = 1;
    public static final int SEQUENCE_COLLECTION = 2;
    public static final int PAIR_COLLECTION = 3;
    public static final int SINGLE_COLLECTION = 4;

    private @Collection.CollectionType int type;
    private ArrayList<Tile> collection;
    //This is one way to handle this, when using the app to find tiles that can complete a hand
    //there are a few special cases that will need to be handled
    private boolean complete;
}
