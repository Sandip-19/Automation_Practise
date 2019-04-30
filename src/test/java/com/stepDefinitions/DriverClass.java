package com.stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class DriverClass {
    public static WebDriver driver;

    public void openBrowser() throws IOException {
        String browser = System.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        String env = System.getProperty("env");
        String path = System.getProperty("user.dir");
        String file = null;

        if (env.equalsIgnoreCase("qa")) {
            file = path + "/src/test/java/com/stepDefinitions/propertyFiles/environment_qa.properties";
        } else if (env.equalsIgnoreCase("uat")) {
            file = path + "/src/test/java/com/stepDefinitions/propertyFiles/environment_uat.properties";
        } else if (env.equalsIgnoreCase("prod")) {
            file = path + "/src/test/java/com/stepDefinitions/propertyFiles/environment_prod.properties";
        }

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("URL"));
        driver.get(properties.getProperty("URL"));
// line 40 to 45 is a syntax for environment - property files.

        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.close();
        driver.quit();

    }
}
