package com.factory.base.strategy;

public class Main {

    public static void main(String[] args) {
        Context c = new Context(new Function());

        c.execute();
    }
}
