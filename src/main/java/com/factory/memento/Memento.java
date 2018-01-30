package com.factory.memento;

/**
 * 备忘录
 * 负责存储Originator对象的内部状态
 */
public class Memento {

    public String state;

    public Memento() {
       super();
    }

    public Memento(String state) {
        this.state = state;
    }
}
