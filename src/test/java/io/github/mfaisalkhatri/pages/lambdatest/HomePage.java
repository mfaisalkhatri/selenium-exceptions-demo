package io.github.mfaisalkhatri.pages.lambdatest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;

public class HomePage {

    private WebElement videoLink() {
        return getDriver().findElement(By.cssSelector("div > div:nth-child(1) > span > picture > img"));
    }

    public void clickOnVideoLink() {
        videoLink().click();
    }

    public void clickOnVideoLinkUsingJSExecutor() {
        final JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", videoLink());

    }

    public WebElement videoCloseBtn() {
        return getDriver().findElement(By.cssSelector(".popup span.close"));
    }

}