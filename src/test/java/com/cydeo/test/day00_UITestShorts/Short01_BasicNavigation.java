package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short01_BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        // Setup chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate().to(url)
        driver.navigate().to("https://www.google.com/maps");

        // driver.get(url)
        driver.get("https://www.google.com");


        // navigate().back()
        driver.navigate().back();

        // navigate().forward()
        driver.navigate().forward();

        // navigate().refresh()
        driver.navigate().refresh();
    }
}
