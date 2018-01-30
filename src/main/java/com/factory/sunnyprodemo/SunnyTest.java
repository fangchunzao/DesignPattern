package com.factory.sunnyprodemo;

public class SunnyTest {
    public static void main(String[] args) {
       /* HairInterface left = new LeftHair();
        left.draw();*/

//       HairFactory factory = new HairFactory();
/*
       HairInterface hair = factory.getHair("left");

       hair.draw();
*/
//       HairInterface hair = factory.getHairByClass("com.factory.sunnyprodemo.LeftHair");
//       hair.draw();

//        HairInterface hair = factory.getHairByClass("in");
//        hair.draw();
        PersonFactory factory = new MCFactory();
        Girl girl = factory.getGirl();
        girl.drawWomen();

        PersonFactory factory1 = new HNFactory();
        Boy boy = factory1.getBoy();
        boy.drawMan();
    }
}
