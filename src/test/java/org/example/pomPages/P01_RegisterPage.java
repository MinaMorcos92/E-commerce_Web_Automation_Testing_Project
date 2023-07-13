package org.example.pomPages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_RegisterPage {

    public P01_RegisterPage()
    {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(className = "forcheckbox")
    public WebElement selectGender;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;


    @FindBy(css = "select[name=\"DateOfBirthDay\"]")
    public WebElement dateOfBirthDay;


    @FindBy(css = "select[name=\"DateOfBirthMonth\"]")
    public WebElement dateOfBirthMonth;

    @FindBy(css = "select[name=\"DateOfBirthYear\"]")
    public WebElement dateOfBirthYear;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(css = "div[class=\"result\"]")
    public WebElement registerCompletedMsg;


}
