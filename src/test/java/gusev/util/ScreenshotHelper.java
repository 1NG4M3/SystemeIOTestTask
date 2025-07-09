package gusev.util;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class ScreenshotHelper {

    @Step("📸 Screenshot: {description}")
    public static void attachScreenshot(String description) {
        byte[] screenshot = ((TakesScreenshot) WebDriverRunner.getWebDriver())
                .getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment(description, "image/png", new ByteArrayInputStream(screenshot), "png");
    }
}