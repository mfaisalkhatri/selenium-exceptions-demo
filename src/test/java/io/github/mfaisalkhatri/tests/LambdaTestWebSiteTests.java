package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.pages.lambdatest.HomePage;
import org.testng.annotations.Test;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;
import static org.testng.Assert.assertTrue;


public class LambdaTestWebSiteTests extends BaseTest {

    @Test
    public void testHomePage() {
        getDriver().get("https://www.lambdatest.com");
        final HomePage homePage = new HomePage();
        // homePage.clickOnVideoLink(); Throws ElementClickInterceptionException
        homePage.clickOnVideoLinkUsingJSExecutor();
        assertTrue(homePage.videoCloseBtn().isDisplayed());
    }
}
