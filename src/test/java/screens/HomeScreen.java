package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeScreen extends PhoneLookupScreen {
    @AndroidFindBy(xpath = "//*[@content-desc=\"scrollView\"]/android.view.ViewGroup")
    private MobileElement homeView;

    public HomeScreen(AppiumDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public Boolean isHomeScreenVisible() {
        try {
            return homeView.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
