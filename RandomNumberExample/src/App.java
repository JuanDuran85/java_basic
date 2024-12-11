import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    
    static final Logger logger = Logger.getLogger(App.class.getName());
    static final String DOT_LINES_RN = "---------------------------";

    public static void main(String[] args) {
        logger.log(Level.INFO, DOT_LINES_RN);
        logger.log(Level.INFO, "-------- Random Number --------");
        logger.log(Level.INFO, DOT_LINES_RN);

        // Random(): Creates a new random number generator. This constructor sets the seed of the random number generator to a value very likely to be distinct from any other invocation of this constructor.
        var random = new Random();

        // to generate random number between 0 (inclusive) and 10 (exclusive)
        var randomNum = random.nextInt(10);
        logger.log(Level.INFO, "Random number between 0 (inclusive) and 10 (exclusive): {0}", randomNum);

        // to generate random number between 1 (inclusive) and 100 (exclusive)
        randomNum = random.nextInt(100) + 1;
        logger.log(Level.INFO, "Random number between 1 (inclusive) and 100 (exclusive): {0}", randomNum);

        // to generate random number between 0.0 (inclusive) and 1.0 (exclusive)
        var randomFloat = random.nextFloat();
        logger.log(Level.INFO, "Random number between 0.0 (inclusive) and 1.0 (exclusive): {0}", randomFloat);

        // to generate random number between 0.0 (inclusive) and 1.0 (exclusive)
        var randomDouble = random.nextDouble();
        logger.log(Level.INFO, "Random number between 0.0 (inclusive) and 1.0 (exclusive): {0}", randomDouble);

    }
}
