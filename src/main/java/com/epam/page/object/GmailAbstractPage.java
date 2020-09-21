package com.epam.page.object;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class GmailAbstractPage {

    public GmailAbstractPage(AndroidDriver<? extends MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
