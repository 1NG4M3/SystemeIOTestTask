package gusev.ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import gusev.util.AllureStepListener;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeOptions;

@ExtendWith(AllureStepListener.class)
abstract public class BaseSelenideTest {

    public static void setUp() {
        Configuration.remote = System.getenv("SELENIDE_REMOTE");
        Configuration.browser = "chrome";
        Configuration.headless = true;
//        Configuration.headless = false;
//        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 30000;
        Configuration.pageLoadTimeout = 120000;

        Configuration.browserCapabilities = new ChromeOptions()
                .addArguments("--no-sandbox")
                .addArguments("--disable-dev-shm-usage")
                .addArguments("--disable-gpu")
                .addArguments("--window-size=1920,1080");
    }

    @BeforeEach
    public void init() {
        setUp();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}