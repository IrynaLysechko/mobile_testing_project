package com.epam.page.object;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GmailLoginPage extends GmailAbstractPage {
    @AndroidFindBy(id = "action_done")
    private MobileElement takeMeToEmailButton;

    public GmailLoginPage(AndroidDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void clickTakeMeToEmail(){
        takeMeToEmailButton.click();
    }
}
