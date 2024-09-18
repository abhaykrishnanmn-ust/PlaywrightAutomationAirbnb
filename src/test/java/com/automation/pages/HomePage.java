package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage extends BasePage {

    Locator whereInput;
    Locator experiencesButton;
    Locator checkExperienceIsClicked;
    Locator staysSearchInputField;
    Locator clickOnRegion;
    Locator clickOnCheckInDate;
    Locator selectCheckInDate;
    Locator fetchCheckInDateFromUserInput;
    Locator selectCheckOutDate;
    Locator fetchCheckOutDateFromUserInput;
    Locator clickOnCheckOutDate;
    Locator clickOnAddGuest;
    Locator addAdults;
    Locator fetchNoOfPeoplesFromUserInput;
    Locator searchButton;
    Locator fetchUserInputExperienceDates;
    Locator homePageContent;
    Locator globeButton;
    Locator selectLanguageButton;
    Locator selectLanguage;
    Locator languageSelected;
    Locator staysInputSearchLocation;
    Locator airbnbYourHome;
    Locator selectBeachfront;
    Locator selectAmazingViews;
    Locator selectFarm;
    Locator showMapButton;
    Locator taxButton;
    Locator currencyButton;
    Locator messageHostButton;
    Locator hostProfileCard;
    Locator profileIcon;
    Locator helpCentre;
    Locator thingsToDo;
    Locator destination;
    Locator filterButton;
    Locator filterByEntireHome;
    Locator thingsToDoMessage;
    Locator slideNextImageButton;
    Locator slideImageElement;
    Locator totalPriceBeforePageIsDisplayed;
    Locator filterMinimumPriceButton;
    Locator filterMaximumPriceButton;
    Locator filterMinimumPriceInput;
    Locator filterMaximumPriceInput;
    Locator bedroomCountButton;
    Locator bedCountButton;
    Locator currencyOptions;
    Locator newCurrency;
    Locator currencyVerification;
    Locator wifi;
    Locator instantBook;
    Locator favourite;
    Locator hotel;
    Locator propertyType;
    Locator accessibility;
    Locator stepFreeGuestOption;
    Locator parking;
    Locator grabBar;
    Locator hostLanguage;
    Locator hostLanguageSelect;
    Locator show;
    Locator currencyDisplayedOnFooter;
    Locator meetYourHostName;
    Locator aboutMeetYourHost;
    Locator cardPageGuestFavourite;
    Locator bedroomCount;
    Locator cardPageFilterPrice;
    Locator bedCount;

    public HomePage() {

        whereInput = page.locator("//label[@for='bigsearch-query-location-input']");
        experiencesButton = page.locator("//button[@id='search-block-tab-EXPERIENCES']");
        checkExperienceIsClicked = page.locator("//div[text()='Date']");
        staysSearchInputField = page.locator("//input[@id='bigsearch-query-location-input']");
        clickOnRegion = page.locator("//span[text()='Europe']/preceding-sibling::img");
        clickOnCheckInDate = page.locator("//div[text()='Check in']");
        selectCheckInDate = page.locator("//h2[text()='September 2024']/ancestor::div/table//tr/td[contains(@aria-label,'18')]");
        fetchCheckInDateFromUserInput = page.locator("//div[text()='Check in']/following-sibling::div");
        selectCheckOutDate = page.locator("//h2[text()='September 2024']/ancestor::div/table//tr/td[contains(@aria-label,'19')]");
        fetchCheckOutDateFromUserInput = page.locator("//div[text()='Check out']/following-sibling::div");
        clickOnCheckOutDate = page.locator("//div[text()='Check out']");
        clickOnAddGuest = page.locator("//div[text()='Add guests']/parent::div");
        addAdults = page.locator("//h1[@id='searchFlow-title-label-adults']/ancestor::section/following-sibling::div/button[2]");
        fetchNoOfPeoplesFromUserInput = page.locator("//div[text()='Who']/following-sibling::div");
        searchButton = page.locator("//button[@data-testid='structured-search-input-search-button']");
        fetchUserInputExperienceDates = page.locator("//div[text()='Date']/following-sibling::div");
        homePageContent = page.locator("//span[text()]/ancestor::label").first();
        globeButton = page.locator("//div[@class='_pvfq6t']/button");
        selectLanguageButton = page.locator("//button[text()='Language and region']");
        selectLanguage = page.locator("//div[text()='Dansk']/..");
        languageSelected = page.locator("//a[@class='_ci5ckgc']/div");
        staysInputSearchLocation = page.locator("//div[contains(text(),'Bali')]");
        airbnbYourHome = page.locator("//nav[@aria-label='Profile']/div/a");
        selectBeachfront = page.locator("//span[text()='Beachfront']/ancestor::label");
        selectAmazingViews = page.locator("//span[text()='Amazing views']/ancestor::label");
        selectFarm = page.locator("//span[text()='Farms']/ancestor::label");
        showMapButton = page.locator("//span[text()='Show map']/ancestor::button");
        taxButton = page.locator("//button[@role='switch']/div");
        currencyButton = page.locator("//button[@id='tab--language_region_and_currency--1']");
        messageHostButton = page.locator("//a[text()='Message Host']");
        hostProfileCard = page.locator("//a[@aria-label='Go to Host full profile']");
        profileIcon = page.locator("//div[@class='_3hmsj']//child::button");
        helpCentre = page.locator("//div[@data-testid='simple-header-profile-menu']//a[4]");
        thingsToDo = page.locator("//button[@id='tab--seo-link-section-tabbed-dense-grid--7']");
        destination = page.locator("//div[@id=\"panel--seo-link-section-tabbed-dense-grid--7\"]/ul/li[13]/a/span[1]");
        filterButton = page.locator("//button[@data-testid='category-bar-filter-button']");
        filterByEntireHome = page.locator("//span[text()='Entire home']/..");
        thingsToDoMessage = page.locator("//div[@data-section-id='DESCRIPTION_DEFAULT']//h2/div");
        slideNextImageButton = page.locator("//span[@class='isqgmsg dir dir-ltr']/ancestor::button[contains(@aria-label,'Next photo:')]");
        slideImageElement = page.locator("//div[@role='img']");
        totalPriceBeforePageIsDisplayed = page.locator("//span[@class='_1w7bwz8']");
        filterMinimumPriceButton = page.locator("//button[@aria-label='Minimum Price']");
        filterMaximumPriceButton = page.locator("//button[@aria-label='Maximum Price']");
        filterMinimumPriceInput = page.locator("//input[@id='price_filter_min']");
        filterMaximumPriceInput = page.locator("//input[@id='price_filter_max']");
        bedroomCountButton = page.locator("//button[@data-testid='stepper-filter-item-min_bedrooms-stepper-increase-button']");
        bedCountButton = page.locator("//button[@data-testid='stepper-filter-item-min_beds-stepper-increase-button']");
        currencyOptions = page.locator("//h2[@elementtiming='LCP-target']");
        newCurrency = page.locator("//div[text()='SAR – SR']");
        currencyVerification = page.locator("//span[text()='Choose a currency']//descendant-or-self::span");
        wifi = page.locator("//button[@id='filter-item-amenities-4']");
        instantBook = page.locator("//button[@id='filter-item-ib']");
        favourite = page.locator("//span[text()='The most loved homes on Airbnb']");
        hotel = page.locator("//span[text()='Hotel']");
        propertyType = page.locator("//h2[text()='Property type']");
        accessibility = page.locator("//h2[text()='Accessibility features']");
        stepFreeGuestOption = page.locator("//input[@name='Step-free guest entrance']");
        parking = page.locator("//div[text()='Accessible parking spot']");
        grabBar = page.locator("//div[text()='Toilet grab bar']");
        hostLanguage = page.locator("//h2[@id='filter-section-heading-id-FILTER_SECTION_CONTAINER:HOST_LANGUAGE']");
        hostLanguageSelect = page.locator("//div[text()='English']");
        show = page.locator("//div[@class='ptiimno atm_7l_1p8m8iw dir dir-ltr']");
        currencyDisplayedOnFooter = page.locator("//div[@class='_3qymq']/preceding-sibling::div//span[2]/button/span[3]");
        meetYourHostName = page.locator("//div[@data-section-id='MEET_YOUR_HOST']//h3//span");
        aboutMeetYourHost = page.locator("//div[@data-testid='user-profile-content']//span");
        cardPageGuestFavourite = page.locator("//div[@data-section-id='GUEST_FAVORITE_BANNER']");
        bedroomCount = page.locator("//li[contains(text(),'bedrooms')]");
        cardPageFilterPrice = page.locator("//div[@data-section-id='BOOK_IT_SIDEBAR']//span/div/following-sibling::span");
        bedCount = page.locator("//li[contains(text(),'beds')]");
    }

    public void openWebsite() {
        page.navigate(ConfigReader.getValue("application.url"));
    }

    public Locator verifyOnHomePage() {
        return homePageContent;
    }

    public void clickOnWhere() {
        while (!clickOnRegion.isVisible()) {
            whereInput.click();
        }
    }

    public void selectRegion(String region) {
        clickOnRegion.click();
    }

    public void selectCheckInDate() {
        clickOnCheckInDate.click();
        selectCheckInDate.click();
        String userCheckInDate = fetchCheckInDateFromUserInput.textContent().split(" ")[0];
        ConfigReader.setValue("check.in.date", userCheckInDate);
    }

    public void selectCheckOutDate() {
        selectCheckOutDate.click();
        String userCheckOutDate = fetchCheckOutDateFromUserInput.textContent().split(" ")[0];
        ConfigReader.setValue("check.out.date", userCheckOutDate);
    }

    public void selectNumberOfPeople() {
        clickOnAddGuest.click();
        addAdults.click();
        String noOfPeopleByUserInput = fetchNoOfPeoplesFromUserInput.textContent().split("&")[0];
        ConfigReader.setValue("no.of.persons", noOfPeopleByUserInput);
    }

    public void clickOnSearch() {
        searchButton.click();
    }

    public void clickOnExperiences() {
        while (!checkExperienceIsClicked.isVisible()) {
            experiencesButton.click();
            System.out.println("clicked");
        }
    }

    public void selectDatesOfExperiences() {
        selectCheckInDate.click();
        selectCheckOutDate.click();
        String userInputExperienceDates = fetchUserInputExperienceDates.textContent().split(" - ")[0] +
                " " + fetchUserInputExperienceDates.textContent().split(" ")[3];
        ConfigReader.setValue("experiences.dates", userInputExperienceDates);
    }

    public boolean isHomePageDisplayed() {
        return homePageContent.isVisible();
    }

    public void clickOnGlobalIcon() {
        globeButton.click();
    }

    public boolean verifyLanguageIsDisplayed() {
        return selectLanguageButton.isVisible();
    }

    public void selectLanguage() {
        selectLanguage.click();
    }

    public boolean verifyLanguageIsChanged() {
        return languageSelected.textContent().contains(ConfigReader.getValue("language"));
    }

    public void searchDestinationInStays(String destination) {
        staysSearchInputField.fill(destination);
    }

    public void clickOnLocationInStaysSearch() {
        staysInputSearchLocation.click();
    }

    public void clickOnAirbnbYourHome() {
        airbnbYourHome.click();
    }

    public void clickOnBeachfront(String location) {
        if (location.equals("Amazing views")) {
            selectAmazingViews.click();
        } else if (location.equals("Beachfront")) {
            selectBeachfront.click();
        } else {
            selectFarm.click();
        }
    }

    public void clickOnShowMap() {
        showMapButton.click();
    }

    public void clickOnBeforeTax() {
        taxButton.click();
    }

    public void clickOnCurrency() {
        currencyButton.click();
    }

    public void selectMeetYourHost() {
        messageHostButton.scrollIntoViewIfNeeded();
        ConfigReader.setValue("meet.your.host.name", meetYourHostName.textContent());
        hostProfileCard.click();
    }

    public boolean verifyDisplayedDetailsOfHost() {
        return aboutMeetYourHost.textContent().contains(ConfigReader.getValue("meet.your.host.name"));
    }

    public void profileIconSelection() {
        profileIcon.click();
    }

    public void clickOnHelpCentre() {
        helpCentre.click();
    }

    public void clickOnThingsToDo() {
        thingsToDo.click();
    }

    public void clickOnDestination() {
        destination.click();
    }

    public void clickOnFilterOption() {
        filterButton.click();
    }

    public void clickOnEntireHome() {
        filterByEntireHome.scrollIntoViewIfNeeded();
        filterByEntireHome.click();
    }

    public void clickOnPriceFilter() {
        // Implement price filter functionality
    }

    public boolean verifyThingsToDoMessage(String message) {
        thingsToDo.scrollIntoViewIfNeeded();
        return thingsToDoMessage.textContent().contains(message);
    }

    public void clickOnNextCardImage() {
        slideNextImageButton.scrollIntoViewIfNeeded();
        slideNextImageButton.click();
    }

    public boolean verifySlidingImage(String page) {
        return slideImageElement.isVisible() && slideImageElement.getAttribute("aria-label").contains(page + " of");
    }

    public boolean isTotalPriceBeforePageIsDisplayed() {
        return totalPriceBeforePageIsDisplayed.isVisible() &&
                totalPriceBeforePageIsDisplayed.textContent().contains("total before taxes");
    }

    public void selectFilterMinimumPrice() {
        filterMinimumPriceButton.scrollIntoViewIfNeeded();
        // Implement slider functionality to set minimum price
    }

    public void selectFilterMaximumPrice() {
        // Implement slider functionality to set maximum price
    }

    public void enterFilterMinimumPrice(String min) {
        filterMinimumPriceInput.click();
        filterMinimumPriceInput.fill(min);
    }

    public void enterFilterMaximumPrice(String max) {
        filterMaximumPriceInput.click();
        filterMaximumPriceInput.fill(max);
    }

    public void increaseBedroomCount(int bedroomsCount) {
        bedroomCountButton.scrollIntoViewIfNeeded();
        for (int i = 0; i < bedroomsCount; i++) {
            bedroomCountButton.click();
        }
    }

    public void increaseBedCount(int bedsCount) {
        for (int i = 0; i < bedsCount; i++) {
            bedCountButton.click();
        }
    }

    public void lineOnCurrency() {
        currencyOptions.isVisible();
    }

    public void clickOnNewCurrency() {
        ConfigReader.setValue("new.currency", newCurrency.textContent());
        newCurrency.click();
    }

    public void clickOnWifi() {
        wifi.click();
    }

    public void clickOnInstantBook() {
        instantBook.click();
    }

    public void clickOnFavourite() {
        favourite.click();
    }

    public void clickOnHotel() {
        propertyType.click();
        hotel.click();
    }

    public void clickOnAccessibility() {
        accessibility.click();
        parking.click();
    }

    public void clickOnLanguage() {
        hostLanguage.click();
        hostLanguageSelect.click();
    }

    public void clickOnShow() {
        show.click();
    }

    public boolean verifyCurrency() {
        currencyDisplayedOnFooter.scrollIntoViewIfNeeded();
        return ConfigReader.getValue("new.currency").contains(currencyDisplayedOnFooter.textContent());
    }

    public void clicksOnHelpCentre() {helpCentre.click();
    }

    public void clicksOnThingsToDo() {
        thingsToDo.click();
    }

    public void clickOnFarm(String location) {
        if (location.equals("Amazing views")) {
            selectAmazingViews.click();
        } else if (location.equals("Beachfront")) {
            selectBeachfront.click();
        } else {
            selectFarm.click();
        }
    }

    public boolean verifyGuestFavourite() {
        return cardPageGuestFavourite.isVisible();
    }

    public boolean verifyFilterBedroomCount() {
        int pageBedroomCount=Integer.parseInt(bedroomCount.textContent().substring(3,4));
        int passedBedroomCount=Integer.parseInt(ConfigReader.getValue("filter.bedroom.count"));
        return pageBedroomCount>passedBedroomCount;
    }

    public boolean verifyFilterBedCount() {
        int pageBedCount=Integer.parseInt(bedCount.textContent().substring(3,4));
        int passedBedCount=Integer.parseInt(ConfigReader.getValue("filter.bed.count"));
        return pageBedCount>passedBedCount;
    }

    public boolean verifyFilterPrice() {
        return Integer.parseInt(cardPageFilterPrice.textContent().split(" ")[0].substring(1).
                replace(",",""))<=
                Integer.parseInt(ConfigReader.getValue("filter.maximum.price"));
    }
}
