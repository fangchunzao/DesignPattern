package com.factory.iterator;

/**
 * 迭代器模式
 * java中foreach 语句就是该模式
 **/
public abstract class Iterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
