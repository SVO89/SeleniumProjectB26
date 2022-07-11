package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short12_FindElementByPartialLinkText {

    public static void main (String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        WebElement feelingLucky = driver.findElement(By.partialLinkText("since 200"));
        System.out.println(feelingLucky.getText());
        driver.quit();
    }
}
