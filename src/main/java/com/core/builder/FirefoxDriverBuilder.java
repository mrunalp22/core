package com.core.builder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverBuilder extends AbstractDriver {

    public WebDriver launchBrowser () {
        FirefoxOptions fo= new FirefoxOptions();
        fo.addArguments("start-maximized");
        driver = new FirefoxDriver(fo);
        return driver;
    }

}
