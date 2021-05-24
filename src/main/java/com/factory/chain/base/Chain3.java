package com.factory.chain.base;

/**
 * @author chun zao
 * 2021/5/24 11:22 上午
 **/
public class Chain3 extends AbstractChain {

    public Chain3(final int level) {
        this.level = level;
    }

    @Override
    protected void write(final String message) {
        System.out.println("链条3 message: " + message);
    }
}
