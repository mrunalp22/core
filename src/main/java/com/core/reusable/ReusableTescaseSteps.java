package com.core.reusable;

import com.core.constant.MethodTypes;
import org.apache.http.util.Args;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReusableTescaseSteps extends Utils {

    public void login(WebDriver driver) {
        this.driver = driver;
        findByAndWait(MethodTypes.XPATH, "//*[@id=\"kitNav\"]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/a", 3000).click();
        findByAndWait(MethodTypes.XPATH,"//*[@id=\"inputGroupSuccess3\"]", 3000).sendKeys("gearsaydevops@gmail.com");
        findByAndWait(MethodTypes.XPATH,"//*[@id=\"pass\"]", 3000).sendKeys("Password$99");
        findByAndWait(MethodTypes.XPATH,"//*[@id=\"commanLoginPopup\"]/div/div/div[2]/div[4]/div[8]/h1/span[1]/a/strong",3000).click();
        findByAndWait(MethodTypes.XPATH,"//*[@id=\"loginBtn\"]",3000).click();
    }
}
