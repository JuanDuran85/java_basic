package strategy_pattern_package.controller;

public class CreditCardAlgorithm implements Payment {
    private final String name;
    private final String cardNumber;

    public CreditCardAlgorithm(String nameIn, String cardNumberIn) {
        this.name = nameIn;
        this.cardNumber = cardNumberIn;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with Credit Card");
    }
}
