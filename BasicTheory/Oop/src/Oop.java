package BasicTheory.Oop.src;

import java.util.logging.Logger;

public class Oop {

    static final Logger logger = Logger.getLogger(Oop.class.getName());
    static final String DOT_LINES = "---------------------------";
    private int ope1;
    private int ope2;
    private String name;
    private int age;
    private double weight;
    private char gender;
    private String address;

    // constructor: Oop constructor method, they should be the same name as the
    // class and not return anything
    // Constructor Overloading: means having multiple constructors in the same
    // class, each with a different parameter list. st. The constructors are
    // differentiated by the number and types of their parameters. This allows you to create
    // objects with varying initial states based on what data is available when the object is instantiated.

    // static and dynamic contexts
    // Static context defines items that are needed to prepare executables, items such as the names and types of
    // external variables and functions that will be available at run time as well as compilation modes like
    // backwards compatibility, math mode, and so on. These items do not change across invocations. Is the same when we define a class. This context, can not access the dynamic context

    // The dynamic context is used to configure execution-time characteristics.
    // Dynamic context defines items that are unique to each invocation of an executable, items such as the values
    // for external variables, external function implementations, and resolvers to external inputs or results. These
    // items might change across invocations. When you create and object, it is created in the dynamic context. From this context, we can access the static context.


    public Oop() {
        logger.info(DOT_LINES);
        logger.info("---Constructor Overloading in Java---");
        logger.info(DOT_LINES);
    }

    public Oop(int ope1, int ope2) {
        logger.info(DOT_LINES);
        logger.info("---Constructor in Java---");
        this.ope1 = ope1;
        this.ope2 = ope2;
        logger.info(DOT_LINES);
    }

    public Oop(String name, int age, double weight, char gender, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.address = address;
    }

    public void showData(int valueIn1, int valueIn2) {
        logger.info(DOT_LINES);
        logger.info(Integer.toString(valueIn1));
        logger.info(Integer.toString(valueIn2));
        logger.info(DOT_LINES);
    }

    public void showDataPublic() {
        logger.info(DOT_LINES);
        logger.info("Value1: " + Integer.toString(this.ope1));
        logger.info("Value2: " + Integer.toString(this.ope2));
        logger.info(DOT_LINES);
    }

    public void plusInteger(int valueIn1, int valueIn2) {
        logger.info(DOT_LINES);
        logger.info(Integer.toString(valueIn1 + valueIn2));
        logger.info(DOT_LINES);
    }

    public static void main(String[] args) {
        Oop oop = new Oop(3, 5);
        oop.showData(oop.ope1, oop.ope2);
        oop.plusInteger(oop.ope1, oop.ope2);

        Oop oop2 = new Oop();
        oop2.showData(0, 0);
        oop2.plusInteger(0, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void getAllDataPersonal() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nWeight: " + this.weight + "\nGender: " + this.gender + "\nAddress: " + this.address);
    }

    @Override
    public String toString() {
        return "Oop{" +
                "ope1=" + ope1 +
                ", ope2=" + ope2 +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
