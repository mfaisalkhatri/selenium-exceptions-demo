package io.github.mfaisalkhatri.pages.uitestingplayground;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static io.github.mfaisalkhatri.setup.DriverManager.getDriver;

public class OverLapElementPage {

    private WebElement idField() {
        return getDriver().findElement(By.id("id"));
    }

    private WebElement nameField() {
        return getDriver().findElement(By.id("name"));
    }

    public void fillForm(final String id, final String name) {
        idField().click();
        idField().sendKeys(id);
        final var executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", nameField());
        nameField().click();
        nameField().sendKeys(name);
    }

    public String textInNameField() {
        return nameField().getAttribute("value");
    }
}
