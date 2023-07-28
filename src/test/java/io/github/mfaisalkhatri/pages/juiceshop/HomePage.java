package io.github.mfaisalkhatri.pages.juiceshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;

public class HomePage {

    private WebElement dismissBtn() {
        return getDriver().findElement(By.cssSelector("button[aria-label=\"Close Welcome Banner\"]"));
    }

    public void closeBanner() {
        dismissBtn().click();
    }

    private WebElement meWantItBtn() {
        return getDriver().findElement(By.cssSelector("a[aria-label=\"dismiss cookie message\"]"));
    }

    public void closeCookieMessage() {
        meWantItBtn().click();
    }

    protected WebElement accountLink() {
        return getDriver().findElement(By.id("navbarAccount"));
    }

    private WebElement loginLink() {
        return getDriver().findElement(By.id("navbarLoginButton"));
    }

    public LoginPage navigateToLoginPage() {
        closeBanner();
        closeCookieMessage();
        accountLink().click();
        loginLink().click();
        return new LoginPage();
    }

}
