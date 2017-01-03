package com.dragonwellstudios.riichimahjongutilities.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lukepowell on 1/1/17.
 */
public class ScoreTableTest {
    private static final int[] han = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private static final int[] fu = {20, 25, 30, 40, 50, 60, 70, 80, 90, 100, 110};

    @Test
    public void lookupScore() throws Exception {
        ScoreTable scoreTable = new ScoreTable();

        ScoreTable.Score score = scoreTable.lookupScore(1, 30, true);
        assertEquals(500, score.getNonDealerPayoutTsumo());
        assertEquals(1500, score.getRonPayout());

        score = scoreTable.lookupScore(1, 29, true);
        assertEquals(500, score.getNonDealerPayoutTsumo());
        assertEquals(1500, score.getRonPayout());
    }
}