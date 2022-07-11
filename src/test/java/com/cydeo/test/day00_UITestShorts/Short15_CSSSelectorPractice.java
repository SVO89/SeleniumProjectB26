package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Short15_CSSSelectorPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("CYDEO" + Keys.ENTER);

        WebElement cydeoText = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']>h3"));
        if (cydeoText.getText().equals("Cydeo")){
            System.out.println("Cydeo link test PASSED");
        }else{
            System.out.println("Cydeo link test FAILED");
        }
        driver.quit();
    }
}
