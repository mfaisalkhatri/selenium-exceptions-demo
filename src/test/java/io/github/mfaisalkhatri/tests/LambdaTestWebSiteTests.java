package io.github.mfaisalkhatri.tests;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;
import static org.testng.Assert.assertTrue;

import io.github.mfaisalkhatri.pages.lambdatest.HomePage;
import org.testng.annotations.Test;

public class LambdaTestWebSiteTests extends BaseTest {

    @Test
    public void testHomePage () {
        getDriver ().get ("https://www.lambdatest.com");
        final HomePage homePage = new HomePage ();
        homePage.clickOnVideoLinkUsingJSExecutor ();
        assertTrue (homePage.videoCloseBtn ()
            .isDisplayed ());
    }
}