package com.factory.state;

public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        context.state = new ConcreteStateB();
    }
}
