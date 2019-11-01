package com.core.reusable;

import com.core.builder.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils extends BaseDriver {
    public WebElement byXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }


}
