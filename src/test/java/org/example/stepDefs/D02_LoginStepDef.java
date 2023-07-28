package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pomPages.P02_LoginPage;
import org.example.pomPages.P03_HomePage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {

    P02_LoginPage login = new P02_LoginPage();
    P03_HomePage home = new P03_HomePage();

    @Given("user go to login page")
    public void userGoToLoginPage()
    {
        home.loginTab.click();
    }



    @When("user login with valid username {string} and valid password {string}")
    public void userLoginWithValidUsernameAndValidPassword(String arg0, String arg1)
    {
        login.emailForLogin.sendKeys(arg0);
        login.passwordForLogin.sendKeys(arg1);
    }


    @And("user click on login button")
    public void userClickOnLoginButton()
    {
        login.loginButton.click();
    }


    @Then("verify login to the system successfully")
    public void verifyLoginToTheSystemSuccessfully()
    {
        SoftAssert soft = new SoftAssert();
        String currentUrl= Hooks.driver.getCurrentUrl();
        soft.assertEquals(currentUrl,"https://demo.nopcommerce.com/");
        boolean myAccountTabIsDisplayed = home.MyAccountTab.isDisplayed();
        soft.assertTrue(myAccountTabIsDisplayed);
        soft.assertAll();

    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1)
    {
        login.emailForLogin.sendKeys(arg0);
        login.passwordForLogin.sendKeys(arg1);
    }


    @Then("verify user couldn't login")
    public void verifyUserCouldnTLogin()
    {
        SoftAssert soft = new SoftAssert();
        boolean msgIsContains = login.loginFailedMsg.getText().contains("Login was unsuccessful.");
        String msgColor = login.loginFailedMsg.getCssValue("color");
        String msgColorHexa =Color.fromString(msgColor).asHex();
        soft.assertTrue(msgIsContains);
        soft.assertEquals(msgColorHexa,"#e4434b");
        soft.assertAll();
    }



}
