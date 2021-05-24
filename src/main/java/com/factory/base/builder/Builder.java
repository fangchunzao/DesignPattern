package com.factory.base.builder;

/**
 * 建造者类 产品有partA和partB组成
 */
public abstract class Builder {

    abstract void buildPartA();

    abstract void buildPartB();

    abstract Product getResult();
}
