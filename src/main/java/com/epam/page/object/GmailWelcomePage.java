package com.epam.page.object;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GmailWelcomePage extends GmailAbstractPage{
    @AndroidFindBy(id = "welcome_tour_got_it")
    private MobileElement gotItButton;

    public GmailWelcomePage(AndroidDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void clickGotItButton(){
        gotItButton.click();
    }
}
