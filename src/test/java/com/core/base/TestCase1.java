package com.core.base;

import com.core.reusable.ReusableTescaseSteps;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends BaseCase {

    @Test
    public void clickConnect () throws InterruptedException {
        login(driver);
    }
}
