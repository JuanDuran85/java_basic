package BasicTheory.Operators.src;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Operators {
    
    static final Logger logger = Logger.getLogger(Operators.class.getName());
    static final String DOT_LINES_TH = "---------------------------";
    
    public static void main(String[] args)  {
        
        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Operators in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);
        
        /*
         * Arithmetic Operators: +, -, *, /, %
         * Assignment Operators: =, +=, -=, *=, /=, %=
         * Comparison Operators: ==, !=, >, <, >=, <=
         * Logical Operators: &&, ||, !
         * Unitary Operators: ++, --
         * ternary operator ?:
         */


        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Arithmetic Operators in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        int num1 = 10;
        int num2 = 5;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        logger.log(Level.INFO, "Sum: {0}", sum);
        logger.log(Level.INFO, "Difference: {0}", difference);
        logger.log(Level.INFO, "Product: {0}", product);
        logger.log(Level.INFO, "Quotient: {0}", quotient);
        logger.log(Level.INFO, "Remainder: {0}", remainder);

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Assignment Operators in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        int num3 = 10;
        num3 += 5;
        logger.log(Level.INFO, "num3: {0}", num3);

        int num4 = 10;
        num4 -= 5;
        logger.log(Level.INFO, "num4: {0}", num4);

        int num5 = 10;
        num5 *= 5;
        logger.log(Level.INFO, "num5: {0}", num5);

        int num6 = 10;
        num6 /= 5;
        logger.log(Level.INFO, "num6: {0}", num6);

        int num7 = 10;
        num7 %= 5;
        logger.log(Level.INFO, "num7: {0}", num7);

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Comparison Operators in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        int num8 = 10;
        int num9 = 5;

        boolean isEqual = num8 == num9;
        boolean isNotEqual = num8 != num9;
        boolean isGreaterThan = num8 > num9;
        boolean isLessThan = num8 < num9;
        boolean isGreaterThanOrEqual = num8 >= num9;
        boolean isLessThanOrEqual = num8 <= num9;

        logger.log(Level.INFO, "num8 == num9: {0}", isEqual);
        logger.log(Level.INFO, "num8 != num9: {0}", isNotEqual);
        logger.log(Level.INFO, "num8 > num9: {0}", isGreaterThan);
        logger.log(Level.INFO, "num8 < num9: {0}", isLessThan);
        logger.log(Level.INFO, "num8 >= num9: {0}", isGreaterThanOrEqual);
        logger.log(Level.INFO, "num8 <= num9: {0}", isLessThanOrEqual);

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Logical Operators in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        boolean condition1 = true;
        boolean condition2 = false;

        boolean andResult = condition1 && condition2;
        boolean orResult = condition1 || condition2;
        boolean notResult = !condition1;

        logger.log(Level.INFO, "condition1 && condition2: {0}", andResult);
        logger.log(Level.INFO, "condition1 || condition2: {0}", orResult);
        logger.log(Level.INFO, "!condition1: {0}", notResult);

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Unitary Operators in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        int num10 = 10;
        num10++;
        logger.log(Level.INFO, "num10++: {0}", num10);

        int num11 = 10;
        num11--;
        logger.log(Level.INFO, "num11--: {0}", num11); 

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Ternary Operator in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        int num12 = 10;
        int num13 = 5;

        int result = num12 > num13 ? num12 : num13;

        logger.log(Level.INFO, "num12 > num13 ? num12 : num13: {0}", result);

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Pre and post increment and decrement Operators in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        int num14 = 10;
        int incrementResult = ++num14;
        logger.log(Level.INFO, "Increment result: {0}", incrementResult);

        int num15 = 10;
        int decrementResult = --num15;
        logger.log(Level.INFO, "Decrement result: {0}", decrementResult);

        int num16 = 156;
        int postIncrementResult = num16++;
        logger.log(Level.INFO, "Post Increment result: {0}", postIncrementResult);
        logger.log(Level.INFO, "num16: {0}", num16);

        int num17 = 156;
        int postDecrementResult = num17--;
        logger.log(Level.INFO, "Post Decrement result: {0}", postDecrementResult);
        logger.log(Level.INFO, "num17: {0}", num17);

        logger.log(Level.INFO, DOT_LINES_TH);
    }
}
