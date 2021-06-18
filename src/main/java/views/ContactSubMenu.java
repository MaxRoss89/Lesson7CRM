package views;

import enums.ContactSubMenuButtons;
import pages.AllContactsPage;
import org.openqa.selenium.WebDriver;
import Base.BaseView;
import Base.SubMenu;
import Base.SubMenuButtons;

public class ContactSubMenu extends SubMenu{
    public ContactSubMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public BaseView clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ContactSubMenuButtons) {
            switch ((ContactSubMenuButtons) buttons) {
                case CONTACTS_REQUEST:
                    driver.findElement(((ContactSubMenuButtons) buttons).getBy()).click();
                    return new AllContactsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}
