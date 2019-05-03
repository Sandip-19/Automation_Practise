package com.stepDefinitions;

import com.stepDefinitions.DriverClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.apache.poi.ss.usermodel.WorkbookFactory.create;

public class DVLA_SD extends DriverClass {

    ArrayList<String> RegistrationNumber = new ArrayList<String>();
    ArrayList<String> Make = new ArrayList<String>();
    ArrayList<String> Colour = new ArrayList<String>();

    @When("^I click onto Get vehicle information from DVLA on the first page$")
    public void iClickOntoGetVehicleInformationFromDVLAOnTheFirstPage() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/ol/li[6]/a")).click();
    }

    @Then("^I should see start now button$")
    public void iShouldSeeStartNowButton() {
        boolean ButtonDisplay = driver.findElement(By.id("get-started")).isDisplayed();
        Assert.assertTrue(ButtonDisplay);
    }

    @When("^I click start now button$")
    public void iClickStartNowButton() {
        driver.findElement(By.xpath("//*[@id=\"get-started\"]/a")).click();
    }


    @Given("^I am reading the data from excel file \"([^\"]*)\"$")
    public void iAmReadingTheDataFromExcelFile(String ExcelDataFileName) throws IOException {

        String path = System.getProperty("user.dir");
        String DataFile = path + "/src/test/java/com/Test_Data/" + ExcelDataFileName;

        Workbook workbook = create(new File(DataFile));
        Sheet sheet = workbook.getSheetAt(0);

        System.out.println("Vehicle Info");
        System.out.println("-------------");

        DataFormatter dataFormatter = new DataFormatter();

        RegistrationNumber = new ArrayList<String>();
        Make = new ArrayList<String>();
        Colour = new ArrayList<String>();

        for (Row row : sheet) {
            for (Cell cell : row) {
                if (row.getRowNum() == 0) {

                } else {
                    if (cell.getColumnIndex() == 0) {
                        String cellValue = dataFormatter.formatCellValue(cell);
                        RegistrationNumber.add(cellValue);
                        System.out.println(cellValue);
                    }
                    if (cell.getColumnIndex() == 1) {
                        String cellValue = dataFormatter.formatCellValue(cell);
                        Make.add(cellValue);
                        System.out.println(cellValue);
                    }
                    if (cell.getColumnIndex() == 2) {
                        String cellValue = dataFormatter.formatCellValue(cell);
                        Colour.add(cellValue);
                        System.out.println(cellValue);
                        System.out.println("-------------");
                    }
                }
            }

        }
    }

    @Given("^I enter registration number$")
    public void iEnterRegistrationNumber() {
        driver.findElement(By.id("Vrm")).sendKeys(RegistrationNumber.get(0));
    }

    @When("^I click Continue button$")
    public void iClickContinueButton() {
        driver.findElement(By.className("button")).click();
    }

    @Then("^I should see vehicle Reg number, make,colour$")
    public void iShouldSeeVehicleRegNumberMakeColour() {
        String actualRegNumber;
        String actualMake;
        String actualColour;

        actualRegNumber = driver.findElement(By.className("reg-mark")).getText();
        actualMake = driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/ul/li[2]/span[2]/strong")).getText();
        actualColour = driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/ul/li[3]/span[2]/strong")).getText();

        Assert.assertEquals(RegistrationNumber.get(0), actualRegNumber);
        Assert.assertEquals(Make.get(0), actualMake);
        Assert.assertEquals(Colour.get(0), actualColour);
    }

    @Then("^I select no,search again button$")
    public void iSelectNoSearchAgainButton() {
        driver.findElement(By.id("Correct_False")).click();
    }


    @Then("^I verify the vehicle data$")
    public void iVerifyTheVehicleData() {

        String actualRegNumber;
        String actualMake;
        String actualColour;

        for (int i=0; i>RegistrationNumber.size();i++) {

            driver.findElement(By.id("Vrm")).sendKeys(RegistrationNumber.get(i)); // first time entered the reg number
            driver.findElement(By.className("button")).click(); // click the start button on the first page

            actualRegNumber = driver.findElement(By.className("reg-mark")).getText();
            actualMake = driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/ul/li[2]/span[2]/strong")).getText();
            actualColour = driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/ul/li[3]/span[2]/strong")).getText();

            Assert.assertEquals(RegistrationNumber.get(i), actualRegNumber);
            Assert.assertEquals(Make.get(i), actualMake);
            Assert.assertEquals(Colour.get(i), actualColour);

            driver.findElement(By.id("Correct_False")).click();     // no search again button
            driver.findElement(By.className("button")).click();     // second time continue button under the search agsin button
        }
    }
}