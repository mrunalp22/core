package com.core.base;

import com.core.constant.MethodTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Test02AddContentModule extends BaseCase {
    @Test
    public void addContent() throws InterruptedException {
        findByAndWait(MethodTypes.XPATH, "//*[@id=\"kitNav\"]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/button", 3000).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        findByAndWait(MethodTypes.XPATH, "//*[@id=\"userAddedKits\"]/div[1]/div[1]/div[3]/div[15]/div[1]/div[3]", 3000).click();
        findByAndWait(MethodTypes.XPATH, "//*[@id=\"tableTemplate\"]/div[3]/div[1]/span[1]/a[1]/img", 3000).click();
        findByAndWait(MethodTypes.XPATH, "//*[@id=\"addYourOwnContent\"]/div/div[2]/div/a[1]/img", 2000).click();
        findByAndWait(MethodTypes.XPATH, "//*[@id=\"textTitle\"]", 2000).sendKeys("test");
        findByAndWait(MethodTypes.XPATH, "//*[@id=\"editor\"]/div[1]", 2000).sendKeys("test");
        findByAndWait(MethodTypes.XPATH, "//*[@id=\"cat\"]", 2000).click();
        findByAndWait(MethodTypes.XPATH, "//*[@id=\"addToLocker\"]", 2000).click();
    }

}