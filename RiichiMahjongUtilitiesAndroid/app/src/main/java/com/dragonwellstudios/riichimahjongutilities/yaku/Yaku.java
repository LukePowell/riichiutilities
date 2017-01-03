package com.dragonwellstudios.riichimahjongutilities.yaku;

/**
 * Created by lukepowell on 12/22/16.
 */

public final class Yaku {
    private int hanOpen;
    private int hanClosed;
    private boolean closedOnly = true;

    public Yaku(){

    }

    public Yaku(int hanOpen, int hanClosed, boolean closedOnly){
        this.hanOpen = hanOpen;
        this.hanClosed = hanClosed;
        this.closedOnly = closedOnly;
    }
}
