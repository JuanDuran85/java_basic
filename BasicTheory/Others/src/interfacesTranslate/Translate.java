package interfacesTranslate;

public interface Translate {
    public void translate();
    public default void sayHello() {
        System.out.println("Hello from Translate interface");
    }
}
