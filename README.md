# SystemeIOTestTask
Test task for QA.

**The UI Page** - <https://systeme.io/blog/cost-of-online-course>

__Description__:
1. <u>UI tests</u>: The test task involves creating an automated test for the webpage at [https://systeme.io/blog/cost-of-online-course.](https://systeme.io/blog/cost-of-online-course) The primary function of this test is to verify the presence of a button labeled "I want to receive my copy" within a pop-up on the page.

This will ensure that the button is appearing as expected. Then make sure the “Close popup” button works.  
You can use any instruments. But it must be done by using docker.  
Please provide the instruction how to run tests.

__Instruction__:
### What the test checks:
- Popup appears on page (after a short delay)
- Button "I want to receive my copy" is visible
- Popup can be closed
- Popup is not visible immediately after page load (negative case)
- Button and close icon are not visible before popup appears

### Test design techniques:
- Positive testing (happy path)
- Negative testing
- Boundary testing (popup delay vs immediate check)
- UI visibility assertions
- End-to-end interaction checks

### Severity levels:
| Test Case                                    | Severity |
|----------------------------------------------|----------|
| Popup appears and can be closed              | CRITICAL |
| Popup does not appear immediately after load | NORMAL   |

---

### Run with Docker:

```bash
docker-compose up --build
```
__After execution, the Allure report is generated at:__
 
./build/allure-report/index.html

__Tools and technologies__: Java 17, Selenide, JUnit5, Allure, Gradle, Docker.