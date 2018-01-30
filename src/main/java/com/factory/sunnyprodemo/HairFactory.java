package com.factory.sunnyprodemo;

import java.util.Map;

/**
 * 工厂
 */
public class HairFactory {

    /**
     * 根据类型生成
     * @param key
     * @return
     */
    public HairInterface getHair(String key) {
        if ("left".equals(key)) {
            return new LeftHair();
        } else if ("right".equals(key)) {
            return new RightHair();
        } else {
            return null;
        }
    }

    public HairInterface getHairByClass(String key) {

        try {
            Map<String,String> map = new PropertiesReader().getProperties();
            HairInterface hair = (HairInterface) Class.forName(map.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }

}
