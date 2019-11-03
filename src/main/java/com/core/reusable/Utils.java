package com.core.reusable;

import com.core.builder.BaseDriver;
import com.core.constant.MethodTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Utils extends BaseDriver {
    public WebElement findBy(MethodTypes specifier, String reference) {
        return findByMethodTypes(specifier, reference);
    }

    public WebElement findByAndWait(MethodTypes specifier, String reference, int miliseconds) {
        WebElement element = findBy(specifier, reference);
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException ie) {
            System.out.println("InterruptedException in findByAndWait in Utils.java");
        }
        return element;
    }


    public WebElement findByMethodTypes(MethodTypes type, String reference) {
        WebElement webElement = null;
        switch (type) {
            case XPATH:
                webElement = driver.findElement(By.xpath(reference));
                break;

            case ID:
                webElement = driver.findElement(By.id(reference));
                break;

            case NAME:
                webElement = driver.findElement(By.name(reference));
                break;

            case CSS_SELECTOR:
                webElement = driver.findElement(By.cssSelector(reference));
                break;

            default:
                System.out.println("No type provided. Element is null");
                break;

        }
        return webElement;
    }
}
