package com.cydeo.test.day00_UITestShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short18_HowToHandleCheckBox {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("Before checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("After: checkbox1.isSelected() = " + checkbox1.isSelected());


        System.out.println("-------------------------------------------");

        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("Before checkbox2.getAttribute() = " + checkbox1.getAttribute("checked"));
        checkbox2.click();
        System.out.println("After: checkbox2.getAttribute() = " + checkbox1.getAttribute("checked"));

        if (checkbox1.isSelected() && !checkbox2.isSelected()){
            System.out.println("Checkbox test PASSED");
        }else{
            System.out.println("Checkbox test FAILED");
        }
        driver.quit();
    }
}