package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short13_LocaterPractice {

    public static void main (String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("abcabc");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("123456");

        WebElement submitBtn = driver.findElement(By.id("_submit"));
        submitBtn.click();

        WebElement alertMessage = driver.findElement(By.className("alert"));
        System.out.println(alertMessage.getText());
        if (alertMessage.getText().equals("Invalid user name or password.")){
            System.out.println("Invalid Message test PASSED");
        }else{
            System.out.println("Invalid Message test FAILED");
        }
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("vytrack")){
                System.out.println("Link test PASSED");
        }else{
            System.out.println("Link test FAILED");
        }
        driver.findElement(By.linkText("Forgot your password?")).click();

        if (driver.getTitle().equals("Forgot Passwordd")){
            System.out.println("Title test PASSED");
        }else{
            System.out.println("Title test FAILED");
        }
        driver.quit();
    }
}