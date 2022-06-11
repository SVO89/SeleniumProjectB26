package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRMUtilities {
    public static void crm_login (WebDriver driver){
        // Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");
        // Login Homepage ( Login with valid username and password)
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk1@cybertekschool.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loginBttn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBttn.click();
    }
    public static void crm_login (WebDriver driver, String username, String password){
        // Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");
        // Login Homepage ( Login with valid username and password)
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);
        WebElement loginBttn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBttn.click();
    }
}
// TC : Create utility methods for CRM_Utilities class
// 01. Create a new method for login
// 02. Create a method to make CRM Login test logic re-usable
// 03. When method is called, it should simply login
//        This method should have at least 2 overloaded versions.
//        Method #1 info:
//        • Name: login_crm()
//        • Return type: void
//        • Arg1: WebDriver
//        Method #2 info:
//        • Name: login_crm()
//        • Return type: void
//        • Arg1: WebDriver
//        • Arg2: String username
//        • Arg3: String password