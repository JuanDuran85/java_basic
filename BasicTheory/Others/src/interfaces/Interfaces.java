package interfaces;

import interfacesTranslate.Translate;

public class Interfaces implements Translate {
    /*
    * Another way to achieve abstraction in Java, is with interfaces.

    An interface is a completely "abstract class" that is used to group related methods with empty bodies
    */

    @Override
    public void translate() {
        System.out.println("Translating...");
    }
}

class TranslateTest {
    public static void main(String[] args) {
        Interfaces translate = new Interfaces();
        translate.translate(); // Output: Translating...
        translate.sayHello();
    }
}
