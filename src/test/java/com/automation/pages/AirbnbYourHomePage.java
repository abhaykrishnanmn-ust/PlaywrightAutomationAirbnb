package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AirbnbYourHomePage extends BasePage {

    Locator airbnbYourHomeMessage;
    Locator slider;
    Locator priceOnYourHome;

    public AirbnbYourHomePage() {
        airbnbYourHomeMessage = page.locator("//h1[@id='host-estimate-header']");
        slider = page.locator("//input[@type='range']");
        priceOnYourHome = page.locator("//div[@data-testid='odometer-text']/following-sibling::span");
    }

    public boolean verifyAirbnbYourHomeMessage(String message) {
        String currentPrice = priceOnYourHome.textContent();
        ConfigReader.setValue("price.on.your.home", currentPrice);
        return airbnbYourHomeMessage.textContent().contains(message);
    }

    public void slideSlider() {
        slider.hover();
        slider.dragTo(slider.locator("//input[@type='range']"));
    }

    public boolean verifyPriceChange() {
        String newPrice = priceOnYourHome.textContent();
        String initialPrice = ConfigReader.getValue("price.on.your.home");
        return !initialPrice.equals(newPrice);
    }
}
