package gusev.tests;

import gusev.ui.BaseSelenideTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import gusev.ui.CostOfOnlineCoursePage;

@Epic("Regression")
@Feature("UI")
@Story("Cost of online course health check")
@Owner("Gusev Dmitry")
public class PopupTest extends BaseSelenideTest {

    private final CostOfOnlineCoursePage page = new CostOfOnlineCoursePage();

    @Test
    @DisplayName("Check popup appears and can be closed")
    @Description("Verifies that the popup appears on the page, contains the expected button, and can be closed properly.")
    @Severity(SeverityLevel.CRITICAL)
    public void positivePopupFunctionalityTest() {
        page.openPage()
                .switchToPopupIframe()
                .waitForPopup()
                .verifyReceiveCopyButtonVisible()
                .closePopup()
                .verifyPopupClosed();
    }

    @Test
    @DisplayName("Check popup does NOT appear immediately and has no visible elements")
    @Description("Verifies that immediately after page load the popup, receive button and close button are not yet visible.")
    @Severity(SeverityLevel.NORMAL)
    public void negativePopupInitialStateTest() {
        page.openPage()
                .verifyPopupNotVisibleShortTimeout()
                .verifyReceiveCopyButtonNotVisible()
                .verifyCloseButtonNotVisible();
    }
}