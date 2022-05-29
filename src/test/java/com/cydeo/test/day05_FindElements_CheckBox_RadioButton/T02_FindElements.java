package com.cydeo.test.day05_FindElements_CheckBox_RadioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T02_FindElements {
    public static void main(String[] args) {

        // 1- Open a Chrome browser.
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Providing extra time for driver before it throws NoSuchElementException
        // 2- Go to: https://practice.cydeo.com/abtest.
        driver.get("https://practice.cydeo.com/abtest");
        // 3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        // 4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());
        // 5- Print out the texts of the links.
        for (int i = 0; i < allLinks.size(); i++){
            String linkText = allLinks.get(i).getText();
            System.out.println("linkText = " + linkText);
        }
        for (WebElement eachLink : allLinks) {
            System.out.println("eachLink.getText() = " + eachLink.getText());
            System.out.println("eachLink.getAttribute(\"href\") = " + eachLink.getAttribute("href"));
        }

        driver.quit();
    }
}


// 6- Print out the HREF attribute values of the links