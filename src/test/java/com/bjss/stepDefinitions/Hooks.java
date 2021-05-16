package com.bjss.stepDefinitions;


import com.bjss.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    @Before
    public void setup(){
        Driver.get().manage().window().maximize();

    }

    @After
    public void after(){
        Driver.closeDriver();
    }
}
