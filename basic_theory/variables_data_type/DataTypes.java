
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataTypes {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DataTypes.class.getName());
        final String DOT_LINES = "---------------------------";

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---Variables in Java---");
        logger.log(Level.INFO, DOT_LINES);

        /*
         *
         * Variable names are case-sensitive. A variable's name can be any legal
         * identifier — an unlimited-length sequence of Unicode letters and digits,
         * beginning with a letter, the dollar sign "$", or the underscore character
         * "_". The convention, however, is to always begin your variable names with a
         * letter, not "$" or "_". Additionally, the dollar sign character, by
         * convention, is never used at all. You may find some situations where
         * auto-generated names will contain the dollar sign, but your variable names
         * should always avoid using it. A similar convention exists for the underscore
         * character; while it's technically legal to begin your variable's name with
         * "_", this practice is discouraged. White space is not permitted.
         *
         * Subsequent characters may be letters, digits, dollar signs, or underscore
         * characters. Conventions (and common sense) apply to this rule as well. When
         * choosing a name for your variables, use full words instead of cryptic
         * abbreviations. Doing so will make your code easier to read and understand. In
         * many cases it will also make your code self-documenting; fields named
         * cadence, speed, and gear, for example, are much more intuitive than
         * abbreviated versions, such as s, c, and g. Also keep in mind that the name
         * you choose must not be a keyword or reserved word.
         *
         * If the name you choose consists of only one word, spell that word in all
         * lowercase letters. If it consists of more than one word, capitalize the first
         * letter of each subsequent word. The names gearRatio and currentGear are prime
         * examples of this convention. If your variable stores a constant value, such
         * as static final int NUM_GEARS = 6, the convention changes slightly,
         * capitalizing every letter and separating subsequent words with the underscore
         * character. By convention, the underscore character is never used elsewhere.
         *
         */

        /*
         * The var keyword allows a variable to be initialized without having to declare its type. The type of the variable depends on the type of the data that is being assigned to it.
         * Where it can be used?
         * You can use var to declare a variable. 
         * You can use var when declaring variable in for loop statement.
         * You can use var with try-with-resources statement.
         * Where it cannot be used?
         * You cannot declare a local variable using var without initialising it or with null value. This is because var needs to know what data type it is assigning to a variable.
         * You cannot use var for declaring instance fields, static fields, declaring a lambda expression, parameters for constructors or methods, method return types and generic types.
         * When you want same type of variable for an object of same inheritance hierarchy, then in that case also, var is not recommended to be used.
         */

         /*
          * Const in Java
          * A final keyword is used to declare a constant variable.
          * A constant variable can't be changed once it's initialized.
          * A constant variable can't be null.
          * A constant variable can't be declared without initializing it.
          * The final keyword is used to prevent a variable from being changed once it's initialized.
          * The final keyword is used to prevent a class from being extended.
          * The final keyword is used to prevent a method from being overridden.
          * The final keyword is used to prevent a variable from being assigned a new value.
          * The final keyword is used to prevent a variable from being referenced.
          * The final keyword is used to prevent a variable from being declared as a local variable
          */


        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---Data Types in Java---");
        logger.log(Level.INFO, DOT_LINES);

        logger.log(Level.INFO, "---Primitive Data Types---");
        /*
         * - Primitive Data Types
         * A primitive data type specifies the type of a variable and the kind of values
         * it can hold.
         * There are eight primitive data types in Java: byte, short, int, long, float,
         * double, char, and boolean.
         *
         */

        long longType = 6546435464346463464L; // The letter 'L' is used to denote a long integer. Default value is 0L
        logger.log(Level.INFO, "longType: {0}", longType);

        float floatType = 3.141592653f; // The letter 'f' is used to denote a float number. Default value is 0.0
        logger.log(Level.INFO, "floatType: {0}", floatType);

        double doubleType = 3.141592653D; // The letter 'D' is used to denote a double number. Default value is 0.0
        logger.log(Level.INFO, "doubleType: {0}", doubleType);

        char charType = 'A'; // A single character enclosed in single quotes. Default value is '\u0000'
        logger.log(Level.INFO, "charType: {0}", charType);

        boolean booleanType = true; // true or false. Default value is false
        logger.log(Level.INFO, "booleanType: {0}", booleanType);

        logger.log(Level.INFO, DOT_LINES);

        /*
         * - Non-Primitive Data Types
         * Non-primitive data types are called reference types because they refer to
         * objects.
         *
         * The main differences between primitive and non-primitive data types are:
         * - Primitive types in Java are predefined and built into the language, while
         * non-primitive types are created by the programmer (except for String).
         * - Non-primitive types can be used to call methods to perform certain
         * operations, whereas primitive types cannot.
         * - Primitive types start with a lowercase letter (like int), while
         * non-primitive types typically starts with an uppercase letter (like String).
         * - Primitive types always hold a value, whereas non-primitive types can be
         * null.
         *
         * Examples of non-primitive types are Strings, Arrays, Classes etc. You will
         * learn more about these in a later chapter.
         *
         */

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---Non-Primitive Data Types---");
        logger.log(Level.INFO, DOT_LINES);

        String stringType = "Hello, World!"; // A string enclosed in double quotes. Default value is null
        logger.log(Level.INFO, "stringType: {0}", stringType);

    }
}