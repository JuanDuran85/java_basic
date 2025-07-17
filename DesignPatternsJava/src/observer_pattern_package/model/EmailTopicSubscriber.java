package observer_pattern_package.model;

import observer_pattern_package.interfaces.ObserverI;
import observer_pattern_package.interfaces.SubjectI;

public class EmailTopicSubscriber implements ObserverI {
    private final String name;
    private SubjectI subjectTopic;

    public EmailTopicSubscriber(String nameIn) {
        this.name = nameIn;
    }

    @Override
    public void update() {
        String msg = (String) this.subjectTopic.getUpdate(this);
        if (msg == null) System.out.println("Message is null - No new message from " + this.name);
        else System.out.println("Message: " + msg + " from " + this.name);
    }

    @Override
    public void setSubject(SubjectI subject) {
        this.subjectTopic = subject;
    }
}
