package com.automation.steps;

import com.automation.pages.AirbnbYourHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AirbnbYourHomeSteps {
    AirbnbYourHomePage airbnbYourHomePage;

    public AirbnbYourHomeSteps() {

        this.airbnbYourHomePage = new AirbnbYourHomePage(PlaywrightDriver.getPage());
    }

    @Then("verify Airbnb your home is displayed with text {string}")
    public void verify_airbnb_your_home_is_displayed_with_text(String message) {

        Assert.assertTrue(airbnbYourHomePage.verifyAirbnbYourHomeMessage(message));

    }

    @When("user uses slider")
    public void userUsesSlider() {
        airbnbYourHomePage.slideSlider();
    }

    @Then("verify the price is changing")
    public void verifyThePriceIsChanging() {
        Assert.assertTrue(airbnbYourHomePage.verifyPriceChange());

    }
}
