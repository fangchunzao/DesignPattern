package com.factory.observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver("mark", subject));
        subject.attach(new ConcreteObserver("nick", subject));

        subject.setSubjectState("溜了");

        subject.notifyObservers();
    }
}
