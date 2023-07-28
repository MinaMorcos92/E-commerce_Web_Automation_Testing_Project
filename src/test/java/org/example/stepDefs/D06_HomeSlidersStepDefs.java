package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pomPages.P03_HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_HomeSlidersStepDefs {

    P03_HomePage home = new P03_HomePage();

    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(4));

    @When("user click on iphone14 slider")
    public void userClickOnIphoneSlider()
    {
        wait.until(ExpectedConditions.invisibilityOf(home.galaxySlider));
        home.iphoneSlider.click();
    }

    @Then("verify URL will change from home to iphone14")
    public void verifyURLWillChangeFromHomeToIphone()
    {
        String iphoneUrl = "https://demo.nopcommerce.com/iphone-14-pro";
        String url = Hooks.driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(url,iphoneUrl);
        soft.assertAll();

    }


    @When("user click on Galaxy slider")
    public void userClickOnGalaxySlider()
    {
        wait.until(ExpectedConditions.invisibilityOf(home.iphoneSlider));
        home.galaxySlider.click();
    }

    @Then("verify URL will change from home to Galaxy")
    public void verifyURLWillChangeFromHomeToGalaxy()
    {
        String galaxyUrl = "https://demo.nopcommerce.com/galaxy-s22-ultra";
        String url = Hooks.driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(url,galaxyUrl);
        soft.assertAll();
    }


}
