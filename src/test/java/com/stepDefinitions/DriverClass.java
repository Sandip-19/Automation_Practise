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

        driver.get("http://www.automationpractice.com");
        driver.manage().window().maximize();
     }

    public void closeBrowser() {
//        driver.close();
//        driver.quit();

    }
}
