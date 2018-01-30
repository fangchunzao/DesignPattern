package com.factory.strategy;

public class Main {

    public static void main(String[] args) {
        Context c = new Context(new Function());

        c.execute();
    }
}
