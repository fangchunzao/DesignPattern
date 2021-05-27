package com.factory.adapter.intf;

/**
 * @author chun zao
 * 2021/5/26 5:05 下午
 **/
public class Test {

    public static void main(final String[] args) {
        final Target adapter = new Adapter(new Adaptee()) {
            @Override
            public void request1() {
                System.out.println("自定义处理");
                adaptee.specificRequest();
                return;
            }
        };
        adapter.request1();
    }

}
