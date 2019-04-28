package com.stepDefinitions;

        import com.stepDefinitions.pages.Contact_us_Page;
        import com.sun.org.apache.xpath.internal.operations.Equals;
        import cucumber.api.PendingException;
        import cucumber.api.java.en.And;
        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
        import org.junit.Assert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.Select;

        import static org.junit.Assert.assertEquals;

public class Contact_us_SD extends DriverClass {

    public Contact_us_Page x_Page = PageFactory.initElements(driver,Contact_us_Page.class);


    @Given("^I click on contact us button on the home page$")
    public void iClickOnContactUsButtonOnTheHomePage() {
        x_Page.ClickContactUSButton();
    }

    @And("^I select  \"([^\"]*)\" from subject heading$")
    public void iSelectFromSubjectHeading(String subject_heading)  {
        new Select(driver.findElement(By.id("id_contact"))).selectByValue("2");
//    new Select(driver.findElement(By.id("id_contct"))).selectByVisibleText(subject_heading);
//    new Select(driver.findElement(By.id("id_contact"))).selectByIndex(1);
    }

    @And("^I entered an email address as \"([^\"]*)\"$")
    public void iEnteredAnEmailAddressAs(String EmailAdd)  {
        driver.findElement(By.id("email")).sendKeys(EmailAdd);
    }

    @And("^I entered ref number as \"([^\"]*)\"$")
    public void iEnteredRefNumberAs(String Ref_Number){
        driver.findElement(By.id("id_order")).sendKeys(Ref_Number);
    }

    @And("^I attached a file$")
    public void iAttachedAFile() {
        String path = System.getProperty("user.dir");
        driver.findElement(By.name("fileUpload")).sendKeys(path +"/src/test/java/com/Test_Data/Sample.txt");
    }

    @And("^I entered a message as \"([^\"]*)\"$")
    public void iEnteredAMesageAs(String message) {
        driver.findElement(By.id("message")).sendKeys(message);
    }

    @When("^I click send button$")
    public void iClickSendButton() {
        driver.findElement(By.name("submitMessage")).click();
    }

    @Then("^I should see message as \"([^\"]*)\"$")
    public void iShouldSeeMessageAs(String expected_message){

        String actual_message = null;

        if (expected_message.equalsIgnoreCase("Your message has been successfully sent to our team.")){
            System.out.println("expected message is  " + "Your message has been successfully sent to our team.");

           actual_message = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
            System.out.println("actual_message is  " + "Your message has been successfully sent to our team.");

            assertEquals(expected_message,actual_message);

        }else if (expected_message.equalsIgnoreCase("There is 1 error invalid email address.")){
            System.out.println("expected_message is  " + "There is 1 error invalid email address.");

            actual_message = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div")).getText();
            System.out.println("actual_message is  " + "There is 1 error invalid email address.");

            assertEquals(expected_message,actual_message);

        }else if (expected_message.equalsIgnoreCase("There is 1 error The message cannot be blank")){
            System.out.println("expected_message is  " + "There is 1 error The message cannot be blank.");

            actual_message = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div")).getText();
            System.out.println("actual_message is  " + "There is 1 error The message cannot be blank.");

            assertEquals(expected_message,actual_message);
        }
    }

    @Then("^I should see partial url contains \"([^\"]*)\"$")
    public void iShouldSeePartialUrlContains(String PartialURL){
         String actualURL= driver.getCurrentUrl();
         Assert.assertTrue(actualURL.contains(PartialURL));
    }

    @And("^I should not see signout button$")
    public void iShouldNotSeeSignoutButton() {
       int SignOutButton = driver.findElements(By.linkText("Sign Out")).size();
        Assert.assertEquals(0,SignOutButton );
    }

    @And("^I should see sign in button$")
    public void iShouldSeeSignInButton() {
        boolean ButtonDisplay = driver.findElement(By.linkText("Sign in")).isDisplayed();
        Assert.assertTrue(ButtonDisplay);
    }

    @And("^I should see contact us buton$")
    public void iShouldSeeContactUsButon() {
        boolean ButtonDisplay = driver.findElement(By.id("contact-link")).isDisplayed();
        Assert.assertTrue(ButtonDisplay);
    }

    @When("^I click browser back button$")
    public void iClickBrowserBackButton() {
        driver.navigate().back();
    }

    @Then("^I should not see error message as \"([^\"]*)\"$")
    public void iShouldNotSeeErrorMessageAs(String ExpecedErroeMessage) {
        int ErrorMesageDisplay = driver.findElements(By.xpath("//*[@id=\"center_column\"]/div")).size();
        Assert.assertEquals(0,ErrorMesageDisplay);

    }

    @When("^I click browser forward button$")
    public void iClickBrowserForwardButton() {
        driver.navigate().forward();
    }


}
