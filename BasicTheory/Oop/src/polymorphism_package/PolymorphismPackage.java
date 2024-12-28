package BasicTheory.Oop.src.polymorphism_package;


class Animals {

    public static int getNumberOfAnimals = 0;

    public Animals() {
        Animals.getNumberOfAnimals++;
    }

    protected void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animals {
    @Override
    protected void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animals {
    @Override
    protected void makeSound() {
        System.out.println("Cat meows");
    }
}


public class PolymorphismPackage {
    /*
    * Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
    * Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from
    * another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a
    * single action in different ways.
    */

    public static void soundTest (Animals animals){
        // A polymorphic method is a method that can take many forms. This was, the method may at different times invoke different methods.
        System.out.println("From the soundTest method");
        animals.makeSound();
    }

    public static void main(String[] args) {
        System.out.printf("number of Animals used: %d\n", Animals.getNumberOfAnimals);
        Animals animal = new Animals();
        animal.makeSound();
        soundTest(animal);

        Dog dog = new Dog();
        dog.makeSound();
        soundTest(dog);

        Cat cat = new Cat();
        cat.makeSound();
        soundTest(cat);
        System.out.printf("number of Animals used: %d\n", Animals.getNumberOfAnimals);
    }
}
