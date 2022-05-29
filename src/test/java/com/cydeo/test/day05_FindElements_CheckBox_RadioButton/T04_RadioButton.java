package com.cydeo.test.day05_FindElements_CheckBox_RadioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T04_RadioButton {
    public static void main(String[] args) {

        // 1. Open Chrome browser.
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons ");
        // 3. Click to “Hockey” radio button.
        WebElement hokeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hokeyRadioButton.click();
        // 4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("hokeyRadioButton.isSelected() = " + hokeyRadioButton.isSelected());
        // 5. Locate Green button.
        WebElement greenButton = driver.findElement(By.xpath("//input[@id='green']"));
        // 6. Verify if it is enabled.
        System.out.println("greenButton.isEnabled() = " + greenButton.isEnabled());
        driver.quit();
    }
}