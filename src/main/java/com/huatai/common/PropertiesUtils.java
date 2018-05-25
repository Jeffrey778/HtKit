package com.huatai.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesUtils {

    /**
     * url配置文件路径
     * 程序同级文件夹env-config.properties
     */
    private static final String PATH = Utils.getParentPath() + "/env-config.properties";

    private static Properties prop = new Properties();

    static {
        try (InputStream in = new FileInputStream(PATH)) {
            prop.load(in);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 读取核心接口properties
     *
     * @param key 键
     * @return url
     */
    public static String read(String key) {
        return (String) prop.get(key);
    }

    /**
     * 写入配置文件
     *
     * @param key   键
     * @param value 值
     */
    public static void write(String key, String value) {
        prop.setProperty(key, value);
        try (OutputStream out = new FileOutputStream(PATH)) {
            prop.store(out, "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
