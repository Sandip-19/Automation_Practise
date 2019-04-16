package com.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;

public class hooks {
        DriverClass driverC = new DriverClass();

    @Before
    public void browserOpen(){
        driverC.openBrowser();
    }

    @After

    public void browserClose(){
//        driverC.closeBrowser();
    }
}


