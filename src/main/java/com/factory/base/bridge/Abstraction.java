package com.factory.base.bridge;

public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(final Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }

}
