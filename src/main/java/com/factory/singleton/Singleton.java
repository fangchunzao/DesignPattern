package com.factory.singleton;

/**
 * 单例模式 (最简单的版本)
 */
public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
