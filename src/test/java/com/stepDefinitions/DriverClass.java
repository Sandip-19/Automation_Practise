package com.stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverClass {
    public static WebDriver driver;

    public void openBrowser() {
        String browser = System.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

//        driver.get("http://www.automationpractice.com");
        driver.get("https://www.gov.uk/government/organisations/driver-and-vehicle-licensing-agency");
        driver.manage().window().maximize();
     }

     String env =   System.getProperty("env");

    String path = System.getProperty("user.dir");


    {
        String dir = path + "/src/test/java/com/stepDefinitions/propertyFiles/environment_qa.properties";
    }

    public void closeBrowser() {
//        driver.close();
//        driver.quit();

    }
}
