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
        exampleOne();
        //------------------------------------------------------------
        //------------------------------------------------------------
        exampleTwo();
        //------------------------------------------------------------

        System.out.println(LINE_SEPARATOR);
        System.out.println(" ------- Observer Pattern -------");
        System.out.println(LINE_SEPARATOR);
        //------------------------------------------------------------
        observerExample();
        //------------------------------------------------------------

    }

    public static void exampleOne() {

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

    public static void exampleTwo() {
        System.out.println(" ------- Example Two -------");
        Product pants = new Product(34.45, "3af4hgj55");
        Product shirt = new Product(9.99, "4mfvk83ds");
        Product trainers = new Product(44.99, "7mh65dghy");
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(pants);
        shoppingCart.addProduct(shirt);
        shoppingCart.addProduct(trainers);

        shoppingCart.pay(new PaypalAlgorithm("correo@correo.com","3455332"));
        shoppingCart.pay(new CreditCardAlgorithm("Name User","3455667756455332"));
    }

    public static void observerExample(){
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
}