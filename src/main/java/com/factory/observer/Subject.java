package com.factory.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者类
 */

abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    //增加观察者
    public void attach(Observer observer) {
        this.observers.add(observer);
    }
    //删除观察者
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }
    // 通知
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

}
