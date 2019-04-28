package com.stepDefinitions;

import com.stepDefinitions.DriverClass;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class DVLA_SD extends DriverClass {
    @When("^I click onto Get vehicle information from DVLA on the first page$")
    public void iClickOntoGetVehicleInformationFromDVLAOnTheFirstPage() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/ol/li[6]/a")).click();
    }
}
