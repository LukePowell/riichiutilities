package com.dragonwellstudios.riichimahjongutilities.score;

/**
 * Created by lukepowell on 1/1/17.
 * <p>
 * Convert a han/fu score into end score
 */
public class ScoreTable {
    private boolean unlimited;

    public final static int MANGAN_BASE_POINTS = 2000;
    public final static int HANEMAN_BASE_POINTS = 3000;
    public final static int BAIMAN_BASE_POINTS = 4000;
    public final static int SANBAIMAN_BASE_POINTS = 6000;
    public final static int YAKUMAN_BASE_POINTS = 8000;

    public ScoreTable(boolean unlimited) {
        this.unlimited = unlimited;
    }

    public ScoreTable() {
        this(false);
    }

    /**
     * Represents a score
     */
    public final class Score {
        private boolean dealer;
        private int nonDealerPayoutTsumo;
        private int dealerPayoutTsumo;
        private int ronPayout;

        public boolean isDealer() {
            return dealer;
        }

        public int getNonDealerPayoutTsumo() {
            return nonDealerPayoutTsumo;
        }

        public int getDealerPayoutTsumo() {
            return dealerPayoutTsumo;
        }

        public int getRonPayout() {
            return ronPayout;
        }

        public Score(boolean dealer, int nonDealerPayoutTsumo, int dealerPayoutTsumo, int ronPayout) {
            this.dealer = dealer;
            this.nonDealerPayoutTsumo = nonDealerPayoutTsumo;
            this.dealerPayoutTsumo = dealerPayoutTsumo;
            this.ronPayout = ronPayout;
        }
    }

    public Score lookupScore(int han, int fu, boolean dealer) {
        //Round up for any fu besides chiitoitsu
        if (fu != 25) {
            fu = (int) (Math.ceil(fu / 10.0f) * 10);
        }

        int basePoints;
        switch (han) {
            case 1:
            case 2:
            case 3:
            case 4:
                //Standard equation to calculate base points
                basePoints = (fu * (int) Math.pow(2, 2 + han));
                basePoints = Math.min(basePoints, MANGAN_BASE_POINTS);
                break;
            case 5:
                basePoints = MANGAN_BASE_POINTS;
                break;
            case 6:
            case 7:
                basePoints = HANEMAN_BASE_POINTS;
                break;
            case 8:
            case 9:
            case 10:
                basePoints = BAIMAN_BASE_POINTS;
                break;
            case 11:
            case 12:
                basePoints = SANBAIMAN_BASE_POINTS;
                break;
            default:
                basePoints = YAKUMAN_BASE_POINTS;
                break;
        }

        int ronPayout = dealer ? 6 * basePoints : 4 * basePoints;
        int tsumoDealerPayout = dealer ? 0 : 2 * basePoints;
        int tsumoNonDealerPayout = dealer ? 2 * basePoints : basePoints;

        //Round to the nearest 100

        ronPayout = (int) (Math.ceil(ronPayout / 100.0f) * 100.0f);
        tsumoDealerPayout = (int) (Math.ceil(tsumoDealerPayout / 100.0f) * 100.0f);
        tsumoNonDealerPayout = (int) (Math.ceil(tsumoNonDealerPayout / 100.0f) * 100.0f);

        return new Score(dealer, tsumoNonDealerPayout, tsumoDealerPayout, ronPayout);
    }
}
