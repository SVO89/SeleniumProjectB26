package com.cydeo.test.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        // 01 Open Chrome browser.

    }
}
