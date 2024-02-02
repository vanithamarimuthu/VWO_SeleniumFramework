package BaseTest;

import Driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_VWO {


    @BeforeMethod
    public void setup(){
        DriverManager.init();
    }

    @AfterMethod
    public void browserClose(){
        DriverManager.down();
    }


}
