package com.cydeo.test.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[]args){

//      1. Open Chrime brownser.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//      2. Go to https://google.com
        driver.get("https://google.com");

//      3. Write apple in search box
        WebElement searchBox = driver.findElement(By.name("q"));

//      4. Click google search button
        searchBox.sendKeys("apple" + Keys.ENTER);

//      5. Verify title
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title test: PASSED");
        }else{
            System.out.println("Title test: FAILED");
        }
        driver.quit();
    }
}