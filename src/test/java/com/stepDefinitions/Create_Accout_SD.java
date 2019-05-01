package com.stepDefinitions;

import com.stepDefinitions.pages.Create_Account_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Accout_SD extends DriverClass {

    public Create_Account_Page c_page = PageFactory.initElements(driver,Create_Account_Page.class);

    @Given("^I click onto singin button onto home page$")
    public void iClickOntoSinginButtonOntoHomePage() {
        c_page.ClickSignButon();
    }

    @And("^I entered an email address for create an account as \"([^\"]*)\"$")
    public void iEnteredAnEmailAddressForCreateAnAccountAs(String Email_Create_an_ac) {
        c_page.email(Email_Create_an_ac);
    }

    @When("^I click create an account Button$")
    public void iClickCreateAnAccountButton() {
        c_page.ClickAnAccount();
    }

    @Given("^I select \"([^\"]*)\" as tiltle$")
    public void iSelectAsTiltle(String tilte) throws InterruptedException      {
        Thread.sleep(3000);
        c_page.GenderTitle(tilte);
    }


    @Given("^I enter First Name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String First_Name) {
        c_page.FirstName(First_Name);
    }

    @Given("^I enter Last Name as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String Last_Name){
           c_page.LastName(Last_Name);
    }

    @Given("^I enter Password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String Password) {
        c_page.Passwo(Password);
    }

    @And("^I select Date as \"([^\"]*)\"$")
    public void iSelectDateAs(String Date) {
        c_page.SDate(Date);
    }

    @And("^I select Month as \"([^\"]*)\"$")
    public void iSelectMonthAs(String Month){
        c_page.SMonth(Month);
    }

    @And("^I select Year as \"([^\"]*)\"$")
    public void iSelectYearAs(String Year){
        c_page.SYear(Year);
    }

    @When("^I click sign up for Newsletter$")
    public void iClickSignUpForNewsletter() {
        c_page.Sigup_NL();
    }

    @When("^I click special offers$")
    public void iClickSpecialOffers() {
        c_page.Special_Offer();
    }

    @Given("^I enter company as \"([^\"]*)\"$")
    public void iEnterCompanyAs(String ComName) {
        c_page.Company_Name(ComName);
    }

    @Given("^I enter addess as \"([^\"]*)\"$")
    public void iEnterAddessAs(String Address1) {
        c_page.Addess(Address1);
    }

    @Given("^I enter address line (\\d+) as \"([^\"]*)\"$")
    public void iEnterAddressLineAs(int arg0, String AddLine2){
        c_page.Address_Line(AddLine2);
    }

    @Given("^I enter city Name as \"([^\"]*)\"$")
    public void iEnterCityNameAs(String City) {
        c_page.cityName(City);
    }

    @Given("^I enter State Name as \"([^\"]*)\"$")
    public void iEnterStateNameAs(String State) {
      c_page.StateName(State);
    }

    @Given("^I eneter Zip Postcode as \"([^\"]*)\"$")
    public void iEneterZipPostcodeAs(String Postcode) {
        c_page.ZipPostcode(Postcode);
    }

    @Given("^I enter Country Name as \"([^\"]*)\"$")
    public void iEnterCountryNameAs(String Country) {
        c_page.CountryName(Country);
    }

    @Given("^I enter additional info as \"([^\"]*)\"$")
    public void iEnterAdditionalInfoAs(String AddInfo) {
        c_page.AdditionalInfo(AddInfo);
    }

    @Given("^I enter enter mobile number as \"([^\"]*)\"$")
    public void iEnterEnterMobileNumberAs(String Mobile) {
       c_page.Mobile_Number(Mobile);
    }

    @Given("^I enter Adress Alias as \"([^\"]*)\"$")
    public void iEnterAdressAliasAs(String AddAlias) {
        c_page.Address_Allias(AddAlias);
    }

    @When("^I click Register Button onto the create an acoount page$")
    public void iClickRegisterButtonOntoTheCreateAnAcoountPage() {
        c_page.Click_Register();
    }


}
