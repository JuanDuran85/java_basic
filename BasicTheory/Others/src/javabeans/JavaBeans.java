package javabeans;

import java.io.Serializable;

public class JavaBeans {

    /*
    * JavaBeans are classes that encapsulate many objects into a single object (the bean).
    *
    * It is a Java class that should follow the following conventions:
    * - Must implement Serializable.
    * - It should have a public no-arg constructor.
    * - All properties in java bean must be private with public getters and setter methods.
    */

    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.setName("John");
        personOne.setAge(25);
        personOne.setLastName("Doe");
        System.out.println(personOne);
    }
}

class Person implements Serializable {
    private String name;
    private int age;
    private String lastName;

    public Person(){}

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}