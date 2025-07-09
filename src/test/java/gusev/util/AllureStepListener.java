package gusev.util;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import static gusev.util.ScreenshotHelper.attachScreenshot;

public class AllureStepListener implements AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext context) {
        boolean testFailed = context.getExecutionException().isPresent();
        String testName = context.getDisplayName();

        attachScreenshot(testFailed ?
                "❌ Failure state after test: " + testName :
                "✅ Final state after test: " + testName);
    }
}