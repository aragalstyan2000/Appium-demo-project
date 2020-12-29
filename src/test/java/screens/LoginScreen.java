package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginScreen extends PhoneLookupScreen {
    //   @iOSXCUITBy(xpath = "UsernameTextField")
    @AndroidFindBy(xpath = "//*[@content-desc=\"username\"]")
    private MobileElement usernameField;

    //    @iOSXCUITBy(id = "PasswordTextField")
    @AndroidFindBy(xpath = "//*[@content-desc=\"password\"]")
    private MobileElement passwordField;

    //    @iOSXCUITBy(id = "SignInButton")
    @AndroidFindBy(xpath = "//*[@content-desc=\"login\"]/android.widget.Button")
    private MobileElement signInButton;

    public LoginScreen(AppiumDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //    @Step("Enter username")
    private void enterUserName(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
        hideKeyboard();
    }

    //    @Step("Enter password")
    private void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        hideKeyboard();
    }

    //    @Step("Click SignIn button")
    private void clickSignIn() {
        signInButton.click();
    }

    public void login(String username, String password) throws Exception {
        enterUserName(username);
        enterPassword(password);
        clickSignIn();
    }
}
