package tests;

import PageObjects.userRegistrationPage;
import TestComponents.BaseTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class userRegistrationTest extends BaseTest {

    @Test(priority = 1)
    public void registrationTest() throws IOException {
        launchApplication();
        userRegistrationPage up=new userRegistrationPage(driver);
        up.registerUser();
        up.enterUserDetails();
    }
}
