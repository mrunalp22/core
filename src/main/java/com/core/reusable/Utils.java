package com.core.reusable;

import com.core.builder.BaseDriver;
import com.core.constant.MethodTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;


public class Utils extends BaseDriver {

    public WebElement findBy(MethodTypes specifier, String reference) {
        return findByMethodTypes(specifier, reference);
    }

    public WebElement findByAndWait(MethodTypes type, String reference, int miliseconds) {
        WebElement element = findBy(type, reference);
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException ie) {
            System.out.println("InterruptedException in findByAndWait in Utils.java");
        }
        return element;
    }


    public WebElement findByMethodTypes(MethodTypes type, String reference) {
        By byReference = null;
        switch (type) {
            case XPATH:
                byReference = By.xpath(reference);
                break;

            case ID:
                byReference = By.id(reference);
                break;

            case NAME:
                byReference = By.name(reference);
                break;

            case CSS_SELECTOR:
                byReference = By.cssSelector(reference);
                break;

            case LINKTEXT:
                byReference = By.linkText(reference);
                break;

            case PARTIALLINKTEXT:
                byReference = By.partialLinkText(reference);
                break;

            case TAGNAME:
                byReference = By.tagName(reference);
                break;

            case CLASSNAME:
                byReference = By.className(reference);
                break;



            default:
                byReference = By.id(reference);
                System.out.println("No type provided. Default finding element by ID");
                break;

        }
        return driver.findElement(byReference);
    }

    public WebElement JavascriptExecuterTillTheElement(MethodTypes Type, String reference, int milliseconds) throws InterruptedException {
        WebElement element = findByAndWait(Type, reference, milliseconds);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
        return element;
    }

    public void Action(){
        Actions act = new Actions(getDriver());
    }

    public void Robot() throws AWTException {
        Robot r = new Robot();
    }


}
