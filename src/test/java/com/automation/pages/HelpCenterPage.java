package com.automation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HelpCenterPage extends BasePage {

    Locator helpCenterText;

    public HelpCenterPage() {
        helpCenterText = page.locator("//div[text()='Hi, how can we help?']");
    }

    public boolean verifyDisplayedMessage(String message) {
        return helpCenterText.textContent().contains(message);
    }
}
