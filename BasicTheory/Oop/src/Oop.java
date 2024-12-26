import java.util.logging.Logger;

public class Oop {

    static final Logger logger = Logger.getLogger(Oop.class.getName());
    static final String DOT_LINES = "---------------------------";

    public void showData() {
        logger.info(DOT_LINES);
        logger.info("---Object-Oriented Programming (OOP)---");
        logger.info(DOT_LINES);
    }

    public static void main(String[] args) {
        Oop oop = new Oop();
        oop.showData();
    }
}
