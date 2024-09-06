package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomeSteps {

    HomePage homePage = new HomePage();



    @Given("user opens website")
    public void userOpensWebsite() {
        homePage.openWebsite();
    }

    @And("verify user is on homepage")
    public void verifyUserIsOnHomepage() {
        assertThat(homePage.verifyOnHomePage()).isVisible();
    }

    @When("user clicks on things to do")
    public void userClicksOnThingsToDo() {
        homePage.clickOnThingsToDo();
    }

    @Then("user selects destination")
    public void userSelectsDestination() {
        homePage.clickOnDestination();
    }
}
