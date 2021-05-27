package com.factory.adapter.intf;

/**
 * @author chun zao
 * 2021/5/26 5:05 下午
 **/
public abstract class Adapter implements Target {

    protected final Adaptee adaptee;

    public Adapter(final Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request1() {
    }

    @Override
    public void request2() {
    }

    @Override
    public void request3() {
    }
}
