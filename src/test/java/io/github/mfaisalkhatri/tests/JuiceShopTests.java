package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.pages.juiceshop.HomePage;
import io.github.mfaisalkhatri.pages.juiceshop.ProductPage;
import org.testng.annotations.Test;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JuiceShopTests extends BaseTest {

    private ProductPage productPage;
    @Test
    public void testLogin() {
        getDriver().get("https://juice-shop.herokuapp.com/#/");
        final var loginPage = new HomePage().navigateToLoginPage();
        this.productPage = loginPage.login("demo+1@gmail.com", "Juice@1234");
        assertTrue(loginPage.checkLogoutLinkIsDisplayed());
    }
    @Test
    public void testAddProductToBasket() {
        this.productPage.addAppleJuiceToCart();
        assertEquals(this.productPage.itemsInBasket(), "1");
    }

}
