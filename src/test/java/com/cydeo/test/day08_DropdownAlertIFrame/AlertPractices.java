package com.cydeo.test.day08_DropdownAlertIFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractices {
    WebDriver driver;
    public void setUpMethod(){
        // 1. Open browser.
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2. Go to webiste: "http://practice.cydeo.com/javascript_alerts"
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void confirmAlertsTest(){
        // 3. Click to "Click for JS Confirm" button.
        WebElement confirmJSButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm'"));
        confirmJSButton.click();
        // 4. Click OK button to confirm alert.
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // 5. Verify "You clicked: Ok" text is displayed.
        WebElement resultText = driver.findElement(By.id("result"));
        Assert.assertTrue(resultText.isDisplayed(), "result text did not appear!");
        String actualText = resultText.getText();
        String expectedText = "You clicked: Ok";
        Assert.assertEquals(actualText, expectedText, "result text did not appear correctly!");
    }

}
