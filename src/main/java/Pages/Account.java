package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Account {
    private SHAFT.GUI.WebDriver driver;
    public Account(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    // locate elements
    private By successMessage = By.cssSelector("h2 b");
    private By continueBtn = By.xpath("//div[contains(@class,'pull-right')]/a");

    // actions
    public By getSuccessMessage(){
        return successMessage;
    }
    public HomePage clickOnContinueBtn(){
        driver.element().click(continueBtn);
        return new HomePage(driver);
    }
}
