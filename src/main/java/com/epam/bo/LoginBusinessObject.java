package com.epam.bo;

import com.epam.page.object.GmailLoginPage;
import com.epam.page.object.GmailWelcomePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginBusinessObject {
    private static final Logger logger = LogManager.getLogger(LoginBusinessObject.class);
    private final GmailWelcomePage gmailWelcomePage;
    private final GmailLoginPage gmailLoginPage;

    public LoginBusinessObject(AndroidDriver<? extends MobileElement> driver) {
        gmailLoginPage = new GmailLoginPage(driver);
        gmailWelcomePage = new GmailWelcomePage(driver);
    }

    public LoginBusinessObject goToTheLoginPage() {
        logger.info("Try to go to the account page");
        gmailWelcomePage.clickGotItButton();
        return this;
    }

    public LoginBusinessObject logIn() throws InterruptedException {
        logger.info("Go to the main page");
        gmailLoginPage.clickTakeMeToEmail();
        return this;
    }
}
