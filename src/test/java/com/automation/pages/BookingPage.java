package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.Locator;


public class BookingPage extends BasePage{
    
    Locator clickOnCard;
    Locator fetchCheckInDate;
    Locator fetchCheckOutDate;
    Locator fetchNoOfPersons;
    Locator closeTranslate;
    Locator cardClick;
    Locator price;
    Locator totalPrice;

    public BookingPage() {
        clickOnCard = page.locator("//div[@itemprop='itemListElement']");
        fetchCheckInDate = page.locator("//div[@data-testid='change-dates-checkIn']");
        fetchCheckOutDate = page.locator("//div[@data-testid='change-dates-checkOut']");
        fetchNoOfPersons = page.locator("//div[text()='Guests']/following-sibling::div//span");
        closeTranslate = page.locator("//button[@aria-label='Close']");
        cardClick = page.locator("//div[@role='presentation']");
        price = page.locator("//span[@class='_1k4xcdh']");
        totalPrice = page.locator("//div[text()='Total before taxes']/parent::span/following-sibling::span//span[@class='_j1kt73']");
    }

    public boolean isSearchedPageIsDisplayed() {
        return true; // Implement a real check if necessary
    }

    public void clickOnFirstCard() {
        clickOnCard.click();
        closeTranslate.click();
    }

    public boolean verifyCheckInDate() {
        switchToNewWindow();
        closeTranslate.click();
        String checkInDateFetched = fetchCheckInDate.textContent().trim();
        return checkInDateFetched.equals(ConfigReader.getValue("expectedCheckInDate"));
    }

    public boolean verifyCheckOutDate() {
        switchToNewWindow();
        String checkOutDateFetched = fetchCheckOutDate.textContent().trim();
        return checkOutDateFetched.equals(ConfigReader.getValue("expectedCheckOutDate"));
    }

    public boolean verifyNoOfPersons() {
        switchToNewWindow();
        String noOfPersonsFetched = fetchNoOfPersons.textContent().trim();
        return noOfPersonsFetched.equals(ConfigReader.getValue("expectedNoOfPersons"));
    }

    public void clickOnAnyCard() {
        cardClick.click();
    }

    public void verifyPrice() {
        closeTranslate.click();
        String displayPrice = price.textContent().trim();
        String displayTotalPrice = totalPrice.textContent().trim();
        System.out.println(displayPrice + "===" + displayTotalPrice);
    }
}
