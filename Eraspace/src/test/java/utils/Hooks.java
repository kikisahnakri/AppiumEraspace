package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {
    private static AppiumDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13");  // Sesuaikan dengan versi Android Anda
        caps.setCapability("deviceName", "emulator-5554");  // Sesuaikan dengan nama perangkat atau ID emulator Anda
        caps.setCapability("appPackage", "com.eraspace.app");  // Sesuaikan dengan nama paket aplikasi Anda
        caps.setCapability("appActivity", "com.eraspace.home.presentation.HomeActivity");  // Sesuaikan dengan aktivitas utama aplikasi Anda
        caps.setCapability("noReset", "true");


        //caps.setCapability("newCommandTimeout", 300);

        caps.setCapability("autoGrantPermissions", true);//tidak dianjurkan

        URL appiumServerURL = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver<>(appiumServerURL, caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(Scenario scenario) {
        if (driver != null) {
            if (scenario.isFailed()) {
                // Ambil screenshot atau log tambahan jika skenario gagal
                byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot on failure");
            }
            driver.quit();
        }
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }
}
