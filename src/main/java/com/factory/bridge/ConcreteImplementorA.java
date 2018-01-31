package com.factory.bridge;

public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现 方法A");
    }
}
