package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class PhoneLookupScreen {

    protected final AppiumDriver driver;
    protected final WebDriverWait wait;


    public PhoneLookupScreen(AppiumDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)), this);
    }

    public void hideKeyboard() {
        driver.hideKeyboard();
    }

    public void appReset() {
        driver.resetApp();
    }
}
