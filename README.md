# SystemeIOTestTask
Test task for QA.

**The UI Page** - <https://systeme.io/blog/cost-of-online-course>

__Description__:
1. <u>UI tests</u>: The test task involves creating an automated test for the webpage at [https://systeme.io/blog/cost-of-online-course.](https://systeme.io/blog/cost-of-online-course) The primary function of this test is to verify the presence of a button labeled "I want to receive my copy" within a pop-up on the page.

This will ensure that the button is appearing as expected. Then make sure the “Close popup” buton works. You can use any instruments. But it must be done by using docker.
Please provide the instruction how to run tests.

__Instruction__:
### What the test checks:
- Popup appears on page
- Button "I want to receive my copy" is visible
- Popup can be closed

---

### Run with Docker:

```bash
docker-compose up --build
```
__Tools and technologies__: Java 17, Selenide, JUnit5, Allure, Gradle, Docker.