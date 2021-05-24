package com.factory.chain.base;

/**
 * @author chun zao
 * 2021/5/24 11:21 上午
 **/
public abstract class AbstractChain {

    public static final int CHAIN1 = 1;
    public static final int CHAIN2 = 2;
    public static final int CHAIN3 = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractChain next;

    public void setNextLogger(final AbstractChain nextLogger) {
        this.next = nextLogger;
    }

    public void printMessage(final int level, final String message) {
        if (this.level == level) {
            write(message);
        }
        if (next != null) {
            next.printMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
