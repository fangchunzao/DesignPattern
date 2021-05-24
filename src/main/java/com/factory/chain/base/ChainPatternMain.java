package com.factory.chain.base;

/**
 * @author chun zao
 * 2021/5/24 11:23 上午
 **/
public class ChainPatternMain {

    private static AbstractChain getChainOfLoggers() {

        final AbstractChain chain3 = new Chain3(AbstractChain.CHAIN3);
        final AbstractChain chain2 = new Chain2(AbstractChain.CHAIN2);
        final AbstractChain chain1 = new Chain1(AbstractChain.CHAIN1);

        chain3.setNextLogger(chain2);
        chain2.setNextLogger(chain1);

        return chain3;
    }

    public static void main(final String[] args) {
        final AbstractChain loggerChain = getChainOfLoggers();

        loggerChain.printMessage(AbstractChain.CHAIN1, "链条1 Message");
        loggerChain.printMessage(AbstractChain.CHAIN2, "链条2 Message");
        loggerChain.printMessage(AbstractChain.CHAIN3, "链条3 Message");
    }

}
