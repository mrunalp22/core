package com.core.base;

import com.core.builder.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class BaseCase {
    public WebDriver driver;

    @BeforeClass
    public void initClass (){
        driver = new BaseDriver().getDriver();
    }

    @BeforeMethod
    public void initTest() {
        driver.get("https://gearsay.com");
    }

    @AfterMethod
    public void tearDown () {

        driver.close();
    }
}
