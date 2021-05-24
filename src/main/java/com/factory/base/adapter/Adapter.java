package com.factory.base.adapter;

/**
 * 适配器
 */
public class Adapter implements Target{

    private final Adaptee adaptee = new Adaptee();


    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
