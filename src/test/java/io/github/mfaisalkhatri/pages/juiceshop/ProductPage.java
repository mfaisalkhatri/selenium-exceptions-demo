package io.github.mfaisalkhatri.pages.juiceshop;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage {

    public void addAppleJuiceToCart () {
        overlay ().click ();
        appleJuiceAddToBasketBtn ().click ();
    }

    public String itemsInBasket () {
        return getDriver ().findElement (By.cssSelector ("span.warn-notification"))
            .getAttribute ("innerText");
    }

    private WebElement appleJuiceAddToBasketBtn () {
        return getDriver ().findElement (
            By.cssSelector ("mat-grid-tile:nth-child(1) > div > mat-card > div:nth-child(2) > button"));
    }

    private WebElement overlay () {
        return getDriver ().findElement (
            By.cssSelector (".cdk-overlay-backdrop.cdk-overlay-transparent-backdrop.cdk-overlay-backdrop-showing"));
    }
}