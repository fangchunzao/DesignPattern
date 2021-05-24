package com.factory.base.builder;

public class ConcreteBuilder1 extends Builder {

    private final Product product = new Product();

    @Override
    void buildPartA() {
        product.add("部件A");
    }

    @Override
    void buildPartB() {
        product.add("部件B");
    }

    @Override
    Product getResult() {
        return product;
    }
}
