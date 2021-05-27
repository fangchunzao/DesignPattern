package com.factory.adapter.ac;

import java.util.LinkedList;
import java.util.List;

/**
 * @author chun zao
 * 2021/5/26 5:37 下午
 **/
public class Test {

    private final List<DC5Adapter> adapters = new LinkedList<>();

    public Test() {
        this.adapters.add(new ChinaPowerAdapter());
        this.adapters.add(new JapanPowerAdapter());
    }

    public static void main(final String[] args) {
        final Test test = new Test();
        final AC chinaAC = new AC220();
        DC5Adapter adapter = test.getPowerAdapter(chinaAC);
        adapter.outputDC5V(chinaAC);

        final AC japanAC = new AC110();
        adapter = test.getPowerAdapter(japanAC);
        adapter.outputDC5V(japanAC);
    }

    // 根据电压找合适的变压器
    public DC5Adapter getPowerAdapter(final AC ac) {
        DC5Adapter adapter = null;
        for (final DC5Adapter ad : this.adapters) {
            if (ad.support(ac)) {
                adapter = ad;
                break;
            }
        }
        if (adapter == null) {
            throw new IllegalArgumentException("没有找到合适的变压适配器");
        }
        return adapter;
    }

}
