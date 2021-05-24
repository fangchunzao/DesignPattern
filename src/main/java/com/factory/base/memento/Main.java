package com.factory.base.memento;

public class Main {
    public static void main(String[] args) {
        // 初始化发起人对象
        Originator o = new Originator();
        o.setState("On");
        o.show();

        // 创建备忘录 保存
        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());
        // 修改发起人的状态
        o.setState("Off");
        o.show();
        // 使用备忘录还原
        o.setMemento(c.getMemento());
        o.show();
    }
}
