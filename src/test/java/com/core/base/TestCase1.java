package com.core.base;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends BaseCase {

    @Test
    public void clickConnect () {
        driver.findElement(By.id("searchText4")).sendKeys("swimming");
    }
}
