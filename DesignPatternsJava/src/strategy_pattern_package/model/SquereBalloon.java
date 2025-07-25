package strategy_pattern_package.model;

import strategy_pattern_package.controller.ScoreAlgorithmBase;

public class SquereBalloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
