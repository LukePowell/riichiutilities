package com.dragonwellstudios.riichimahjongutilities.score;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lukepowell on 12/20/16.
 */
public class EndGameScoreTest {
    private final int START_SCORE = 25000;
    private final int TARGET_SCORE = 30000;
    final int[] UMA_SPREAD = {20, 10, -10, -20};

    @Test
    public void calculateOka() throws Exception {
        Assert.assertEquals(20000, EndGameScore.calculateOka(25000,30000,4));
    }

    @Test
    public void round() throws Exception {
        Assert.assertEquals(EndGameScore.round(0.5f), 0);
        Assert.assertEquals(EndGameScore.round(0.7f), 1);
    }

    @Test
    public void getEndGameScore() throws Exception {
        //Input
        final int[] basicScores = {25000, 25000, 25000, 25000};
        final int[] realisticScores = {35700, 32400, 22200, 10000};
        //Expected
        final int[] basicEndGameScores = {35, 5, -15, -25};
        final int[] realisticEndGameScores = {46, 12, -18, -40};
        //Test 1 all 25000 points
        final int[] basicOutput = EndGameScore.getEndGameScore(TARGET_SCORE, START_SCORE, 4, basicScores, UMA_SPREAD);
        Assert.assertArrayEquals(basicOutput, basicEndGameScores);

        //Test 2 sorted list of more realistic scores
        final int[] realisticOutput = EndGameScore.getEndGameScore(TARGET_SCORE, START_SCORE, 4, realisticScores, UMA_SPREAD);
        Assert.assertArrayEquals(realisticOutput, realisticEndGameScores);
    }

}