package TestComponents;

import PageObjects.HomePage;
import PageObjects.userRegistrationPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public WebDriver initializeDriver() throws IOException {

        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("D:\\JAVA_selenium_practice\\PracticeTest\\src\\main\\java\\resources\\GlobalData.properties");
        prop.load(fis);
       String browserName= prop.getProperty("browser");
       if(browserName.equalsIgnoreCase("chrome")) {
           System.setProperty("WebDriver.chrome.driver", "D:\\JAVA_selenium_practice\\PracticeTest\\chromedriver-win64\\chromedriver.exe");
           // WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
           Dimension newSize = new Dimension(1100, 900); // Width x Height
           driver.manage().window().setSize(newSize);
       }
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Dimension newSize = new Dimension(1100, 900); // Width x Height
        driver.manage().window().setSize(newSize);
        return driver;
    }

    public WebDriver launchApplication() throws IOException {
        driver=initializeDriver();
       userRegistrationPage hr=new userRegistrationPage(driver);
       hr.goTo();
        return driver;
    }
}
