package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.pages.uitestingplayground.OverLapElementPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;
import static org.testng.Assert.assertEquals;

public class UITestingPlaygroundTests extends BaseTest{

    @Test
    public void testOverLappingElement() {
        getDriver().get("http://www.uitestingplayground.com/overlapped");

        final var overLapElementPage = new OverLapElementPage();
        final String id = "ID7763";
        final String name = "Faisal K";
        overLapElementPage.fillForm(id, name);

        assertEquals(overLapElementPage.textInNameField(), name);

    }
}
