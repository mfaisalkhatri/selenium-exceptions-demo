package io.github.mfaisalkhatri.pages.juiceshop;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private final HomePage homePage;

    public LoginPage () {
        this.homePage = new HomePage ();
    }

    public boolean checkLogoutLinkIsDisplayed () {
        openAccountMenu ();
        return getDriver ().findElement (By.id ("navbarLogoutButton"))
            .isDisplayed ();
    }

    public void clickLoginBtn () {
        // waitForSnackBarToDisappear();
        loginBtn ().click ();
    }

    public ProductPage login (final String email, final String password) {
        emailField ().sendKeys (email);
        passwordField ().sendKeys (password);
        clickLoginBtn ();
        return new ProductPage ();
    }

    public void openAccountMenu () {
        this.homePage.accountLink ()
            .click ();
    }

    private WebElement emailField () {
        return getDriver ().findElement (By.id ("email"));
    }

    private WebElement loginBtn () {
        return getDriver ().findElement (By.id ("loginButton"));
    }

    private WebElement passwordField () {
        return getDriver ().findElement (By.id ("password"));
    }

    private void waitForSnackBarToDisappear () {
        final WebDriverWait wait = new WebDriverWait (getDriver (), Duration.ofSeconds (10));
        wait.until (ExpectedConditions.invisibilityOfElementLocated (By.cssSelector (".mat-simple-snack-bar-content")));
    }
}
