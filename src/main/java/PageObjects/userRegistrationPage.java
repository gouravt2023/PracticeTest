package PageObjects;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userRegistrationPage extends AbstractComponent {

    WebDriver driver;

    public userRegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p/a[text()='Register']")
    WebElement register;

    @FindBy(id = "customer.firstName")
    WebElement firstname;

    @FindBy(id = "customer.lastName")
    WebElement lastname;

    @FindBy(id = "customer.address.street")
    WebElement address;

    @FindBy(id = "customer.address.city")
    WebElement city;
    @FindBy(id = "customer.address.state")
    WebElement state;
    @FindBy(id = "customer.address.zipCode")
    WebElement zipcode;
    @FindBy(id = "customer.phoneNumber")
    WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    WebElement ssn;

    @FindBy(id = "customer.username")
    WebElement username;

    @FindBy(id = "customer.password")
    WebElement pwd;

    @FindBy(id = "repeatedPassword")
    WebElement confirmPwd;

    @FindBy(xpath = "//tr/td/input[@class='button']")
    WebElement submitBtn;
    @FindBy(xpath = "//a[text()='Log Out']")
    WebElement logoutBtn;


    public void registerUser() {
        register.click();
    }

    public void enterUserDetails() {
        firstname.sendKeys("GouravD");
        lastname.sendKeys("Darjee");
        address.sendKeys("genda circle");
        city.sendKeys("vadodara");
        state.sendKeys("Gujarat");
        zipcode.sendKeys("390011");
        phoneNumber.sendKeys("9999999990");
        ssn.sendKeys("11111111111");
        username.sendKeys("gkt12345@yopmail.com");
        pwd.sendKeys("Gktdd@123");
        confirmPwd.sendKeys("Gktdd@123");
        submitBtn.click();
        logoutBtn.click();

    }

    public void goTo() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
}
