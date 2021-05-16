package com.bjss.stepDefinitions;

import com.bjss.pages.ChallengingPage;
import com.bjss.pages.MainPage;
import com.bjss.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChallagingDefs {
    WebDriver driver;
    String firstBlueId;
    String firstRedId;
    String firstGreenId;
    String secondBlueId;
    String secondRedId;
    String secondGreenId;
    @Given("user Navigate to {string}")
    public void user_Navigate_to(String url) {
        Driver.get().get(url);
    }

    @When("user click to {string}")
    public void user_click_to(String page) {
        new MainPage().navigateToPage(page);

    }

    @When("take the blue,red and green button ids")
    public void take_the_blue_red_and_green_button_ids() {
        ChallengingPage challengingPage =new ChallengingPage();
        firstBlueId = challengingPage.blueButton.getAttribute("id");
        firstRedId = challengingPage.redButton.getAttribute("id");
        firstGreenId = challengingPage.greenButton.getAttribute("id");
    }

    @When("click red button")
    public void click_red_button() {
       new ChallengingPage().redButton.click();
    }

    @When("take the buttons id again")
    public void take_the_buttons_id_again() {
        ChallengingPage challengingPage =new ChallengingPage();
        secondBlueId = challengingPage.blueButton.getAttribute("id");
        secondRedId = challengingPage.redButton.getAttribute("id");
        secondGreenId = challengingPage.greenButton.getAttribute("id");

    }

    @Then("the first button ids and second button ids should be different")
    public void the_first_button_ids_and_second_button_ids_should_be_different() {
        Assert.assertFalse(firstBlueId.equals(secondBlueId));
        Assert.assertFalse(firstRedId.equals(secondRedId));
        Assert.assertFalse(firstGreenId.equals(secondGreenId));
    }
}
