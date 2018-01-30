package com.factory.memento;

/**
 * 发起人
 * 负责创建一个备忘录 Memento，用来记录它此刻的内部状态，并可以恢复
 */
public class Originator {

    private String state;
    // 创建备忘录对象
    public Memento createMemento() {
        return new Memento(state);
    }
    // 恢复状态
    public void setMemento(Memento memento) {
        state = memento.state;
    }

    public void show() {
        System.out.println("状态: " + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
