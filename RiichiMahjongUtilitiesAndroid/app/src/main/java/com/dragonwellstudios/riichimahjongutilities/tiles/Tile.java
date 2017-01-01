package com.dragonwellstudios.riichimahjongutilities.tiles;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by lukepowell on 1/1/17.
 *
 * An individual tile
 */
public final class Tile {
    /**
     * Simply holds the various types of tiles
     */
    public final static class Type{
        @Retention(RetentionPolicy.SOURCE)
        @IntDef({SOUZU, PINZU, MANZU, JIHAI, SAGENPAI, KAZEHAI})
        public @interface TileType {}
        public static final int SOUZU = 1;
        public static final int PINZU = 2;
        public static final int MANZU = 3;
        //Any value >= to this is JIHAI
        public static final int JIHAI = 4;
        public static final int SAGENPAI  = 5;
        public static final int KAZEHAI = 6;
    }

    public static final class InvalidValue extends RuntimeException{

    }

    private @Tile.Type.TileType int suit;
    private int value;

    /**
     * Create a tile
     * @param suit The suit of the tile should be an element of @see Type
     * @param value The value of the tile (1-9 for value tiles, 1-4 of Kazehai and 1-3 for Sagenpai
     */
    public Tile(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(@Type.TileType int suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        int min = 1;
        int max = 9;

        if(suit == Type.SAGENPAI){
            max = 3;
        }else if(suit == Type.KAZEHAI){
            max = 4;
        }

        if(value < min || value > max){
            throw new InvalidValue();
        }

        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tile tile = (Tile) o;

        return suit == tile.suit && value == tile.value;

    }

    @Override
    public int hashCode() {
        int result = suit;
        result = 31 * result + value;
        return result;
    }
}
