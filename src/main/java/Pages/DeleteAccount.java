package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class DeleteAccount {
    // instantiating the WebDriver
    protected SHAFT.GUI.WebDriver driver;
    public DeleteAccount(SHAFT.GUI.WebDriver shaft){
        this.driver=new SHAFT.GUI.WebDriver();
    }
    // Element locators
    private By deleteAccountLabel=By.cssSelector("h2 b");
    // Actions
    public By getDeleteConfirmMessage(){
        return deleteAccountLabel;
    }
}
