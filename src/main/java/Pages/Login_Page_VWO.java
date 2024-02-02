package Pages;

import Base.BasePage;
import Driver.DriverManager;
import Utils.PropertieReader;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;

public class Login_Page_VWO extends BasePage {

    public Login_Page_VWO(){
        super();
    }
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");
    By error_message = By.id("js-notification-box-msg");

    public Login_Page_VWO login_positive() throws Exception {
        enterInput(username, PropertieReader.FileReader("username"));
        enterInput(password, PropertieReader.FileReader("password"));
        clickElement(signButton);
        return this;


    }
    public void OpenUrl() throws Exception {

        DriverManager.getDriver().get(PropertieReader.FileReader("url"));

    }
    public String login_negative() throws Exception {
        enterInput(username,"admin");
        enterInput(password, PropertieReader.FileReader("password"));
        clickElement(signButton);
        VisibilityOf(error_message);
        return getElement(error_message).getText();




    }
    public Dashboard_Page_VWO afterlogin(){
        return new Dashboard_Page_VWO();
    }


}
