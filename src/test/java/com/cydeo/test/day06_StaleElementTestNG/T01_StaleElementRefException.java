package com.cydeo.test.day06_StaleElementTestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T01_StaleElementRefException {
    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        // 3. Click to “Add Element” button
        WebElement addElements = driver.findElement(By.xpath("//button[.='Add Element']"));
        // 4. Verify “Delete” button is displayed after clicking.
        addElements.click();
        WebElement deleteBtn = driver.findElement(By.cssSelector("button[class='added-manually']"));
        System.out.println("Before clicking delete button = " + deleteBtn.isDisplayed());
        // 5. Click to “Delete” button.
        deleteBtn.click();
        // 6. Verify “Delete” button is NOT displayed after clicking.
        try {
            System.out.println("After clicking delete button = " + deleteBtn.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("This means the web element is completely deleted from the page and HTML.");
        }
    }
}
// TC #1: StaleElementReferenceException handling
// 1. Open Chrome browser
// 2. Go to https://practice.cydeo.com/add_remove_elements/
// 3. Click to “Add Element” button
// 4. Verify “Delete” button is displayed after clicking.
// 5. Click to “Delete” button.
// 6. Verify “Delete” button is NOT displayed after clicking.