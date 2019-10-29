package com.core.builder;

import com.core.config.PropertiesParser;
import org.openqa.selenium.WebDriver;

public class BaseDriver {
    private PropertiesParser propertiesParser = new PropertiesParser();
    private WebDriver driver;

    public BaseDriver() {
        String browser = propertiesParser.getConfig("browser");

        if(browser.equals("CHROME")) {
            driver = new ChromeDriverBuilder().launchBrowser();
        } else if(browser.equals("FIREFOX")) {
            driver =new FirefoxDriverBuilder().launchBrowser();
        } else {
            driver = new ChromeDriverBuilder().launchBrowser();
        }
    }

    public WebDriver getDriver () {
        return driver;
    }

    public static void main(String[] args) {
        System.out.println(new BaseDriver().getDriver());
    }
}
