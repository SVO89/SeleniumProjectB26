package com.cydeo.test.day07_TestNG_DropdownAlertiFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T01_SimpleDropdown {

    WebDriver driver;

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void dropDownTest(){
        driver.get("https://practice.cydeo.com/dropdown");

        Select simpleDropDown = new Select(driver.findElement(By.id("dropdown")));
        String actualDefaultSimpleDropdown = simpleDropDown.getFirstSelectedOption().getText();
        String expectedDefaultSimpleDropdown = "Please select an option";

        Assert.assertEquals(actualDefaultSimpleDropdown, expectedDefaultSimpleDropdown);

        //  4. Verify “State selection” default selected value is correct
        //     Expected: “Select a State”
        Select stateDropDown =  new Select(driver.findElement(By.id("state")));
        String actualStateDefaultText = stateDropDown.getFirstSelectedOption().getText();
        String expectedStateDefaultText = "Select a State";

        Assert.assertEquals(expectedStateDefaultText, actualStateDefaultText);
    }
}
//  TC #01: Verifying “Simple dropdown” and “State selection” dropdown default values
//  1. Open Chrome browser
//  2. Go to https://practice.cydeo.com/dropdown
//  3. Verify “Simple dropdown” default selected value is correct
//     Expected: “Please select an option”