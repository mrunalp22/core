package com.core.reusable;

import org.apache.http.util.Args;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReusableTescaseSteps extends Utils {
    public WebDriver driver;

    public ReusableTescaseSteps() {
    }

    public void login() throws InterruptedException {
        byXpath("//*[@id=\"kitNav\"]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/a").click();
    driver.findElement(By.xpath("//*[@id=\"kitNav\"]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"inputGroupSuccess3\"]")).sendKeys("gearsaydevops@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Password$99");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"commanLoginPopup\"]/div/div/div[2]/div[4]/div[8]/h1/span[1]/a/strong")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
        Thread.sleep(3000);
    }
}
