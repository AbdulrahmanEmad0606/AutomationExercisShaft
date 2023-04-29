package Suits.Login;

import Suits.Basetest.BaseTest;
import com.shaft.validation.Validations;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Description("Verify 'Login to your account' is visible")
    @Test
    public void testLoginFunctionality(){
        homePage.navigateToSignUpPage1().loginAndNavigateToHomePage("testAbdoEmad12345678910@gmail.com","123456");
        Validations.assertThat().element(homePage.getVerificationTextLogin()).text()
                .contains("Logged in as")
                .perform();
    }

}
