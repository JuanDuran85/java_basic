package BasicTheory.Oop.src;

import java.util.logging.Logger;

public class Oop {

    static final Logger logger = Logger.getLogger(Oop.class.getName());
    static final String DOT_LINES = "---------------------------";
    private int ope1;
    private int ope2;

    // constructor: Oop constructor method, they should be the same name as the
    // class and not return anything

    // Constructor Overloading: means having multiple constructors in the same
    // class, each with a different parameter list. st. The constructors are differentiated
    // by the number and types of their parameters. This allows you to create
    // objects with varying initial states based on what data is available when the
    // object is instantiated.

    public Oop() {
        logger.info(DOT_LINES);
        logger.info("---Constructor Overloading in Java---");
        logger.info(DOT_LINES);
    }

    public Oop(int ope1, int ope2) {
        logger.info(DOT_LINES);
        logger.info("---Constructor in Java---");
        this.ope1 = ope1;
        this.ope2 = ope2;
        logger.info(DOT_LINES);
    }

    public void showData(int valueIn1, int valueIn2) {
        logger.info(DOT_LINES);
        logger.info("---Object-Oriented Programming (OOP)---");
        logger.info(Integer.toString(valueIn1));
        logger.info(Integer.toString(valueIn2));
        logger.info(DOT_LINES);
    }

    public void plusInteger(int valueIn1, int valueIn2) {
        logger.info(DOT_LINES);
        logger.info("---Object-Oriented Programming (OOP)---");
        logger.info(Integer.toString(valueIn1 + valueIn2));
        logger.info(DOT_LINES);
    }

    public static void main(String[] args) {
        Oop oop = new Oop(3, 5);
        System.out.println("Memory Dir: " + oop);
        oop.showData(oop.ope1, oop.ope2);
        oop.plusInteger(oop.ope1, oop.ope2);

        Oop oop2 = new Oop();
        oop2.showData(0, 0);
        oop2.plusInteger(0, 0);
    }
}
