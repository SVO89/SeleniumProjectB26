package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short09_FindElementByClassName {

    public static void main (String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        WebElement howSearchWorks = driver.findElement(By.xpath("//a[contains(text(), \'How Search works\')]"));
        if (howSearchWorks.getText().equals("How Search works")){
            System.out.println("Text appears correctly");
        }else{
            System.out.println("text does not appear correctly");
        }
        driver.quit();
    }
}
