package com.automation.steps;

import com.automation.pages.ThingsToDoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ThingsToDoSteps {
    ThingsToDoPage thingsToDoPage=new ThingsToDoPage();
    @When("user search is performed")
    public void userSearchIsPerformed() {
        thingsToDoPage.clickOnSearch();
    }

    @And("user selects first card")
    public void userSelectsFirstCard() {
        thingsToDoPage.clickOnFistCard();
    }

    @Then("verify displayed details with the text")
    public void verifyDisplayedDetailsWithTheText() {
        assertThat(thingsToDoPage.verifyWithText()).containsText("What you'll do");
    }
}
