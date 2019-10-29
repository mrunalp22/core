package com.core.config;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesParser {
    private Properties properties = new Properties();

    public PropertiesParser(){
        try {
            InputStream input = new FileInputStream("src/main/resources/application.properties");
            properties.load(input);
        } catch (Exception e) {
            System.out.println("File Not Found");
        }
    }

    public String getConfig(String configName) {
        try {
            return String.valueOf(properties.get(configName));
        } catch (Exception e) {
            return "Config not found!";
        }
    }
}
