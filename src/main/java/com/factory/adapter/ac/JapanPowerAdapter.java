package com.factory.adapter.ac;

/**
 * @author chun zao
 * 2021/5/26 5:37 下午
 **/
public class JapanPowerAdapter implements DC5Adapter {

    public static final int voltage = 110;

    @Override
    public boolean support(final AC ac) {
        return (voltage == ac.outputAC());
    }

    @Override
    public int outputDC5V(final AC ac) {
        final int adapterInput = ac.outputAC();
        //变压器...
        final int adapterOutput = adapterInput / 22;
        System.out.println("使用JapanPowerAdapter变压适配器，输入AC:" + adapterInput + "V" + "，输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }

}
