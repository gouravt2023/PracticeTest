package PageObjects;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractComponent {

    WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//div[@class='login']/input)[1]")
    WebElement username;

    @FindBy(xpath = "(//div[@class='login']/input)[2]")
    WebElement pwd;

    @FindBy(xpath = "(//div[@class='login']/input)[3]")
    WebElement signInBtn;

    public void login(){
        username.sendKeys("gkt12345@yopmail.com");
        pwd.sendKeys("Gktdd@123");
        signInBtn.click();
        //userRegistrationPage ht=new userRegistrationPage(driver);
        //ht.logoutBtn.click();
    }


    public static void main(String[] args) throws InterruptedException {

    }
}
