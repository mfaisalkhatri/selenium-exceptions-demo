package io.github.mfaisalkhatri.pages.lambdatestecommerce;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage {

    public BlogPage navigateToBlogs () {
        final Actions actions = new Actions (getDriver ());
        actions.moveToElement (menuBar ())
            .click ()
            .build ()
            .perform ();
        blogLink ().click ();
        return new BlogPage ();

    }

    public void openShopByCategoryMenu () {
        shopByCategoryLink ().click ();
    }

    private WebElement blogLink () {
        return getDriver ().findElement (By.linkText ("Blog"));
    }

    private WebElement menuBar () {
        return getDriver ().findElement (By.cssSelector (".entry-section div.navbar-collapse"));
    }

    private WebElement shopByCategoryLink () {
        return getDriver ().findElement (By.linkText ("Shop by Category"));
    }
}