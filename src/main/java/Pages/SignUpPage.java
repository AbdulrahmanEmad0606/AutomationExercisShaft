package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class SignUpPage {
    private SHAFT.GUI.WebDriver driver;

    public SignUpPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //  locate elements
    private By genderType = By.id("id_gender1");
    private By password = By.id("password");
    private By dayOfBirth = By.id("days");
    private By monthOfBirth = By.id("months");
    private By yearOfBirth = By.id("years");
    private By signUpLabel = By.cssSelector("[for='newsletter']");
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By companyName = By.id("company");
    private By countryName = By.id("country");
    private By stateName = By.id("state");
    private By cityName = By.id("city");
    private By zipCode = By.id("zipcode");
    private By mobileNumber = By.id("mobile_number");
    private By address = By.id("address1");
    private By signUpButton = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button");

    // Actions
    //1- setGender
    public SignUpPage setGender() {
        driver.element().click(genderType);
        return this;
    }

    //2- setPassword
    public SignUpPage setPassword(String password1) {
        driver.element().type(password, password1);
        return this;
    }

    //3- setDateOfBirth
    public SignUpPage setDateOfBirth(String day, String month, String year) {
        driver.element()
                .select(dayOfBirth, day)
                .select(monthOfBirth, month)
                .select(yearOfBirth, year);
        return this;
    }

    //4- setSignUpLabel
    public SignUpPage setSignUpLabel() {
        driver.element().click(signUpLabel);
        return this;
    }

    //5- setFirstName
    public SignUpPage setFirstName(String fName) {
        driver.element().type(firstName, fName);
        return this;
    }

    //6- setCityName
    public SignUpPage setCityName(String cityName1) {
        driver.element().type(cityName, cityName1);
        return this;
    }

    //7- setCompanyName
    public SignUpPage setCompanyName(String compName) {
        driver.element().type(companyName, compName);
        return this;
    }

    //8- setCountryName
    public SignUpPage setCountryName(String countName) {
        driver.element().select(countryName, countName);
        return this;
    }

    //9- setStateName
    public SignUpPage setLastName(String lastName1) {
        driver.element().type(lastName, lastName1);
        return this;
    }

    //10- setStateName
    public SignUpPage setStateName(String stateName1) {
        driver.element().type(stateName, stateName1);
        return this;
    }

    //11- setZipCode
    public SignUpPage setZipCode(String zipCode1) {
        driver.element().type(zipCode, zipCode1);
        return this;
    }

    //12- setMobileNumber
    public SignUpPage setMobileNumber(String mobileNumber1) {
        driver.element().type(mobileNumber, mobileNumber1);
        return this;
    }

    //13- setAddress
    public SignUpPage setAddress(String address1) {
        driver.element().type(address, address1);
        return this;
    }

    // fillData
    public Account fillData(){
        this.setGender()
                .setPassword("123456")
                .setDateOfBirth("6","June","1998")
                .setSignUpLabel()
                .setFirstName("test")
                .setLastName("dd")
                .setCompanyName("youxel")
                .setAddress("eee")
                .setCountryName("Canada")
                .setStateName("ddd")
                .setCityName("ddd")
                .setZipCode("123")
                .setMobileNumber("01234564");
        driver.element().click(signUpButton);
        return new Account(driver);
    }
}
