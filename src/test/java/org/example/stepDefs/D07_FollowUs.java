package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pomPages.P03_HomePage;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;

public class D07_FollowUs {

    P03_HomePage home = new P03_HomePage();


    @When("user opens facebook link")
    public void userOpensFacebookLink()
    {
        home.facebookLink.click();
    }




    @When("user opens twitter link")
    public void userOpensTwitterLink()
    {
        home.twitterLink.click();
    }

    @When("user opens rss link")
    public void userOpensRssLink()
    {
        home.rssLink.click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink()
    {
        home.youtubeLink.click();
    }

    @Then("Verify {string} is opened in new tab")
    public void verifyLinkIsOpenedInNewTab(String newSitelink)
    {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        String currentUrl = Hooks.driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(currentUrl,newSitelink);
        soft.assertAll();
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));

    }
}
