package com.automation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HelpCenterPage extends BasePage {

    Locator helpCenterText;

    public HelpCenterPage() {
        helpCenterText = page.locator("//div[@class='hoakkap dir dir-ltr']");
    }

    public boolean verifyDisplayedMessage(String message) {
        return helpCenterText.textContent().contains(message);
    }
}
