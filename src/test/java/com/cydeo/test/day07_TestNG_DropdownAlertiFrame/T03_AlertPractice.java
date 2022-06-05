package com.cydeo.test.day07_TestNG_DropdownAlertiFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T03_AlertPractice {
    WebDriver = driver;

    @BeforeMethod
    public void setUpMethod (){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().

    }
    @Test
    public void informationAlertTest(){
        WebElement jsAlertBttn = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertBttn.click();


        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


}
// 1. Open browser
// 2. Go to website: http://practice.cydeo.com/javascript_alerts
// 3. Click to “Click for JS Alert” button
// 4. Click to OK button from the alert
// 5. Verify “You successfully clicked an alert” text is displayed.