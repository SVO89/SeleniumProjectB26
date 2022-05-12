package com.cydeo.test.day02_locators;

/*      1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/
        3- Click to A/B Testing from top of the list.
        4- Verify title is as expected: "No A/B Test"
        5- Go back to home page by using the .back();
        6- Verify title equals: "Practice" */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class T2_BackAndForth {

    public static void main(String[]args) throws InterruptedException {

//      1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//      2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/ ");

        Thread.sleep(2500);

//      3- Click to A/B Testing from top of the list.
        WebElement abLinkText = driver.findElement(By.linkText("A/B Testing"));
        abLinkText.click();

//      4- Verify title is as expected: "No A/B Test"
        String expectedTitle = "No A/B Test";

        if(abLinkText.equals(expectedTitle)){
            System.out.println("Title test: PASSED");
        }else{
            System.out.println("Title test: FAILED");
        }

//      5- Go back to home page by using the .back();
        driver.navigate().back();

//      6- Verify title equals: "Practice"
        String expectedHomeTitle = "Practice";
        String actualHomeTitle = driver.getTitle();

        if(expectedHomeTitle.equals(actualHomeTitle)){
            System.out.println("Home title test: PASSED");
        }else{
            System.out.println("Home title test: FAILED");
        }
        driver.quit();
    }
}