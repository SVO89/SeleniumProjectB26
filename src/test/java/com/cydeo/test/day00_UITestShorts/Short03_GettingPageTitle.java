package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Short03_GettingPageTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cydeo.com");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Cydeo";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test Passed");
        }else{ System.out.println("Test Failed");}
        driver.quit();
    }
}
