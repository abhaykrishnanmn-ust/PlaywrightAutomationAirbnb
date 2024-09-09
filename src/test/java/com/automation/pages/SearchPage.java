package com.automation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SearchPage extends BasePage {

    Locator searchBtn;

    public SearchPage() {
        searchBtn = page.locator("//button[contains(@type,'submit')]");
    }

    public void clickOnSearchButton() {
        searchBtn.click();
    }
}
