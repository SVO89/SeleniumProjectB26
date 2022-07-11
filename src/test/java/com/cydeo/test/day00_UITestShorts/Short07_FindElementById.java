package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short07_FindElementById {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement luckyText = driver.findElement(By.id("gbqfbb"));
        String actualLuckyText = luckyText.getAttribute("value");
        // Verify if value is "I'm Feeling Lucky"
        if (actualLuckyText.equals("I'm Feeling Lucky")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}
