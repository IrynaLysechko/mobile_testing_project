package factory;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesFactory {
    private static final String PLATFORM_NAME = "Android";
    private static final String UDID = "emulator-5554";
    private static final String APP_PACKAGE = "com.google.android.gm";
    private static final String APP_ACTIVITY = "com.google.android.gm.GmailActivity";

    public static DesiredCapabilities getCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.UDID, UDID);
        capabilities.setCapability("appPackage", APP_PACKAGE);
        capabilities.setCapability("appActivity", APP_ACTIVITY);
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);
        return capabilities;
    }
}
