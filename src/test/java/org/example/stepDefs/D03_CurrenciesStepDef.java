package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pomPages.P03_HomePage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
import java.util.List;

public class D03_CurrenciesStepDef {

    P03_HomePage home = new P03_HomePage();

    @When("user select euro currency")
    public void userSelectEuroCurrency()
    {
        Select select = new Select(home.changeCurrency);
        select.selectByIndex(1);
    }

    @Then("euro symbol is displayed successfully on all four products")
    public void euroSymbolIsDisplayedSuccessfullyOnAllFourProducts()
    {
        int count = home.four_product_elements.size();

        for (int i = 0; i <count; i++)
        {
            String productsprice = home.four_product_elements.get(i).getText();
            System.out.println(productsprice);
            Assert.assertTrue(productsprice.contains("€"));
        }

    }
}

