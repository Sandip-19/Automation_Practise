package com.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;

public class hooks {
        DriverClass driverC = new DriverClass();

    @Before
    public void browserOpen() throws IOException {
        driverC.openBrowser();
    }

    @After

    public void browserClose(){
        driverC.closeBrowser();
    }
}


