package com.core.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Test02AddContentModule extends BaseCase {
    @Test
    public void addContent() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"kitNav\"]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/button")).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"userAddedKits\"]/div[1]/div[1]/div[3]/div[15]/div[1]/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"tableTemplate\"]/div[3]/div[1]/span[1]/a[1]/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"addYourOwnContent\"]/div/div[2]/div/a[1]/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"textTitle\"]")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div[1]")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"cat\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"addToLocker\"]")).click();
        Thread.sleep(2000);
    }

}