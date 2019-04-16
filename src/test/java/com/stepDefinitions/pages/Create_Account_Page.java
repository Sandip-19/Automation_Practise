package com.stepDefinitions.pages;

import com.stepDefinitions.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Create_Account_Page extends DriverClass {

    public void ClickSignButon (){
        driver.findElement(By.className("login")).click();
    }

    public void email (String Email_Create_an_ac){
        String timestamp = new SimpleDateFormat("HH.MM.SS").format(new Date());
        String Email_Create_an_ac_1[] = Email_Create_an_ac.split("@");
        String Email_Create_an_ac_2 = Email_Create_an_ac_1[0] + timestamp + "@" + Email_Create_an_ac_1[1];
        driver.findElement(By.id("email_create")).sendKeys(Email_Create_an_ac_2);

    }

    public void ClickAnAccount(){
        driver.findElement(By.id("SubmitCreate")).click();
    }

    public void GenderTitle(String title) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("id_gender1")).click();
    }

    public void FirstName(String First_Name){
        driver.findElement(By.id("customer_firstname")).sendKeys(First_Name);
    }

    public void LastName(String Last_Name){
        driver.findElement(By.name("customer_lastname")).sendKeys(Last_Name);
    }

    public void Passwo(String Password){
        driver.findElement(By.id("passwd")).sendKeys(Password);
    }

    public void SDate(String Date){
        new Select(driver.findElement(By.id("days"))).selectByValue(Date);
    }

    public void SMonth(String Month){
        new Select(driver.findElement(By.id("months"))).selectByIndex(4);
    }

    public void SYear(String Year){
        new Select(driver.findElement(By.name("years"))).selectByIndex(1);
    }

    public void Sigup_NL(){
        driver.findElement(By.id("newsletter")).click();
    }

    public void Special_Offer(){
        driver.findElement(By.name("optin")).click();
    }

    public void Company_Name(String ComName){
        driver.findElement(By.id("company")).sendKeys(ComName);
    }

    public void Addess(String Address1){
        driver.findElement(By.name("address1")).sendKeys(Address1);
    }

    public void Address_Line(String AddLine2){
        driver.findElement(By.id("address2")).sendKeys(AddLine2);
    }

    public void cityName(String City){
        driver.findElement(By.id("city")).sendKeys(City);
    }

    public void StateName(String State){
        driver.findElement(By.id("id_state")).sendKeys(State);
    }

    public void ZipPostcode(String Postcode){
        driver.findElement(By.id("postcode")).sendKeys(Postcode);
    }

    public void CountryName(String Country){
        driver.findElement(By.id("id_country")).sendKeys(Country);
    }

    public void AdditionalInfo(String AddInfo){
        driver.findElement(By.id("other")).sendKeys(AddInfo);
    }

    public void Mobile_Number(String Mobile){
        driver.findElement(By.id("phone_mobile")).sendKeys(Mobile);
    }

    public void Address_Allias(String AddAlias){
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys(AddAlias);
    }

    public void Click_Register(){
        driver.findElement(By.id("submitAccount")).click();
    }

























}
