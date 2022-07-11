package com.cydeo.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class CYDEOPracticePage {
    @FindBy(id="draggable")
    public WebElement smallCircle;

    @FindBy (id="droptarget")
    public WebElement bigCircle;

    public CYDEOPracticePage(){
      //  PageFactory.initElements(Driver.getDriver(), this);
    }
}
