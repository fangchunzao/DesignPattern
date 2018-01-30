package com.factory.builder;

/**
 * 建造者模式
 * Product 类是产品
 * 由Builder 类控制建造标准 ConcreteBuilder继承Builder类
 * ConcreteBuilder根据Builder构建的方法进行生产
 * Diretor 描述建造顺序
 */
public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        ConcreteBuilder2 builder2 = new ConcreteBuilder2();

        diretor.construct(builder1);
        Product p1 = builder1.getResult();
        p1.show();
    }
}
