package Pages;

import Base.BasePage;
import org.openqa.selenium.By;

public class Dashboard_Page_VWO extends BasePage {

    Dashboard_Page_VWO(){

    }
    By loginName = By.cssSelector("[data-qa='lufexuloga']");
    public String loginUsername(){

        VisibilityOf(loginName);
        return getElement(loginName).getText();

    }

}
