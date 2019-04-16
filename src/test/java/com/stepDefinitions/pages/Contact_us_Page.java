package com.stepDefinitions.pages;

import com.stepDefinitions.DriverClass;
import org.openqa.selenium.By;

public class Contact_us_Page extends DriverClass {

    public void ClickContactUSButton(){
        driver.findElement(By.linkText("Contact us")).click();
    }










}
