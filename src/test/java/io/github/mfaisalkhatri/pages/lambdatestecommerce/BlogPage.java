package io.github.mfaisalkhatri.pages.lambdatestecommerce;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;

import org.openqa.selenium.By;

public class BlogPage {

    public String pageHeader () {
        return getDriver ().findElement (By.cssSelector (".entry-section div.mz-tab-listing-header h3"))
            .getText ();
    }
}