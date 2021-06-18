package views;

import enums.ProjectSubMenuButtons;
import pages.AllProjectsPage;
import org.openqa.selenium.WebDriver;
import Base.BaseView;
import Base.SubMenu;
import Base.SubMenuButtons;

public class ProjectSubMenu extends SubMenu{
    public ProjectSubMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public BaseView clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ProjectSubMenuButtons) {
            switch ((ProjectSubMenuButtons) buttons) {
                case MY_PROJECTS_REQUEST:
                    driver.findElement(((ProjectSubMenuButtons) buttons).getBy()).click();
                    return new AllProjectsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}
