package com.cydeo.test.day01_slenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CydeoVerification {

    public static void main(String[] args) {



    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://practice.cydeo.com");
    String URLContains = "cydeo";
    String actualURL = driver.getCurrentUrl();

    if(actualURL.contains(URLContains)){
        System.out.println("URL Verification PASSED");
    }else{
        System.out.println("URL Verification FAILED");
    }
    driver.quit();
    }
}
