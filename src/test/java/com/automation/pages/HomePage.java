package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.Locator;


public class HomePage extends BasePage {

    Locator menu;
    Locator thingsToDo;
    Locator destination;

    public HomePage() {
        menu = page.locator("//a[@aria-label='Airbnb homepage']");
        thingsToDo = page.getByText("Things to do");
        destination= page.getByText("Bali");
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
}
