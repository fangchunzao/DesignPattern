package com.factory.base.adapter;

public class Main {
    public static void main(final String[] args) {
        final Target target = new Adapter();
        target.request();
    }
}
