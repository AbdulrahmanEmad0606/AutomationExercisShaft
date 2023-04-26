package Suits.Basetest;

import Pages.HomePage;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected SHAFT.GUI.WebDriver driver;
    protected HomePage homePage;
    // constructor
    @BeforeClass
    public void setUp(){
        // Launch browser
        driver=new SHAFT.GUI.WebDriver();
        // Navigate to url 'http://automationexercise.com'
        driver.browser().navigateToURL("https://automationexercise.com/");
        homePage = new HomePage(driver);
    }
}
