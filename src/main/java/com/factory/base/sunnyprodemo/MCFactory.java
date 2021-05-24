package com.factory.base.sunnyprodemo;

/**
 * 丑系列加工
 */
public class MCFactory implements PersonFactory{
    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }
}
