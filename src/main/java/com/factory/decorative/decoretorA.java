package com.factory.decorative;

public class decoretorA extends Decorator {

    @Override
    public void operation() {
        super.operation();
        System.out.println("装载A");
    }
}
