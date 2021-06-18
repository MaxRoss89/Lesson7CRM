package features.testcases;

import enums.ProjectSubMenuButtons;
import pages.AllProjectsPage;
import org.junit.jupiter.api.Test;
import Base.BaseUITest;
import common.Configuration;
import enums.NavigationBarTabs;
import pages.LoginPage;

public class NewProjectTest extends BaseUITest {
    @Test
    public void createNewProjectPositiveTest() throws InterruptedException {
        AllProjectsPage projectScreen = (AllProjectsPage)  new LoginPage(driver)
                .authoriseScenario(Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .moveCursorToNavigationTab(NavigationBarTabs.PROJECTS)
                .clickSubMenuButton(ProjectSubMenuButtons.MY_PROJECTS_REQUEST);
        Thread.sleep(5000);

        projectScreen
                .clickOnCreateNewProjectButton()
                .enterName(getRandomWord(6))
                .enterOrganization("1234")
                .enterContact("123 123")
                .enterDept("Research & Development")
                .enterHead("Applanatest Applanatest Applanatest")
                .enterBoss("Applanatest Applanatest Applanatest")
                .enterAdmin("Applanatest Applanatest Applanatest")
                .enterManager("Applanatest Applanatest Applanatest")
                .clickSubmit()
                .checkNewProjectPopUp();
    }

    //случайное имя
    String getRandomWord(int length) {
        String r = "";
        for(int i = 0; i < length; i++) {
            r += (char)(Math.random() * 26 + 97);
        }
        return r;
    }
}
