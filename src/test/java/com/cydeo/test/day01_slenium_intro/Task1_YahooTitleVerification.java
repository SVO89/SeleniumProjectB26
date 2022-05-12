package com.cydeo.test.day01_slenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {
//      1. Setting up WebDriver manager.
        WebDriverManager.chromedriver().setup();
//      2. Create instance WebDriver.
        WebDriver driver = new ChromeDriver();
//      3. Maximizing window.
        driver.manage().window().maximize();
//      4. Sending browser to yahoo.com.
        driver.get("https://www.yahoo.com");
//      5. Storing the title to a string for comparison.
        String title = driver.getTitle();
//      6. Expected title.
        String expectedTitle = "Yahoo";

        if(title.contains(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }driver.quit();
    }
}
