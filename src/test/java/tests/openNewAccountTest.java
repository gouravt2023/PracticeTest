package tests;

import PageObjects.openNewAccountPage;
import TestComponents.BaseTest;
import org.testng.annotations.Test;

public class openNewAccountTest extends BaseTest {

    @Test()
    public void openAccount(){
        openNewAccountPage saving=new openNewAccountPage(driver);
        saving.openAccount();
    }
}
