package com.factory.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类 由多个部件组成
 */
public class Product {

    private List<String> parts = new ArrayList<>();

    /**
     * 添加一个产品部件
     * @param part 部件
     */
    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("所有部件----------------");
        for(String part : parts) {
            System.out.println(part);
        }
    }
}
