package com.cydeo.test.day07_TestNG_DropdownAlertiFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T02_StateDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        // Open Chrome browser.
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //  Provide extra time before it throws No

        // 02. Go to: http://practice.cydeo.com/dropdown
        driver.get("http://practice.cydeo.com/dropdown");
    }
    @Test
    public void stateDropdownTest() throws InterruptedException {
        Select stateDropdown = new Select(driver.findElement(By.id("state")));
        // 03. Select "Illinois" with selectByValue().
        stateDropdown.selectByValue("IL");
        Thread.sleep(3000);
        // 04. Select "Virginia" by selectByVisibleText().
        stateDropdown.selectByVisibleText("Virginia");
        Thread.sleep(3000);
        // 05. Select California.
        stateDropdown.selectByIndex(5);
        Thread.sleep(3000);
        // 06. Verify final selection in California.
        String actualStateOption = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateOption = "CalLifornia";
        Thread.sleep(3000);
        Assert.assertEquals(actualStateOption, expectedStateOption, "SELECTED STATE TEST : FAIL");
        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "CaLlifornia", "SELECTED STATE TEST : FAILED");
        // Use al Select options (visible, text, value).
    }
    @Test
    public void selectLanguageTest() throws InterruptedException {
        Select languages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        System.out.println("languages.isMultiple() = " + languages.isMultiple());

        Thread.sleep(3000);
        languages.selectByIndex(3);
        Thread.sleep(3000);
        languages.selectByValue("java");
        Thread.sleep(3000);
        languages.selectByVisibleText("C#");

        for(WebElement each: languages.getOptions()){
            each.click();
            Thread.sleep(3000);
            System.out.println("each.getText() = " + each.getText());
        }
        Thread.sleep(3000);
        languages.deselectAll();
    }
}
