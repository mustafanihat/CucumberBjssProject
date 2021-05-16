package com.bjss.pages;

import com.bjss.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    public void navigateToPage(String page){
        WebElement element = Driver.get().findElement(By.linkText(page));
        element.click();
    }

}
