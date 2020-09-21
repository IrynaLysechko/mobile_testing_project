package gmailTest;

import com.epam.entity.Message;
import com.epam.utils.JsonReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailTest extends BaseTest {
    private final Message message = JsonReader.getMessage();

    @Test
    public void loginTest() throws InterruptedException {
        loginBusinessObject.goToTheLoginPage().logIn();
        messagesBusinessObject.sendMessage(message);
        Assert.assertTrue(messagesBusinessObject.isNotificationDisplayed());
    }
}
