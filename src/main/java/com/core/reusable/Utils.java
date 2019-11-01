package com.core.reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
    public WebDriver driver;
    public WebElement byXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }


}
