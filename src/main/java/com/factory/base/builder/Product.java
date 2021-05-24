package com.factory.base.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类 由多个部件组成
 */
public class Product {

    private final List<String> parts = new ArrayList<>();

    /**
     * 添加一个产品部件
     * @param part 部件
     */
    public void add(final String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("所有部件----------------");
        for(final String part : parts) {
            System.out.println(part);
        }
    }
}
