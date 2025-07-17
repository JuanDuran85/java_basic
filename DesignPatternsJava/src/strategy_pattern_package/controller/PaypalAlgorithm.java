package strategy_pattern_package.controller;

public class PaypalAlgorithm implements Payment {
    private final String email;
    private final String password;

    public PaypalAlgorithm(String emailIn, String passwordIn) {
        this.email = emailIn;
        this.password = passwordIn;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with PayPal");
    }
}
