package com.factory.base.iterator;

public class Main {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();

        aggregate.set("1");
        aggregate.set("2");
        aggregate.set("3");
        aggregate.set("4");
        aggregate.set("5");

        Iterator i = aggregate.createIterator();
        Object o = i.first();
        while (!i.isDone()) {
            System.out.println(i.currentItem());
            i.next();
        }
    }
}
