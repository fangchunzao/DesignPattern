package com.factory.decorative;

public class Main {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        decoretorA a = new decoretorA();
        decoretorB b = new decoretorB();

        a.setComponent(c);
        b.setComponent(a);
        b.operation();

    }
}