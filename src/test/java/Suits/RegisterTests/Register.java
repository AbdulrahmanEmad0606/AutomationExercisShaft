package Suits.RegisterTests;

import Pages.Account;
import Pages.RegisterPage;
import Suits.Basetest.BaseTest;
import com.shaft.validation.Validations;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.util.Date;

public class Register extends BaseTest {
    @Description("Verify that 'ACCOUNT CREATED!' is visible only")
    @Test
    public void testRegister(){
        String name="Abdo";
        homePage.navigateToSignUpPage1();
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.fillRegistrationFields(name,"testAbdoEmad12345678910@gmail.com");
        Account account=new Account(driver);

        Validations.assertThat()
                .element(account.getSuccessMessage())
                .text()
                .equalsIgnoringCaseSensitivity("ACCOUNT CREATED!")
                .perform();
    }
}
