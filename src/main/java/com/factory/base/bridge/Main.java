package com.factory.base.bridge;

public class Main {

    public static void main(final String[] args) {
        final Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
