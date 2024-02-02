package VWO;

import BaseTest.BaseTest_VWO;
import Pages.Dashboard_Page_VWO;
import Pages.Login_Page_VWO;
import Utils.PropertieReader;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Login_Test extends BaseTest_VWO{
    @Test(priority = 2)
    public void LoginTest_positive() throws Exception {
        // How to enter the user, pass and go the Dashboard and verify

        Login_Page_VWO LP = new Login_Page_VWO();
        LP.OpenUrl();
        Dashboard_Page_VWO afterlogin = LP.login_positive().afterlogin();
        String a = afterlogin.loginUsername();
        Assertions.assertThat(a).isNotBlank().contains(PropertieReader.FileReader("expected_username"));

    }
    @Test(priority = 1)
    public void LoginTest_negative() throws Exception {
        // How to enter the user, pass and go the Dashboard and verify

        Login_Page_VWO LP = new Login_Page_VWO();
        LP.OpenUrl();
        String s = LP.login_negative();

        Assertions.assertThat(s).isNotBlank().contains(PropertieReader.FileReader("error_message"));

    }
}
