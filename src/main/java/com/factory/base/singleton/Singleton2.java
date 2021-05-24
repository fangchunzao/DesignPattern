package com.factory.base.singleton;

/**
 * 多线程可能并发调用instance()
 * 单例模式 线程安全
 */
public class Singleton2 {

    /**
     * JVM中并没有规定编译器优化相关的内容，也就是说JVM可以自由的进行指令重排序的优化。
     * 导致初始化Singleton和将对象地址赋给instance字段的顺序是不确定的。
     * 在某个线程创建单例对象时，在构造方法被调用之前，就为该对象分配了内存空间并将对象的字段设置为默认值。
     * 此时就可以将分配的内存地址赋值给instance字段了，然而该对象可能还没有初始化。
     * 若紧接着另外一个线程来调用getInstance，取到的就是状态不正确的对象，程序就会出错。
     */

   // private static Singleton instance;
    private static volatile  Singleton instance;  //指令重排优化问题


    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) { // 进程锁
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
