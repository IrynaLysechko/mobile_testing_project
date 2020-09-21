package gmailTest;

import com.epam.bo.LoginBusinessObject;
import com.epam.bo.MessagesBusinessObject;
import factory.CapabilitiesFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static AndroidDriver<MobileElement> androidDriver;
    protected static LoginBusinessObject loginBusinessObject;
    protected static MessagesBusinessObject messagesBusinessObject;
    private static final String URL = "http://localhost:4723/wd/hub";

    @BeforeMethod
    public void setUpDriver() throws MalformedURLException {
        androidDriver = new AndroidDriver<>(new URL(URL), CapabilitiesFactory.getCapabilities());
        androidDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        loginBusinessObject = new LoginBusinessObject(androidDriver);
        messagesBusinessObject = new MessagesBusinessObject(androidDriver);
    }

    @AfterMethod
    public void closeApp() {
        androidDriver.closeApp();
    }
}
