package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomeSteps {

    HomePage homePage=new HomePage();

    @Given("user opens website")
    public void userOpensWebsite() {
        homePage.openWebsite();
    }

    @Then("verify user is on homepage")
    public void verifyUserIsOnHomepage() {
        assertThat(homePage.verifyOnHomePage()).isVisible();
    }

    @When("user clicks on where")
    public void userClicksOnWhere() {
        homePage.clickOnWhere();
    }

    @Then("user selects destination by {string}")
    public void userSelectsDestinationBy(String region) {
        homePage.selectRegion(ConfigReader.getValue(region));
    }

    @Then("select check in and check out date")
    public void selectCheckInAndCheckOutDate() {
        homePage.selectCheckInDate();
        homePage.selectCheckOutDate();
    }

    @Then("select number of people")
    public void selectNumberOfPeople() {
        homePage.selectNumberOfPeople();
    }



    @When("user clicks on experiences")
    public void userClicksOnExperiences() {
        homePage.clickOnExperiences();
    }

    @And("select dates")
    public void selectDates() {
        homePage.selectDatesOfExperiences();
    }

    @When("user clicks on global icon")
    public void userClicksOnGlobalIcon() {
        homePage.clickOnGlobalIcon();
    }

    @When("user clicks on language")
    public void userClicksOnLanguage() {
        homePage.selectLanguage();
    }

    @Then("user types location {string} in the search destination field")
    public void userTypesLocationInTheSearchDestinationField(String destination) {
        homePage.searchDestinationInStays(destination);
    }

    @When("user clicks on destination")
    public void userClicksOnDestination() {
        homePage.clickOnLocationInStaysSearch();
    }

    @When("user clicks on Airbnb your home")
    public void userClicksOnAirbnbYourHome() {
        homePage.clickOnAirbnbYourHome();
    }

    @When("user clicks on {string}")
    public void userClicksOn(String location) {
        homePage.clickOnBeachfront(location);
    }

    @And("user clicks on the Show map")
    public void userClicksOnTheShowMap() {
        homePage.clickOnShowMap();
    }

    @When("user clicks on the Display total before taxes")
    public void userClicksOnTheDisplayTotalBeforeTaxes() {
        homePage.clickOnBeforeTax();
    }

    @And("user selects currency")
    public void userSelectsCurrency() {
        homePage.clickOnCurrency();
    }

    @When("user selects Meet your Host option")
    public void userSelectsMeetYourHostOption() {
        homePage.selectMeetYourHost();
    }


    @And("user clicks on profile icon")
    public void userClicksOnProfileIcon() {
        homePage.profileIconSelection();
    }

    @When("user clicks on the help centre option")
    public void userClicksOnTheHelpCentreOption() {
        homePage.clicksOnHelpCentre();
    }

    @When("user clicks on things to do")
    public void userClicksOnThingsToDo() {
        homePage.clicksOnThingsToDo();
    }

    @Then("user selects destination")
    public void userSelectsDestination() {
        homePage.clickOnDestination();
    }

    @When("user clicks on filter")
    public void userClicksOnFilter() {
        homePage.clickOnFilterOption();
    }

    @Then("user selects filter by Entire home")
    public void userSelectsFilterByEntireHome() {
        homePage.clickOnEntireHome();
    }

    @And("user selects filter by Price Range")
    public void userSelectsFilterByPriceRange() {
        homePage.clickOnPriceFilter();
    }


    @When("user clicks on the next in card image")
    public void userClicksOnTheNextInCardImage() {
        homePage.clickOnNextCardImage();
    }

    @And("user enters minimum price {string} and maximum price {string}")
    public void userEntersMinimumPriceAndMaximumPrice(String min, String max) {
        homePage.enterFilterMinimumPrice(min);
        homePage.enterFilterMaximumPrice(max);
    }

    @And("user selects {string} bedrooms and {string} beds")
    public void userSelectsBedroomsAndBeds(String bedroomsCount, String bedsCount) {
        homePage.increaseBedroomCount(Integer.parseInt(bedroomsCount));
        homePage.increaseBedCount(Integer.parseInt(bedsCount));
    }


    @And("select the currency")
    public void selectTheCurrency() {
        homePage.clickOnNewCurrency();
    }


    @And("user selects guest favourites in Top-tier stays")
    public void userSelectsGuestFavouritesInTopTierStays() {
        homePage.clickOnFavourite();
    }

    @And("user selects Wifi in Amenities")
    public void userSelectsWifiInAmenities() {
        homePage.clickOnWifi();
    }

    @And("user selects Instant Book in Booking options")
    public void userSelectsInstantBookInBookingOptions() {
        homePage.clickOnInstantBook();
    }

    @And("user selects Hotel Property type")
    public void userSelectsHotelPropertyType() {
        homePage.clickOnHotel();
    }

    @And("user selects filter by Accessibility features")
    public void userSelectsFilterByAccessibilityFeatures() {
        homePage.clickOnAccessibility();
    }

    @And("user selects language English in filter")
    public void userSelectsLanguageEnglishInFilter() {
        homePage.clickOnLanguage();
    }

    @Then("user clicks on show")
    public void userClicksOnShow() {
        homePage.clickOnShow();
    }

    @When("user click on {string}")
    public void userClickOn(String location) {
        homePage.clickOnFarm(location);
    }

    @When("user click on search button")
    public void userClickOnSearchButton() {
        homePage.clickOnSearch();
    }
}
