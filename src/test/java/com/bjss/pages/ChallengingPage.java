package com.bjss.pages;

import com.bjss.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingPage {

    public ChallengingPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[@class='button']")
    public WebElement blueButton;

    @FindBy(xpath = "//a[@class='button alert']")
    public WebElement redButton;

    @FindBy(xpath = "//a[@class='button success']")
    public WebElement greenButton;

}
