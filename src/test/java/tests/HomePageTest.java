package tests;

import PageObjects.HomePage;
import TestComponents.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends BaseTest {

    @Test(priority = 2)
  public void loginTest() {
        HomePage hp=new HomePage(driver);
        hp.login();
  }
}