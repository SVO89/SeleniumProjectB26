package com.cydeo.test.day16_ActionsAndJavaScriptExecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.sql.Driver;

public class TC02_ActionsScroll {
    @Test
    public void actionsScrollTest(){
        //    1- Open a chrome browser
        //    2- Go to: https://practice.cydeo.com/
    //    Driver.getDriver().get(ConfigurationReader.getProperty("practice.page.url"));
        //    3- Scroll down to “Powered by CYDEO”
    //    WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        //    4- Scroll using Actions class “moveTo(element)” method
    //    Actions actions = new Actions(Driver.getDriver());
    //    actions.moveToElement(cydeoLink).perform();

        //    1- Continue from where the Task 4 is left in the same test.
        //    2- Scroll back up to “Home” link using PageUP button
    //    WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
    //    actions.moveToElement(homeLink).perform();
    }
}
