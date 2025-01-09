package exceptions;

public class Arithmetic {
    public static int division(int denominator, int numerator){
        if(denominator == 0){
            throw new RuntimeException("division by zero is not supported");
        }

        return numerator / denominator;
    }
}
