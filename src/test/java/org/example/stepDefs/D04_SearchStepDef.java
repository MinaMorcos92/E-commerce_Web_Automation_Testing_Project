package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pomPages.P03_HomePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_SearchStepDef {

    P03_HomePage home = new P03_HomePage();



    @When("user search with valid product name {string}")
    public void userSearchWithValidProductName(String arg0)
    {
      home.searchField.sendKeys(arg0);
      home.searchField.sendKeys(Keys.ENTER);
    }

    @Then("verify user find relative results {string}")
    public void verifyUserFindRelativeResults(String productName)
    {
        SoftAssert soft = new SoftAssert();
        String url = Hooks.driver.getCurrentUrl();
        soft.assertTrue(url.contains("https://demo.nopcommerce.com/search?q="));
        int count = home.searchResults.size();
        for (int i = 0; i < count; i++)
        {
            String searchResultText = home.searchResults.get(i).getText().toLowerCase();
            soft.assertTrue(searchResultText.contains(productName.toLowerCase()));
        }

        soft.assertAll();
    }


    @When("user search with valid {string}")
    public void userSearchWithValidSerialNumber(String arg0)
    {
        home.searchField.sendKeys(arg0);
        home.searchField.sendKeys(Keys.ENTER);
    }

    @And("click on the product from search reslt")
    public void clickOnTheProductFromSearchReslt()
    {
        home.productSkuResult.click();
    }

    @Then("verify user find the exact serial {string}")
    public void verifyUserFindTheExactSerial(String serialNumber)
    {
        String SKU =home.getSkuText.getText();
        Assert.assertEquals(SKU,serialNumber);
    }


}
