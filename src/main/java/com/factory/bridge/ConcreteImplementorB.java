package com.factory.bridge;

public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现 方法B");
    }
}
