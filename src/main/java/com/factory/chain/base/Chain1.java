package com.factory.chain.base;

/**
 * @author chun zao
 * 2021/5/24 11:22 上午
 **/
public class Chain1 extends AbstractChain {

    public Chain1(final int level) {
        this.level = level;
    }

    @Override
    protected void write(final String message) {
        System.out.println("链条1  message: " + message);
    }
}
