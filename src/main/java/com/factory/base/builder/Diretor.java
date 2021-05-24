package com.factory.base.builder;

/**
 * 指挥者类
 */
public class Diretor {

    public void construct(final Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
