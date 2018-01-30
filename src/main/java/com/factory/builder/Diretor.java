package com.factory.builder;

/**
 * 指挥者类
 */
public class Diretor {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
