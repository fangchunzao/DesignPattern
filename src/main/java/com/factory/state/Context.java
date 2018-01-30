package com.factory.state;

public class Context {

    public State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
