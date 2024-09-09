package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.Locator;


public class HomePage extends BasePage {

    Locator menu;
    Locator thingsToDo;
    Locator destination;
    Locator globalIcon;
    Locator currencyOption;

    public HomePage() {
        menu = page.locator("//a[@aria-label='Airbnb homepage']");
        thingsToDo = page.getByText("Things to do");
        destination= page.getByText("Bali");
        globalIcon= page.locator("//div[@class='_z5mecy']");
        currencyOption=page.locator("//button[@id='tab--language_region_and_currency--1']");
    }



    public void openWebsite() {
        page.navigate(ConfigReader.getConfigValue("application.url"));
    }

    public Locator verifyOnHomePage() {
        return menu;

    }

    public void clickOnThingsToDo() {
        thingsToDo.click();
    }

    public void clickOnDestination() {
        destination.click();
    }

    public void clickOnGlobalIcon() {
        globalIcon.click();
    }

    public void clickOnCurrency() {
        currencyOption.click();
    }
}
