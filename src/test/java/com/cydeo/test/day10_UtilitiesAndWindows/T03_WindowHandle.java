package com.cydeo.test.day10_UtilitiesAndWindows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T03_WindowHandle extends TestBase {
    @Test
    public void windowHandleTest(){
        // 02. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        // 03. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle,expectedTitle, "WINDOWS TEST : FAILED");
        // 04. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();
        // 05. Switch to new Window.
        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String each : allWindowsHandles){
            // window handle 1 - main window
            // window handle 2 - 2nd window
            driver.switchTo().window(each);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
        // 06. Assert: Title is “New Window”
        String expectedTitle2 = "New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle2, "NEW WINDOW TITLE TEST : FAILED");
    }
}
// 01. Open a chrome browser
// 02. Go to : https://practice.cydeo.com/windows
// 03. Assert: Title is “Windows”
// 04. Click to: “Click Here” link
// 05. Switch to new Window.
// 06. Assert: Title is “New Window”