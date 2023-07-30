package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.pages.lambdatestecommerce.MainPage;
import org.testng.annotations.Test;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;
import static org.testng.Assert.assertEquals;

    public class LambdaTestEcommerceTest extends BaseTest{

    @Test
    public void testNavigationToBlogsMenu() {
        getDriver().get("https://ecommerce-playground.lambdatest.io/");
        final var mainPage = new MainPage();
        mainPage.openShopByCategoryMenu();
        final var blogPage = mainPage.navigateToBlogs();
        assertEquals(blogPage.pageHeader(), "LATEST ARTICLES");
    }

}
