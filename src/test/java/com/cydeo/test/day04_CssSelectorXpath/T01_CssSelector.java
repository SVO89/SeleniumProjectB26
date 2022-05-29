package com.cydeo.test.day04_CssSelectorXpath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T01_CssSelector {
    public static void main(String[] args) {

        // TC #1: XPATH and cssSelector Practices
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com/forgot_password .
        driver.get("https://practice.cydeo.com/forgot_password");

        // 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        // a. “Home” link.
        // Locate homeLink using cssSelector, class value.
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        // Locate homeLink using cssSelector, href value.
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[href='/'"));
        // Locate homeLink using cssSelector, using syntax for class attribute "." .
        WebElement homeLink3 = driver.findElement(By.cssSelector("a.nav-link"));

        // Locate homeLink using xpath by text of element.
        WebElement homeLink4 = driver.findElement(By.xpath("//a[.='Home']"));
        // Locate homeLink using xpath by text of element.
        WebElement homeLink5 = driver.findElement(By.xpath("//a[@class='nav-link']"));

        // b. “Forgot password” header
        // Locate forgotPassword using cssSelector,
        WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[id='content']>div[class='example']>h2"));
        // Or
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));
        // Locate forgotPassword using  xpath selector
        WebElement forgotPassword4 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        // c. “E-mail” text.
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        // Locate email text using xpath
        WebElement emailText2 = driver.findElement(By.xpath("//label[@for='email']"));

        // d. E-mail input box.
        WebElement emailTextInput = driver.findElement(By.cssSelector("input[name='email']"));
        // Locate E-mail input box using xpath.
        WebElement emailTextInput2 = driver.findElement(By.cssSelector("//input[@name='email']"));


        // e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button#form_submit"));

        // f. “Powered by Cydeo text
        WebElement cydeoText = driver.findElement(By.cssSelector("a[target='_blank']"));

        // 4. Verify all web elements are displayed.
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("homeLink2.isDisplayed() = " + homeLink2.isDisplayed());
        System.out.println("homeLink3.isDisplayed() = " + homeLink3.isDisplayed());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
        System.out.println("forgotPassword2.isDisplayed() = " + forgotPassword2.isDisplayed());
        System.out.println("emailTextInput.isDisplayed() = " + emailTextInput.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("cydeoText.isDisplayed() = " + cydeoText.isDisplayed());
    }
}
