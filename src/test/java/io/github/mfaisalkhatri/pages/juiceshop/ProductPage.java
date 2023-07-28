package io.github.mfaisalkhatri.pages.juiceshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;

public class ProductPage {

    private WebElement appleJuiceAddToBasketBtn() {
        return getDriver().findElement(By.cssSelector("mat-grid-tile:nth-child(1) > div > mat-card > div:nth-child(2) > button"));
    }

    private WebElement overlay() {
        return getDriver().findElement(
                By.cssSelector(".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing"));
    }


    public void addAppleJuiceToCart() {
        overlay().click(); //click overlay to close it.
        appleJuiceAddToBasketBtn().click();
    }
}
