package com.factory.base.state;

public class Context {

    public State state;

    public Context(final State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(final State state) {
        this.state = state;
    }
}
