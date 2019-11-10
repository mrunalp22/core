package com.core.base;

import com.core.base.reusableBase.ReusableUtilsObject;
import com.core.builder.BaseDriver;
import com.core.reusable.ReusableTescaseSteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseCase extends ReusableTescaseSteps {
    public WebDriver driver;

    @BeforeClass
    public void initClass (){
        driver = new BaseDriver().getDriver();
    }

    @BeforeMethod
    public void initTest() throws InterruptedException {
        driver.get("http://gearsay.com/");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown () {

        driver.close();

    }
}
