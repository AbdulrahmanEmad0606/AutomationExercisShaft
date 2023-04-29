package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage {
     // instantiating the WebDriver
    protected SHAFT.GUI.WebDriver driver;
    // constructor
    public HomePage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    // Element Locators
    private By registerAndLoginBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    private By verificationText    = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");

    private By deleteAccountBtn   = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    private By verificationMessageAsLogin  = By.xpath("//div/div/div/div[2]/div/ul/li[10]/a");
       // Actions
    public RegisterPage navigateToSignUpPage1(){
        driver.element().click(registerAndLoginBtn);
        return new RegisterPage(driver);
    }
    public By getVerificationText() {
        return verificationText;
    }
    public DeleteAccount navigateToDeleteAccount(){
        driver.element().click(deleteAccountBtn);
        return new DeleteAccount(driver);
    }
    public By getVerificationTextLogin(){
        return verificationMessageAsLogin;
    }
}
