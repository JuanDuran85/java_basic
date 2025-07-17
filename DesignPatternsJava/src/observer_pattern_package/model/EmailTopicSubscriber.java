package observer_pattern_package.model;

import observer_pattern_package.interfaces.ObserverI;
import observer_pattern_package.interfaces.SubjectI;

public class EmailTopicSubscriber implements ObserverI {
    private final String name;

    public EmailTopicSubscriber(String nameIn) {
        this.name = nameIn;
    }

    @Override
    public void update() {

    }

    @Override
    public void setSubject(SubjectI subject) {

    }
}
