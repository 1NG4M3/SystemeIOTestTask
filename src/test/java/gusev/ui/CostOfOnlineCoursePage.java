package gusev.ui;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static gusev.util.ScreenshotHelper.attachScreenshot;

public class CostOfOnlineCoursePage {

    private final SelenideElement iframe = $("iframe[id^='systemeio-iframe']");
    private final SelenideElement popupContainer = $("[overflow='visible']");
    private final SelenideElement closeButton = $("[data-testid='popup-close-icon']");
    private final SelenideElement receiveCopyButton = $("#button-0a65a969");

    @Step("Open target blog page")
    public CostOfOnlineCoursePage openPage() {
        open("https://systeme.io/blog/cost-of-online-course");
        return this;
    }

    @Step("Switch to popup iframe")
    public CostOfOnlineCoursePage switchToPopupIframe() {
        iframe.shouldBe(visible, Duration.ofSeconds(60));
        switchTo().frame(iframe);
        return this;
    }

    @Step("Wait until popup content is visible")
    public CostOfOnlineCoursePage waitForPopup() {
        popupContainer.shouldBe(visible, Duration.ofSeconds(60));
        attachScreenshot("✅ Popup appeared");
        return this;
    }

    @Step("Verify 'I want to receive my copy' button is visible")
    public CostOfOnlineCoursePage verifyReceiveCopyButtonVisible() {
        receiveCopyButton
                .shouldBe(visible)
                .shouldHave(text("I want to receive my copy "))
                .scrollTo();
        attachScreenshot("✅ Receive Copy button visible");
        return this;
    }

    @Step("Click popup close button")
    public CostOfOnlineCoursePage closePopup() {
        closeButton.shouldBe(visible).click();
        return this;
    }

    @Step("Verify popup has disappeared")
    public CostOfOnlineCoursePage verifyPopupClosed() {
        popupContainer.should(disappear, Duration.ofSeconds(10));
        attachScreenshot("✅ Popup successfully closed");
        return this;
    }
}