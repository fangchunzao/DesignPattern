package com.factory.chain.base;

/**
 * @author chun zao
 * 2021/5/24 11:23 上午
 **/
public class Chain2 extends AbstractChain {

    public Chain2(final int level) {
        this.level = level;
    }

    @Override
    protected void write(final String message) {
        System.out.println("链条2 message: " + message);
    }
}
