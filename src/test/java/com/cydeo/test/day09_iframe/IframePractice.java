package com.cydeo.test.day09_iframe;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframePractice extends TestBase {
    @Test
    public void iframeTest(){
        // 02- Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
        // NoSuchElementException comes with reasons: 01.- Not locating the element correctly.
        //                                            02.- There is an iFrame and you have to switch to frame to locate.
        // 03- Clear text from comment body.
        WebElement commentBody = driver.findElement(By.xpath("tinymce"));
        // We can use frame(id) method with id arg.
        driver.switchTo().frame("mce_0_ifr");
        // We can use frame locator.
        driver.switchTo().frame(driver.findElement(By.xpath("")));
        // We can use
    }
}
// TC #6: Iframe Task
// 01- Open a chrome browser
// 02- Go to: https://practice.cydeo.com/iframe
// 03- Clear text from comment body
// 04- Type "Hello World" in comment body
// 05- Verify "Hello World" text is written in comment body
// 06- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed