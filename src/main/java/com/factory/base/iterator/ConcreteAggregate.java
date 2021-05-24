package com.factory.base.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int Count() {
        return items.size();
    }

    public Object get(int index) {
        return items.get(index);
    }

    public void set(Object o) {
        items.add(o);
    }
}
