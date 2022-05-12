package com.cydeo.test.day01_slenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigation {

    public static void main(String[] args) throws InterruptedException {

//      1. Seeting up web driver manager.
        WebDriverManager.chromedriver().setup();
//      2. Create instance of webdriver.
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
//      3. Make our page full screen
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");
//      navigate().to method is
//      driver.navigate().to("https://www.etsy.com");
        Thread.sleep(3000);
//      naviogate().back()
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
//      navigate().refresh() method is for refreshing the page.
        driver.navigate().refresh();

        String s1 = driver.getTitle();
        System.out.println("s1 = " + s1);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.get("https://www.tesla.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

//      This will close the currently open page.
        driver.close();

//      This will close all the pages/tabs.
        driver.quit();
    }
}