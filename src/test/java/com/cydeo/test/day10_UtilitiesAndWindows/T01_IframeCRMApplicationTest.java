package com.cydeo.test.day10_UtilitiesAndWindows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T01_IframeCRMApplicationTest extends TestBase {

    @Test
    public void sendingAppreciationMessage(){

        // 02- Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");
        // 03- Login Homepage ( Login with valid username and password)
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk1@cybertekschool.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        username.sendKeys("UserUser");
        WebElement loginBttn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBttn.click();
        // 04- Click the MORE tab and select APPRECIATION
        WebElement moreBttn = driver.findElement(By.cssSelector("span[id*='link-text']"));
        moreBttn.click();
        WebElement appreciationBttn = driver.findElement(By.cssSelector("//span[.='Appreciation']"));
        appreciationBttn.click();
        // 05- Write an Appreciation message
        driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));
        driver.findElement(By.tagName("body")).sendKeys("Test Message 123");
        // 06- Click the SEND button
        driver.switchTo().defaultContent();

        // 07- Verify the Appreciation message is displayed on the feed

    }
}
// 01- Open a Chrome browser
// 02- Go to: https://login2.nextbasecrm.com/
// 03- Login Homepage ( Login with valid username and password)
// 04- Click the MORE tab and select APPRECIATION
// 05- Write an Appreciation message
// 06- Click the SEND button
// 07- Verify the Appreciation message is displayed on the feed