package Suits.HomePageTests;
import Suits.Basetest.BaseTest;
import com.shaft.validation.Validations;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
public class HomePageTest extends BaseTest {
    // Verify that home page is visible successfully
    @Story("Home Page Visibility")
    @Test
    public void checkVisibilityOfHomePage(){
        // get current URL
        Validations.assertThat().browser()
                .url()
                .equalsIgnoringCaseSensitivity("https://automationexercise.com/")
                .perform();
    }
}
