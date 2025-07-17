package observer_pattern_package.model;

import observer_pattern_package.interfaces.ObserverI;
import observer_pattern_package.interfaces.SubjectI;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements SubjectI {
    private String message;
    private List<ObserverI> observerIList;

    public EmailTopic() {
        this.observerIList = new ArrayList<>();
    }

    @Override
    public void register(ObserverI observer) {
        if (observer == null) throw new NullPointerException("Null Observer / object");
        if (!observerIList.contains(observer)) {
            observerIList.add(observer);
        }
    }

    @Override
    public void unregister(ObserverI observer) {
        observerIList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverI observer : observerIList) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(ObserverI observer) {
        return this.message;
    }

    public void postMessage(String messageIn) {
        System.out.println("Message posted to my topic: " + message);
        this.message = messageIn;
        notifyObservers();
    }
}
