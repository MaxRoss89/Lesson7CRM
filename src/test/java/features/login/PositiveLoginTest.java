package features.login;


import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import Base.BaseUITest;
import pages.LoginPage;

import static common.Configuration.BASE_URL;
import static common.Configuration.STUDENT_LOGIN;
import static common.Configuration.STUDENT_PASSWORD;

@Feature("Login")
@Severity(SeverityLevel.BLOCKER)
public class PositiveLoginTest extends BaseUITest {

    @Test
    public void loginWithBaseUserTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .checkUrl(BASE_URL);
    }
}