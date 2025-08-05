package io.github.mfaisalkhatri.tests;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.github.mfaisalkhatri.pages.juiceshop.HomePage;
import io.github.mfaisalkhatri.pages.juiceshop.ProductPage;
import org.testng.annotations.Test;

public class JuiceShopTests extends BaseTest {

    private ProductPage productPage;

    @Test
    public void testAddProductToBasket () {
        this.productPage.addAppleJuiceToCart ();
        assertEquals (this.productPage.itemsInBasket (), "1");
    }

    @Test
    public void testLogin () {
        getDriver ().get ("https://juice-shop.herokuapp.com/#/");
        final var loginPage = new HomePage ().navigateToLoginPage ();
        this.productPage = loginPage.login ("demo+1@gmail.com", "Juice@1234");
        assertTrue (loginPage.checkLogoutLinkIsDisplayed ());
    }
}