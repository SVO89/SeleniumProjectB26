package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short04_FullScreenMode {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cydeo.com");
        driver.wait();
        driver.manage().window().fullscreen();
        driver.wait(5000);
        driver.manage().window().maximize();
    }
}
