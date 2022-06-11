package com.cydeo.test.day10_UtilitiesAndWindows;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.CRMUtilities;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T01_IframeCRMAppreciationTest extends TestBase {



    @Test
    public void sendingAppreciationMessage(){

        Faker faker = new Faker();
        String testMessage = faker.name().toString();
        System.out.println(testMessage);

        CRMUtilities.crm_login(driver);
        // 04- Click the MORE tab and select APPRECIATION
        WebElement moreBttn = driver.findElement(By.cssSelector("span[id*='link-text']"));
        moreBttn.click();
        WebElement appreciationBttn = driver.findElement(By.xpath("//span[.='Appreciation']"));
        appreciationBttn.click();
        // 05- Write an Appreciation message
        driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));
        driver.findElement(By.tagName("body")).sendKeys(testMessage);
        // 06- Click the SEND button
        driver.switchTo().defaultContent();
        WebElement sendButton = driver.findElement(By.id("blog-submit-button-save"));
        sendButton.click();
        // 07- Verify the Appreciation message is displayed on the feed
        driver.navigate().refresh();
        WebElement Output = driver.findElement(By.xpath("//div[starts-with(text(),'" +testMessage.substring(0,5)+ "')]"));
        String textOutput = Output.getText();
        Assert.assertEquals(textOutput, testMessage, "CRM APPRECIATION TEST: FAILED");
    }
}
// 01- Open a Chrome browser
// 02- Go to: https://login2.nextbasecrm.com/
// 03- Login Homepage ( Login with valid username and password)
// 04- Click the MORE tab and select APPRECIATION
// 05- Write an Appreciation message
// 06- Click the SEND button
// 07- Verify the Appreciation message is displayed on the feed