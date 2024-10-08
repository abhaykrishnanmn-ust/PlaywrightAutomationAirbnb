package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class BasePage {

    Page page;

    public BasePage() {
        page = DriverManager.getPage();
    }

    public boolean isPresent(Locator locator) {
        try {
            locator.waitFor(new Locator.WaitForOptions().setTimeout(500));
            return locator.isVisible();
        } catch (Exception e) {
            return false;
        }
    }

    public Page switchToNewWindow() {
        String currentPageUrl = page.url();
        Page newPage = page.context().newPage();
        String newPageUrl = newPage.url();
        ConfigReader.setValue("windowUrl", currentPageUrl);
        page.context().pages().forEach(p -> {
            if (p.url().equals(newPageUrl)) {
                page = p;
            }
        });
        return page;
    }
}

