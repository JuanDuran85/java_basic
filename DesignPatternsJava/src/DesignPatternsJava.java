import strategy_pattern_package.controller.ScoreBoard;
import strategy_pattern_package.model.Balloon;
import strategy_pattern_package.model.Clown;
import strategy_pattern_package.model.SquereBalloon;

public class DesignPatternsJava {

    private static String LINE_SEPARATOR = "----------------------------------------------------------------------";

    public static void main(String[] args) {
        System.out.println("Design Patterns in Java");

        //------------------------------------------------------------
        System.out.println(LINE_SEPARATOR);
        System.out.println(" ------- Strategy Pattern -------");

        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.println("Balloon Tap Score");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(3, 5);

        System.out.println("Clown Tap Score");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(3, 5);

        System.out.println("SquereBalloon Tap Score");
        scoreBoard.algorithmBase = new SquereBalloon();
        scoreBoard.showScore(3, 5);
        System.out.println(LINE_SEPARATOR);
        //------------------------------------------------------------
    }
}