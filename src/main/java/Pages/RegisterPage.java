package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class RegisterPage {
    private SHAFT.GUI.WebDriver driver;
    SignUpPage signUpPage;
    public RegisterPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
        signUpPage=new SignUpPage(driver);
    }
    // locate elements
    private By registerName = By.cssSelector("input[data-qa='signup-name']");
    private By registerEmailAddress = By.cssSelector("input[data-qa='signup-email']");
    private By signUpBtn = By.cssSelector("button[data-qa='signup-button']");
    // actions
    public Account fillRegistrationFields(String name,String mail){
        driver.element().type(registerName,name)
                .type(registerEmailAddress,mail).click(signUpBtn);
        return signUpPage.fillData();
    }
}
