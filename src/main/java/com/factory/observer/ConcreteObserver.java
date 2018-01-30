package com.factory.observer;

public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject concreteSubject;

    ConcreteObserver(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        observerState = concreteSubject.getSubjectState();
        System.out.println("观察者1状态 -- " + name + " --  " + observerState);
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }
}
