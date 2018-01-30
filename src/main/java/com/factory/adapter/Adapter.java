package com.factory.adapter;

/**
 * 适配器
 */
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();


    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
