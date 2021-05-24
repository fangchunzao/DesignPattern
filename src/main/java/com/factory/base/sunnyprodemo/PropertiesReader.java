package com.factory.base.sunnyprodemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties 文件读取
 */
public class PropertiesReader {

    public Map<String, String> getProperties() {

        Properties props = new Properties();
        Map<String, String> map = new HashMap<>();

        try {
            InputStream in = getClass().getResourceAsStream("type.properties");
            props.load(in);
            Enumeration en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = props.getProperty(key);
                map.put(key,property);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
