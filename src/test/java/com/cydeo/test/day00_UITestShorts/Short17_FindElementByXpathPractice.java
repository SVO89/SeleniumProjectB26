package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short17_FindElementByXpathPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("CYDEO" + Keys.ENTER);

        WebElement cydeoText = driver.findElement(By.xpath("//h3[.='Cydeo']"));
        if (cydeoText.getText().equals("Cydeo")){
            System.out.println("Cydeo text test PASSED");
        }else{
            System.out.println("Cydeo text test FAILED");
        }
        driver.quit();
    }
}