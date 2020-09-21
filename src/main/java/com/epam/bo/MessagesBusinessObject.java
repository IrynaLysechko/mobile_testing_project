package com.epam.bo;

import com.epam.entity.Message;
import com.epam.page.object.GmailMainPage;
import com.epam.page.object.GmailSendMessagePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MessagesBusinessObject {
    private static final Logger logger = LogManager.getLogger(MessagesBusinessObject.class);
    private final GmailMainPage gmailMainPage;
    private final GmailSendMessagePage gmailSendMessagePage;

    public MessagesBusinessObject(AndroidDriver<? extends MobileElement> driver){
        gmailMainPage = new GmailMainPage(driver);
        gmailSendMessagePage = new GmailSendMessagePage(driver);
    }

    public void sendMessage(Message message){
        gmailMainPage.clickToComposeButton();
        logger.info("Try to set message recipient " + message.getTo());
        gmailSendMessagePage.getToField().sendKeys(message.getTo());
        logger.info("Try to set message subject " + message.getSubject());
        gmailSendMessagePage.getSubjectField().sendKeys(message.getSubject());
        logger.info("Try to set message text " + message.getMessage());
        gmailSendMessagePage.getMessageField().sendKeys(message.getMessage());
        logger.info("Try to sent message");
        gmailSendMessagePage.getSendButton().click();
        logger.info("Message sent");
    }

    public boolean isNotificationDisplayed(){
        return gmailMainPage.getNotification().isDisplayed();
    }
}
