package com.cydeo.test.day07_TestNG_DropdownAlertiFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
        driver.quit();
    }

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void googleTitle(){
        driver.get("https://google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Title verification failed!");
    }
    @Test
    public void yahooTitle(){
        driver.get("heetps://yahoo.com");
    }
    @Test
    public void etsyTitle(){
        driver.get("heetps://etsy.com");
    }
}
