package com.cydeo.test.day05_FindElements_CheckBox_RadioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T04_RacioButtonPt2 {
    public static void main(String[] args) {

        // 1. Open Chrome browser.
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // Provide extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons ");

        List <WebElement> sportRarioButtons = driver.findElements (By.xpath ("//input[@name='sport']"));

        for (WebElement each : sportRarioButtons) {

        }
    }
}