package com.parasoft.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtilities {

    /**
     *
     * @param time in seconds
     * @throws InterruptedException
     */
    public static void sleep(int time) throws InterruptedException {
        time *= 1000;
        Thread.sleep(time);
    }

    public static void waitForElementVisibility(WebElement element){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
    }

}
