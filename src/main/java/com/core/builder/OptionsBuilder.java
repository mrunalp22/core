package com.core.builder;

import com.core.config.PropertiesParser;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Arrays;

public class OptionsBuilder {

    static MutableCapabilities getOptions () {
        PropertiesParser propertiesParser = new PropertiesParser();
        String browser = propertiesParser.getConfig("browser");
        String[] browerArgs = propertiesParser.getConfig("browser.options").split(",");

        if(browser.equals("CHROME")) {
            return new ChromeOptions().addArguments(Arrays.asList(browerArgs));
        } else if(browser.equals("FIREFOX")) {
            return new FirefoxOptions().addArguments(Arrays.asList(browerArgs));
        } else {
            return new ChromeOptions().addArguments(Arrays.asList(browerArgs));
        }
    }
}
