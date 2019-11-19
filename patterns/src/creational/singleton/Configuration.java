package creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    private static Configuration instance = null;
    private Properties properties;

    Configuration() {
        properties = new Properties();
        File cfg = new File("config.txt");

        try (FileInputStream fis = new FileInputStream(cfg);) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized static Configuration getInstance() {
        if(instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public synchronized String getProp(String key) {
        String value = null;
        if( properties.containsKey(key)){
            value = (String) properties.getProperty(key);
        }
        return value;

    }
}
