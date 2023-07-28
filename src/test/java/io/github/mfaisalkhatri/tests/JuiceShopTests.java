package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.pages.juiceshop.HomePage;
import org.testng.annotations.Test;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;
import static org.testng.Assert.assertTrue;

public class JuiceShopTests extends BaseTest {


    @Test
    public void testAddProductToBasket() {
        getDriver().get("https://juice-shop.herokuapp.com/#/");
        final var loginPage = new HomePage().navigateToLoginPage();
        final var productPage = loginPage.login("demo+1@gmail.com", "Juice@1234");
        assertTrue(loginPage.checkLogoutLinkIsDisplayed());
        productPage.addAppleJuiceToCart();
    }

}
