package org.example.pomPages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_LoginPage {

    public P02_LoginPage()
    {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(id = "Email")
    public WebElement emailForLogin;

    @FindBy(id = "Password")
    public WebElement passwordForLogin;

    @FindBy(css = "button[class=\"button-1 login-button\"]")
    public WebElement loginButton;

    @FindBy(css = "div[class=\"message-error validation-summary-errors\"]")
    public WebElement loginFailedMsg;




}
