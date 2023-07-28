package io.github.mfaisalkhatri.pages.lambdatestecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;

public class MainPage {

    private WebElement shopByCategoryLink() {
        return getDriver().findElement(By.linkText("Shop by Category"));
    }

    public void openShopByCategoryMenu() {
        shopByCategoryLink().click();
    }

    private WebElement menuBar() {
        return getDriver().findElement(By.cssSelector(".entry-section div.navbar-collapse"));
    }
    private WebElement blogLink() {
        return getDriver().findElement(By.linkText("Blog"));
    }
    public BlogPage navigateToBlogs() {
        //        blogLink().click();  elementclickinterceptedexception
        final Actions actions = new Actions(getDriver());
        actions.moveToElement(menuBar()).click().build().perform();
        blogLink().click();
        return new BlogPage();

    }


}
