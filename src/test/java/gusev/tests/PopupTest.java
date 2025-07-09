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
    public void positivePopupFunctionalityTest() {
        page.openPage()
                .switchToPopupIframe()
                .waitForPopup()
                .verifyReceiveCopyButtonVisible()
                .closePopup()
                .verifyPopupClosed();
    }
}