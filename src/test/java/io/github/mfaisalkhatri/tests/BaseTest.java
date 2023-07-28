package io.github.mfaisalkhatri.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static io.github.mfaisalkhatri.setup.DriverManager.createDriver;
import static io.github.mfaisalkhatri.setup.DriverManager.quitDriver;

public class BaseTest {

    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    public void setupTest (final String browser) {
        createDriver(browser);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown () {
        quitDriver ();
    }



}
