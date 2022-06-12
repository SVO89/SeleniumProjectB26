package com.cydeo.test.day11_;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T02_WebTablePractice extends TestBase {

    @Test
    public void orderNameVerifyTest(){
        // 01. Goto : https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
        // 02. Verify Bob’s name is listed as expected. Expected: “Bob Martin”
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String actualBobName = bobMartinCell.getText();
        String expectedBobName = "Bob Martin";
        Assert.assertEquals(actualBobName, expectedBobName, "Bob name did not appear correctly!");
        // 03. Verify Bob Martin’s order date is as expected. Expected: 12/31/2021

    }
}
// TC #01: Web table practice
// 01. Goto : https://practice.cydeo.com/web-tables
// 02. Verify Bob’s name is listed as expected. Expected: “Bob Martin”
// 03. Verify Bob Martin’s order date is as expected. Expected: 12/31/2021