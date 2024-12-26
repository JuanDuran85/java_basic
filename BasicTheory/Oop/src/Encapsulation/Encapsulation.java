package BasicTheory.Oop.src.Encapsulation;

import BasicTheory.Oop.src.Oop;

public class Encapsulation {

    /*
    *
    * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
    * declare class variables/attributes as private.
    * provide public get and set methods to access and update the value of a private variable
    *
    */
    public static void main(String[] args) {
        var oopFromPackage = new Oop("Daffa", 20, 50.5, 'M', "Jakarta");
        oopFromPackage.getAllDataPersonal();
        oopFromPackage.setName("Daffa Update");
        var nameSave = oopFromPackage.getName();
        System.out.println("Name after update: " + nameSave);
    }
}
