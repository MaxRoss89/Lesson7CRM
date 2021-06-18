package features.testcases;

import enums.ContactSubMenuButtons;
import pages.AllContactsPage;
import org.junit.jupiter.api.Test;
import Base.BaseUITest;
import common.Configuration;
import enums.NavigationBarTabs;
import pages.LoginPage;

public class NewContactTest extends BaseUITest {

    @Test
    public void createNewContactPositiveTest() throws InterruptedException {
        AllContactsPage contactScreen = (AllContactsPage) new LoginPage(driver)
                .authoriseScenario(Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .moveCursorToNavigationTab(NavigationBarTabs.COUNTER_PARTIES)
                .clickSubMenuButton(ContactSubMenuButtons.CONTACTS_REQUEST);
        Thread.sleep(10000);

        contactScreen
                .clickOnCreateNewContactButton()
                .enterLastName("Иванов123")
                .enterFirstName("Иван")
                .selectExpenditure("1234")
                .enterPosition("Менеджер")
                .clickSubmit()
                .checkNewContactPop();
    }

}