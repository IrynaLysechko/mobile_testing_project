package com.epam.page.object;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GmailSendMessagePage extends GmailAbstractPage{
    @AndroidFindBy(id = "to")
    private MobileElement to;
    @AndroidFindBy(id = "subject")
    private MobileElement subject;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    private MobileElement message;
    @AndroidFindBy(id = "send")
    private MobileElement send;

    public GmailSendMessagePage(AndroidDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public MobileElement getToField() {
        return to;
    }

    public MobileElement getSubjectField() {
        return subject;
    }

    public MobileElement getMessageField() {
        return message;
    }

    public MobileElement getSendButton() {
        return send;
    }
}
