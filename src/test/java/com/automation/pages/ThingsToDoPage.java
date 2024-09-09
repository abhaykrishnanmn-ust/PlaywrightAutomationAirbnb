package com.automation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class ThingsToDoPage extends BasePage{

    Locator search;
    Locator card;
    Locator text;


    public ThingsToDoPage() {
        search = page.locator("//span[@class='tmel3e0 dir dir-ltr']");
        card = page.locator("//div[@itemprop='itemListElement']").nth(1);
    }

    public void clickOnSearch() {
        search.click();
    }

    public void clickOnFistCard() {
        card.click();
    }


    public Locator verifyWithText() {
        Page newPage=page.waitForPopup(()->{page.getByText("What you'll do");});
        text =newPage.getByText("What you'll do");
        return text;
    }
}
