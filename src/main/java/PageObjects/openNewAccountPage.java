package PageObjects;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class openNewAccountPage extends AbstractComponent {

    WebDriver driver;
    public openNewAccountPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='leftPanel']/ul/li/a[text()='Open New Account']")
    WebElement openAcBtn;

    @FindBy(xpath = "//div/form/select[@id='type']")
    WebElement accountType;


    public void openAccount(){
        openAcBtn.click();
        Select sc=new Select(accountType);
        sc.selectByVisibleText("SAVINGS");
        System.out.println(sc.getFirstSelectedOption().getText());
        System.out.println("checking to test something ");
    }
}


