package com.core.base;

import com.core.constant.MethodTypes;
import com.core.reusable.ReusableTescaseSteps;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends ReusableTescaseSteps {

    @Test
    public void clickConnect () throws InterruptedException {
        login(driver);
        findByAndWait(MethodTypes.XPATH, "//*[@id=\"kitNav\"]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/button", 3000).click();


    }
}
