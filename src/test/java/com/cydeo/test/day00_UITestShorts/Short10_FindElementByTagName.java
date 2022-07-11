package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short10_FindElementByTagName {

    public static void main (String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com");
        driver.manage().window().maximize();

        WebElement text = driver.findElement(By.tagName("h1"));

        System.out.println(text.getText());

        if (text.getText().equals("Test Automation practice")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        driver.quit();
    }
}
