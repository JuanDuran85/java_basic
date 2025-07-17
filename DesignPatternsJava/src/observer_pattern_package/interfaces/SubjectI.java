package observer_pattern_package.interfaces;

public interface SubjectI {
    public void register(ObserverI observer);

    public void unregister(ObserverI observer);

    public void notifyObservers();

    public Object getUpdate(ObserverI observer);
}
