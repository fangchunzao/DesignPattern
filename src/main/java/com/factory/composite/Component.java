package com.factory.composite;

/**
 * 为组合对象声明接口
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);
}

