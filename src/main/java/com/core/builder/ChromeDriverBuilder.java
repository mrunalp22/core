package com.core.builder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverBuilder extends AbstractDriver {

    public WebDriver launchBrowser() {
        driver = new ChromeDriver();
        return driver;
    }

}
