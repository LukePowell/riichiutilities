package com.dragonwellstudios.riichimahjongutilities.score;

/**
 * Created by lukepowell on 12/16/16.
 *
 * Calculates the End Game Score (+/-)
 */
public final class EndGameScore {

    /**
     * Using the starting score, target score, and player count calculate the oma to award to the
     * victor
     * @param startScore The starting score
     * @param targetScore The target score
     * @param playerCount The number of players
     * @return The oka to award to the winner of the hanchan
     */
    public static int calculateOka(int startScore, int targetScore, int playerCount){
        return 4 * (targetScore - startScore);
    }

    /**
     * Round a given value to the nearest whole integer, 0.5 rounds down not up.
     * @param input The value to round
     * @return The nearest integer
     */
    public static int round(float input){
        return (int) Math.floor(input + 0.4);
    }

    /**
     * Calculate the End Game Score
     * @param targetScore The target score, usually 30,000
     * @param startScore The start score usually 25,000
     * @param playerCount The number of players usually 50,000
     * @param rawScores The raw scores ordered from 1st to 4th
     * @param umaSpread The uma spread, or null if none, to apply
     * @return The endgame scores summing to 0
     */
    public static int[] getEndGameScore(int targetScore, int startScore, int playerCount, int[] rawScores, int[] umaSpread){
        //1. Raw scores sorted from 1st to 4th are passed in
        //2. Calculate the oka
        int oka = calculateOka(startScore, targetScore, playerCount);
        int[] endGameScore = rawScores.clone();

        //3 substract the target score
        for(int i = 0; i < endGameScore.length; ++i){
            endGameScore[i] -= targetScore;
        }

        //4. Add Oka to winner
        endGameScore[0] += oka;

        //5. Divide by 1000
        //6. Round to the nearest integer rounding down for 0.5
        for(int i = 0; i < endGameScore.length; ++i){
            endGameScore[i] = round(endGameScore[i] / 1000.0f);
        }

        //7. If there is an uma spread apply it
        if(umaSpread != null){
            for(int i = 0; i < 4; ++i) {
                endGameScore[i] += umaSpread[i];
            }
        }

        //8. If the sum does not equal 0 adjust the 1st place players score to make the sum 0
        int sum = 0;
        for (int score : endGameScore) {
            sum += score;
        }

        endGameScore[0] -= sum;

        return endGameScore;
    }
}
