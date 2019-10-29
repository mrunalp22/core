package com.core.builder;

import org.openqa.selenium.WebDriver;

public abstract class AbstractDriver {
     WebDriver driver;

    abstract WebDriver launchBrowser();

    public WebDriver getDriver() {
        return driver;
    };
}
