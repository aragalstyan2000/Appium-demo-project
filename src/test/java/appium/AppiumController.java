package appium;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumController {
    protected static AppiumDriver driver;
    protected static WebDriverWait wait;

    public static void startAppium() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        File objFile = new File("src/test/resources/apps/VodQA.apk");
        capabilities.setCapability("deviceName", "Galaxy A9"); //set your device name
        capabilities.setCapability("platformVersion", "10"); //set your device version
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("udid", "2b388dc4df1d7ece"); //set your device udid
        capabilities.setCapability("app", objFile.getAbsolutePath());

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void stopAppium() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }
}
