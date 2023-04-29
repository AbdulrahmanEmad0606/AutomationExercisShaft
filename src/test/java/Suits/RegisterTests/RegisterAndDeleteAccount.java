package Suits.RegisterTests;

import Pages.Account;
import Pages.RegisterPage;
import Suits.Basetest.BaseTest;
import com.shaft.validation.Validations;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.util.Date;

public class RegisterAndDeleteAccount extends BaseTest {
    @Description("Verify that 'ACCOUNT CREATED!' is visible and 'Logged in as username' is visible then delete the created account")
    @Test
    public void testAccountCreatedMessage(){
        Date date = new Date();
        String name="Abdo";
        homePage.navigateToSignUpPage1();
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.fillRegistrationFields(name,"test"+date.getTime()+"@a"+".com");
        Account account=new Account(driver);

        Validations.assertThat()
                .element(account.getSuccessMessage())
                .text()
                .equalsIgnoringCaseSensitivity("ACCOUNT CREATED!")
                .perform();

        account.clickOnContinueBtn();

        Validations.assertThat().
                element(homePage.getVerificationText())
                .text()
                .contains("Logged in as"+" "+name)
                .perform();

        Validations.assertThat().
                element(homePage.navigateToDeleteAccount().getDeleteConfirmMessage())
                .text()
                .equalsIgnoringCaseSensitivity("Account Deleted!")
                .perform();

    }
   }
