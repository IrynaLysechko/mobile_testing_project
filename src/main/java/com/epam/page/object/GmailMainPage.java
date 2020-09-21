package com.epam.page.object;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GmailMainPage extends GmailAbstractPage {
    @AndroidFindBy(id = "compose_button")
    private MobileElement composeButton;

    @AndroidFindBy(id = "description_text")
    private MobileElement notification;

    public GmailMainPage(AndroidDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public void clickToComposeButton() {
        composeButton.click();
    }

    public MobileElement getNotification(){
        return notification;
    }
}
