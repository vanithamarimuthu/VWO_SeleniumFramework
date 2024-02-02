package Base;

import Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {




    public BasePage() {
            // If you want to call something before every Page Object Class call, Put your Code here");
            // Open File, Open Data Base Connection You can write code here
        }


    public void implicitWait(){
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clickElement(By by){
        DriverManager.getDriver().findElement(by).click();

    }
    public void enterInput(By by,String key){
        DriverManager.getDriver().findElement(by).sendKeys(key);

    }
    public WebElement getElement(By by){
       return DriverManager.getDriver().findElement(by);

    }

    public WebElement presenceOf(final By elementLocation){
        return  new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement VisibilityOf(final By elementLocation){
        return  new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }
}
