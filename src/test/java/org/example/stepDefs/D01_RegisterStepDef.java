package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pomPages.P01_RegisterPage;
import org.example.pomPages.P03_HomePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_RegisterStepDef {
    P03_HomePage home = new P03_HomePage();

    P01_RegisterPage register = new P01_RegisterPage();


    @Given("user go to register page")
    public void userGoToResgisterPage ()
    {
        home.registerTab.click();
    }

    @When("user select gender type")
    public void userSelectGenderType()
    {
        register.selectGender.click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1)
    {
        register.firstName.sendKeys(arg0);
        register.lastName.sendKeys(arg1);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth()
    {
        Select day = new Select(register.dateOfBirthDay);
        day.selectByValue("7");
        Select month = new Select(register.dateOfBirthMonth);
        month.selectByValue("7");
        Select year = new Select(register.dateOfBirthYear);
        year.selectByValue("1992");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0)
    {
        register.email.sendKeys(arg0);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg00, String arg11)
    {
       register.password.sendKeys(arg00);
       register.confirmPassword.sendKeys(arg11);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton()
    {
        register.registerButton.click();
    }

    @Then("verify success message is displayed")
    public void verifySuccessMessageIsDisplayed()
    {
        SoftAssert soft = new SoftAssert();
        String msgColor = register.registerCompletedMsg.getCssValue("color");
        soft.assertEquals(msgColor,"rgba(76, 177, 124, 1)");
        String registerationMsg = register.registerCompletedMsg.getText();
        soft.assertTrue(registerationMsg.contains("Your registration completed"));
        soft.assertAll();
    }
}
