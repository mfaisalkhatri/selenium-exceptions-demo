package io.github.mfaisalkhatri.pages.juiceshop;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    public void closeBanner () {
        dismissBtn ().click ();
    }

    public void closeCookieMessage () {
        meWantItBtn ().click ();
    }

    public LoginPage navigateToLoginPage () {
        closeBanner ();
        closeCookieMessage ();
        accountLink ().click ();
        loginLink ().click ();
        return new LoginPage ();
    }

    protected WebElement accountLink () {
        return getDriver ().findElement (By.id ("navbarAccount"));
    }

    private WebElement dismissBtn () {
        return getDriver ().findElement (By.cssSelector ("button[aria-label=\"Close Welcome Banner\"]"));
    }

    private WebElement loginLink () {
        return getDriver ().findElement (By.id ("navbarLoginButton"));
    }

    private WebElement meWantItBtn () {
        return getDriver ().findElement (By.cssSelector ("a[aria-label=\"dismiss cookie message\"]"));
    }

}
