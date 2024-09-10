package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.microsoft.playwright.Page;

public class BasePage {

    Page page;

    public BasePage() {
        page = DriverManager.getPage();
    }

    public void switchToNewWindow() {

        String currentPageUrl = page.url();


        Page newPage = page.context().newPage();
        String newPageUrl = newPage.url();

        ConfigReader.setValue("windowUrl", currentPageUrl);


        page.context().pages().forEach(p -> {
            if (p.url().equals(newPageUrl)) {
                page = p;
            }
        });
    }
}

