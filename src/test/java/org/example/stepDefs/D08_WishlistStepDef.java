package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pomPages.P03_HomePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

public class D08_WishlistStepDef {

    P03_HomePage home = new P03_HomePage();

    @When("user add product")
    public void userAddProduct ()
    {
        home.wishListHtcButton.click();
    }


    @Then("success message is displayed")
    public void successMessageIsDisplayed()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(home.successMessageText.isDisplayed());
        String successMessageBackGround =home.successMessageBar.getCssValue("background-color");
        String backGrounColorHexa = Color.fromString(successMessageBackGround).asHex();
        soft.assertEquals(backGrounColorHexa,"#4bb07a");
        soft.assertAll();

    }

    @When("user add product and go to wishlist")
    public void userAddProductAndGoToWishlist()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        home.wishListHtcButton.click();
        wait.until(ExpectedConditions.invisibilityOf(home.successMessageBar));
        home.wishListBarButton.click();
    }

    @Then("Verify quantity more than zero")
    public void verifyQuantityIsMoreThanZero()
    {
        String qty = home.qtyNumber.getAttribute("value");
        System.out.println(qty);
        int qtyInt = Integer.parseInt(qty);
        System.out.println(qtyInt);
        Assert.assertTrue(qtyInt >=1);
    }
}
