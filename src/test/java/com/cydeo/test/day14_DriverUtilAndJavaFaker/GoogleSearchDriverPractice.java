package com.cydeo.test.day14_DriverUtilAndJavaFaker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class GoogleSearchDriverPractice {
    @Test
    public void googleSearchDriverPractice(){
        // Go to "https://www.google.com/"
   //     Driver.getDriver().get("https://www.google.com");
        // Write “apple” in search box
   //     WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
   //     searchBox.sendKeys("apple");
        // Verify title:
        //Expected: apple - Google Search
   //     String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "apple - Google Search";
    //    Assert.assertEquals(actualTitle,expectedTitle);
    }
}
