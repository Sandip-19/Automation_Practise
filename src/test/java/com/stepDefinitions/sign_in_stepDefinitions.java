package com.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


public class sign_in_stepDefinitions extends DriverClass    {

//    WebDriver driver;
//    The above WebDriver driver is global variable and it can be use any where in the class now.

    @Given("^I enter url as \"([^\"]*)\"$")
    public void iGotoUrlAs(String URL) {

//        openBrowser();

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//      The above 2 lines of syntax will open the Chrome web browsers only.

        driver.get(URL);
//      The above syntax driver.bet(URL);will open the URL

        driver.manage().window().maximize();

        driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
//      OPEN URL
    }

    @When("^I click login button on home page$")
    public void iClickLoginButtonOnHomePage() {
        driver.findElement(By.linkText("Login")).click();
//  The above syntax will click onto login button onto home page.
    }

    @Given("^I enter user name as \"([^\"]*)\"$")
    public void iEnterUserNameAs(String userName) {
        driver.findElement(By.name("log")).sendKeys(userName);
//   The above syntax will enter the user name details.
    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        driver.findElement(By.name("pwd")).sendKeys(password);
//    In the username syntax you can see .sendKeys(...charSequences: to get this you have to enter double quote.
    }

    @When("^I click login button on login page$")
    public void iClickLoginButtonOnLoginPage() {
        driver.findElement(By.name("submit")).click();
    }

    @Then("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String expected_error_message) {
        String actual_error_message;
        System.out.println("expected error message is  " + expected_error_message);
        actual_error_message = driver.findElement(By.xpath("//*[@id=\"post-4521\"]/div/div[1]/p")).getText();
        System.out.println("actual error message is  " + actual_error_message);

        assertEquals(expected_error_message, actual_error_message);

        assertTrue(expected_error_message.equalsIgnoreCase(actual_error_message));
    }

    @Given("^I entered first name as \"([^\"]*)\"$")
    public void iEnteredFirstNameAs(String FirstName) {
        driver.findElement(By.name("first-name")).sendKeys(FirstName);
    }

    @Given("^I entered last name as \"([^\"]*)\"$")
    public void iEnteredLastNameAs(String LastName) {
        driver.findElement(By.name("last-name")).sendKeys(LastName);
    }

    @Given("^I entered email address as \"([^\"]*)\"$")
    public void iEnteredEmailAddressAs(String EmailAdd) {
        driver.findElement(By.name("your-email")).sendKeys(EmailAdd);
    }

    @Given("^I entered phone number as \"([^\"]*)\"$")
    public void iEnteredPhoneNumberAs(String PhoneNumber) {
        driver.findElement(By.name("tel-879")).sendKeys(PhoneNumber);
    }

    @Given("^I entered subject as a \"([^\"]*)\"$")
    public void iEnteredSubjectAsA(String Subject) {
        driver.findElement(By.name("your-subject")).sendKeys(Subject);
    }

    @Given("^I entered message as \"([^\"]*)\"$")
    public void iEnteredMessageAs(String Message) {
        driver.findElement(By.name("your-message")).sendKeys(Message);
    }

    @Given("^I entered captcha code as per shown on the page as \"([^\"]*)\"$")
    public void iEnteredCaptchaCodeAsPerShownOnThePageAs(String Captcha) {
        driver.findElement(By.name("captcha-005")).sendKeys(Captcha);
    }

    @When("^I click send message button$")
    public void iClickSendMessageButton() {
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f391-o1\"]/form/p[4]/input")).click();
    }

/*@Then("^I should see a pop up box with message \"([^\"]*)\"$")
    public void iShouldSeeAPopUpBoxWithMessage(String expected_error_message1 ) {
        String actual_error_message1;
        System.out.println("expected-eror_message1 is " + expected_error_message1);
//        actual_error_message1 = driver.findElement(By.xpath("id='wpcf7-f391-o1']/form/p[3]/span/span")).getText();
        actual_error_message1 =  driver.findElement(By.id("wpcf7-f391-01")).getText();
        System.out.println("actual_error_message1 is " + actual_error_message1);

        assertEquals(expected_error_message1, actual_error_message1);
        assertTrue(expected_error_message1.equalsIgnoreCase(actual_error_message1));
    }*/
}