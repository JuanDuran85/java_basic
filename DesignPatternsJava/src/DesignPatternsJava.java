import decorator_patter_package.interfaces.IceCreamI;
import decorator_patter_package.model.BasicIceCreamModel;
import decorator_patter_package.model.ChocolateIceCream;
import decorator_patter_package.model.MintIceCream;
import decorator_patter_package.model.VanillaIceCream;
import observer_pattern_package.interfaces.ObserverI;
import observer_pattern_package.model.EmailTopic;
import observer_pattern_package.model.EmailTopicSubscriber;
import strategy_pattern_package.controller.CreditCardAlgorithm;
import strategy_pattern_package.controller.PaypalAlgorithm;
import strategy_pattern_package.controller.ScoreBoard;
import strategy_pattern_package.controller.ShoppingCart;
import strategy_pattern_package.model.Balloon;
import strategy_pattern_package.model.Clown;
import strategy_pattern_package.model.Product;
import strategy_pattern_package.model.SquereBalloon;

public class DesignPatternsJava {

    private static String LINE_SEPARATOR = "----------------------------------------------------------------------";

    public static void main(String[] args) {
        System.out.println("Design Patterns in Java");
        System.out.println(LINE_SEPARATOR);
        System.out.println(" ------- Strategy Pattern -------");
        System.out.println(LINE_SEPARATOR);
        //------------------------------------------------------------
        strategyExampleOne();
        //------------------------------------------------------------
        //------------------------------------------------------------
        strategyExampleTwo();
        //------------------------------------------------------------

        System.out.println(LINE_SEPARATOR);
        System.out.println(" ------- Observer Pattern -------");
        System.out.println(LINE_SEPARATOR);
        //------------------------------------------------------------
        observerExample();
        //------------------------------------------------------------

        System.out.println(LINE_SEPARATOR);
        System.out.println(" ------- Decorator Pattern -------");
        System.out.println(LINE_SEPARATOR);
        //------------------------------------------------------------
        decoratorExample();
        //------------------------------------------------------------


        System.out.println(LINE_SEPARATOR);
        System.out.println(" ------- Factory Pattern -------");
        System.out.println(LINE_SEPARATOR);
        //------------------------------------------------------------
        factoryExample();
        //------------------------------------------------------------
    }

    private static void strategyExampleOne() {

        System.out.println(" ------- Example One -------");
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
    }

    private static void strategyExampleTwo() {
        System.out.println(" ------- Example Two -------");
        Product pants = new Product(34.45, "3af4hgj55");
        Product shirt = new Product(9.99, "4mfvk83ds");
        Product trainers = new Product(44.99, "7mh65dghy");
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(pants);
        shoppingCart.addProduct(shirt);
        shoppingCart.addProduct(trainers);

        shoppingCart.pay(new PaypalAlgorithm("correo@correo.com", "3455332"));
        shoppingCart.pay(new CreditCardAlgorithm("Name User", "3455667756455332"));
    }

    private static void observerExample() {
        EmailTopic topic = new EmailTopic();

        // creating observers
        ObserverI firstObserver = new EmailTopicSubscriber("FirstObserver");
        ObserverI secondObserver = new EmailTopicSubscriber("SecondObserver");
        ObserverI thirdObserver = new EmailTopicSubscriber("ThirdObserver");

        // registering observers
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        // attaching observers to subject / topic
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        // checking for updates
        firstObserver.update();
        thirdObserver.update();

        // provider / subject (broadcaster)
        topic.postMessage(" - Hello Subscribers! -");

        topic.unregister(firstObserver);
        topic.postMessage(" - Hello Subscribers - second message! -");
    }

    private static void decoratorExample() {
        IceCreamI basicIceCreamModel = new BasicIceCreamModel();
        String costBasic = String.format("%.2f", basicIceCreamModel.cost());
        System.out.println("Cost: %.2f%n" + costBasic);

        IceCreamI vanillaIceCream = new VanillaIceCream(basicIceCreamModel);
        String costVanilla = String.format("%.2f", vanillaIceCream.cost());
        System.out.println("Cost: " + costVanilla);

        IceCreamI mintIceCream = new MintIceCream(basicIceCreamModel);
        String costMint = String.format("%.2f", mintIceCream.cost());
        System.out.println("Cost: " + costMint);

        IceCreamI chocolateIceCream = new ChocolateIceCream(basicIceCreamModel);
        String costChocolate = String.format("%.2f", chocolateIceCream.cost());
        System.out.println("Cost: " + costChocolate);

        IceCreamI mintVanillaIceCream = new MintIceCream(vanillaIceCream);
        String costMintVanilla = String.format("%.2f", mintVanillaIceCream.cost());
        System.out.println("Cost: " + costMintVanilla);
    }

    private static void factoryExample() {
    }
}