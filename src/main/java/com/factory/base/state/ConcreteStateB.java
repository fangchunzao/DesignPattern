package com.factory.base.state;

public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        context.state = new ConcreteStateA();
    }
}
