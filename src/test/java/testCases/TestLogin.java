package testCases;

import appium.AppiumController;
import org.junit.*;
import org.springframework.context.annotation.Description;
import screens.HomeScreen;
import screens.LoginScreen;
import static org.assertj.core.api.Assertions.assertThat;

public class TestLogin extends AppiumController {
    protected static LoginScreen loginScreen;
    protected static HomeScreen homeScreen;
    @BeforeClass
    public static void setUp() throws Exception {
        startAppium();
        loginScreen = new LoginScreen(driver, wait);
        homeScreen = new HomeScreen(driver, wait);
    }

    @After
    public void afterEach() {
        loginScreen.appReset();
    }

    @Test
    @Description("Verify user can login with valid credentials")
    public void validLoginTest() throws Exception {
        loginScreen.login("admin", "admin");
        assertThat(homeScreen.isHomeScreenVisible()).withFailMessage("withFailMessage").isTrue();
    }

    @Test
    @Description("Verify user can not login with invalid credentials")
    public void invalidLoginTest() throws Exception {
        loginScreen.login("admin1", "admin1");
        assertThat(homeScreen.isHomeScreenVisible()).withFailMessage("withFailMessage").isFalse();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        stopAppium();
    }
}
